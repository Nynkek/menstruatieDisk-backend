package nl.nynkek.menstruatiedisk.dtos;

import nl.nynkek.menstruatiedisk.models.FileUploadResponse;
import nl.nynkek.menstruatiedisk.models.Material;

public class PendingDiscDto {
    public Long id;
    public String createdDate;
    public String addedBy;
    public String name;
    public String brand;
    public String model;
    public int width = 0;
    public int capacity = 0;
    public int rimWidth = 0;
    public boolean isReusable = true;
    public boolean hasStem = false;
    public String designFeature;
    public String shape;
    public String firmness;
    public String linkToStore;
    public String linkToReview;
    public FileUploadResponse image;
    public boolean isAvailableInNL = false;
    public Material material;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
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

    public boolean isHasStem() {
        return hasStem;
    }

    public void setHasStem(boolean hasStem) {
        this.hasStem = hasStem;
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

    public FileUploadResponse getImage() {
        return image;
    }

    public void setImage(FileUploadResponse image) {
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
}
