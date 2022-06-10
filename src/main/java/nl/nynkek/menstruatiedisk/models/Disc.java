package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@Entity
public class Disc {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false, length = 255)
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
    private boolean isAvailableInNL = false;
    private String linkToStore;
    private String linkToReview;
    private String image;

    @Enumerated(EnumType.ORDINAL)
    private Material material;


}