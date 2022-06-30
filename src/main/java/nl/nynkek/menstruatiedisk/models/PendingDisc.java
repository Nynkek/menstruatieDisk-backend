package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@Entity
@Table(name = "pending_discs")
public class PendingDisc extends SuperDisc {
    private String createdDate;
    private String addedBy;

    public String getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }
}
