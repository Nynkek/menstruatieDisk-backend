package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@MappedSuperclass
abstract class SuperDisc {

    @Column
    private String name;
    private String brand;
    private String model;
    private int width = 0;
    private int capacity = 0;
    private int rimWidth = 0;
    private boolean isReusable = true;
    private String designFeature;
    private String shape;
    private String firmness;
    private String linkToStore;
    private String linkToReview;
    private String image;
    @Column(name="is_available_in_nl")
    private boolean isAvailableInNL = false;

    @Enumerated(EnumType.ORDINAL)
    private Material material;

}
