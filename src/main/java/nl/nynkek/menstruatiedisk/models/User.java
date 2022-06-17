package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;

    @Column
    private String emailAdress;
    private String password;
    private String role = "gebruiker";

//    @OneToMany(mappedBy = "user")
//    private List<PendingDisc> pendingDiscs;

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


// keuzes: geen setter voor Role


//    public List<PendingDisc> getPendingDiscs() {
//        return pendingDiscs;
//    }
//
//    public void setPendingDiscs(List<PendingDisc> pendingDiscs) {
//        this.pendingDiscs = pendingDiscs;
//    }
}
