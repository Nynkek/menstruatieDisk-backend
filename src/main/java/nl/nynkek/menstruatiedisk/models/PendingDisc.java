package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@Entity
public class PendingDisc  {

    @Id
    @GeneratedValue
    private Long id;
    private String createdDate;
//    private User user;


    @ManyToOne
    @JoinColumn(name = "username")
    private User user;



}