package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@Entity
@Table(name = "pending_discs")
public class PendingDisc {

    @Id
    @GeneratedValue
    private Long id;
    private String createdDate;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

     public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}