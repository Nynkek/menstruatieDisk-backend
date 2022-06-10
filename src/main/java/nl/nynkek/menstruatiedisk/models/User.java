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
    private String role;

    @OneToMany(mappedBy = "user")
    private List<PendingDisc> pendingDiscs;
}
