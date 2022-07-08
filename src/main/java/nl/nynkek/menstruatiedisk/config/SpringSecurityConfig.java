package nl.nynkek.menstruatiedisk.config;

import nl.nynkek.menstruatiedisk.filter.JwtRequestFilter;
import nl.nynkek.menstruatiedisk.services.CustomerUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomerUserDetailsService customUserDetailsService;

    @Autowired
    private JwtRequestFilter jwtRequestFilter;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/users/createUser/").permitAll()
                .antMatchers(HttpMethod.POST, "/users/createUser").permitAll()
                .antMatchers(HttpMethod.POST, "/users/createUser/**").permitAll()

                .antMatchers(HttpMethod.GET,"/users/").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/users/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/users/**").hasRole("ADMIN")

                .antMatchers(HttpMethod.GET, "/pendingdiscs/").hasAnyRole("BRAND", "ADMIN")
                .antMatchers(HttpMethod.POST, "/pendingdiscs/").hasAnyRole("BRAND", "ADMIN")
                .antMatchers(HttpMethod.DELETE, "/pendingdiscs/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/pendingdiscs").hasRole("ADMIN")


                .antMatchers(HttpMethod.GET, "/discs/").permitAll()
                .antMatchers(HttpMethod.POST,"/discs/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/discs/").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE,"/discs/**").hasRole("ADMIN")


                .antMatchers("/authenticated").authenticated()
                .antMatchers("/authenticate/").permitAll()
                .antMatchers("/authenticate").permitAll()

                .anyRequest().permitAll()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

    }

}