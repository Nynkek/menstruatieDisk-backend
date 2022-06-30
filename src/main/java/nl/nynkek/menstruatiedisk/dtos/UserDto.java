package nl.nynkek.menstruatiedisk.dtos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import nl.nynkek.menstruatiedisk.models.Authority;

import java.util.Set;

public class UserDto {

    public String username;
    public String emailAdress;

    @JsonSerialize
    public Set<Authority> authorities;

    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }
}
