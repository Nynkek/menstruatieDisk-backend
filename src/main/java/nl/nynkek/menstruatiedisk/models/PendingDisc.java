package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@Entity
@Table(name = "pending_discs")
public class PendingDisc extends SuperDisc {
    private String createdDate;
    private String addedBy;


    public PendingDisc(String name, String brand, String model, int width, int capacity, int rimWidth, boolean isReusable, boolean hasStem, String shape, String firmness, boolean isAvailableInNL, Material material) {
        super(name, brand, model, width, capacity, rimWidth, isReusable, hasStem, shape, firmness, isAvailableInNL, material);
    }

    public PendingDisc() {
        super();
    }

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
