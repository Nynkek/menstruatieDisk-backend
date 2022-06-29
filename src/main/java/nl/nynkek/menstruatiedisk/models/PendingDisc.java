package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@Entity
@Table(name = "pending_discs")
public class PendingDisc extends SuperDisc {

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
}
