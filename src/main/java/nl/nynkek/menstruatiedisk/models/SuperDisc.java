package nl.nynkek.menstruatiedisk.models;

import javax.persistence.*;

@MappedSuperclass
abstract class SuperDisc {
    @Id
    @GeneratedValue
    Long id;

    @Column
    private String name;
    private String brand;
    private String model;
    private int width = 0;
    private int capacity = 0;
    private int rimWidth = 0;
    private boolean isReusable = true;
    private boolean hasStem = false;
    private String designFeature;
    private String shape;
    private String firmness;
    private String linkToStore;
    private String linkToReview;
    private String image;
    @Column(name = "is_available_in_nl")
    private boolean isAvailableInNL = false;

    @Enumerated(EnumType.ORDINAL)
    private Material material;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isHasStem() {
        return hasStem;
    }

    public void setHasStem(boolean hasStem) {
        this.hasStem = hasStem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRimWidth() {
        return rimWidth;
    }

    public void setRimWidth(int rimWidth) {
        this.rimWidth = rimWidth;
    }

    public boolean isReusable() {
        return isReusable;
    }

    public void setReusable(boolean reusable) {
        isReusable = reusable;
    }

    public String getDesignFeature() {
        return designFeature;
    }

    public void setDesignFeature(String designFeature) {
        this.designFeature = designFeature;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFirmness() {
        return firmness;
    }

    public void setFirmness(String firmness) {
        this.firmness = firmness;
    }

    public String getLinkToStore() {
        return linkToStore;
    }

    public void setLinkToStore(String linkToStore) {
        this.linkToStore = linkToStore;
    }

    public String getLinkToReview() {
        return linkToReview;
    }

    public void setLinkToReview(String linkToReview) {
        this.linkToReview = linkToReview;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isAvailableInNL() {
        return isAvailableInNL;
    }

    public void setAvailableInNL(boolean availableInNL) {
        isAvailableInNL = availableInNL;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setCreatedDate(String createdDate) {
    }
}
