package nl.nynkek.menstruatiedisk.dtos;

import nl.nynkek.menstruatiedisk.models.PendingDisc;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

public class UserDto {
    @NotBlank
    public String username;

    @NotBlank
    @Email
    public String emailAdress;

    @NotBlank
    @Size(min=6, max=30)
    public String password;

//    public List<Long> pendingDiscs;

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

//    public List<Long> getPendingDiscs() {
//        return pendingDiscs;
//    }
//
//    public void setPendingDiscs(List<Long> pendingDiscs) {
//        this.pendingDiscs = pendingDiscs;
//    }
}
