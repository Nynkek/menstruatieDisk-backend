package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@Entity
@Table(name = "discs")
public class Disc extends SuperDisc{

    public Disc(String name, String brand, String model, int width, int capacity, int rimWidth, boolean isReusable, boolean hasStem, String shape, String firmness, boolean isAvailableInNL, Material material) {
        super(name, brand, model, width, capacity, rimWidth, isReusable, hasStem, shape, firmness, isAvailableInNL, material);
    }

    public Disc() {

    }
}