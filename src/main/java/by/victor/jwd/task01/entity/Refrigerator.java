package by.victor.jwd.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

    public Refrigerator (){}

    private Integer powerConsumption;
    private Integer weight;
    private Integer freezerCapacity;
    private Double overallCapacity;
    private Integer height;
    private Integer width;

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(Integer freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getFreezerCapacity() {
        return freezerCapacity;
    }

    public Double getOverallCapacity() {
        return overallCapacity;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(freezerCapacity, that.freezerCapacity) &&
                Objects.equals(overallCapacity, that.overallCapacity) &&
                Objects.equals(height, that.height) &&
                Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
