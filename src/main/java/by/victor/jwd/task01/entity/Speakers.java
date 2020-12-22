package by.victor.jwd.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {

    private static final long serialVersionUID = 3835330731492454628L;

    public Speakers(){}

    private Integer powerConsumption;
    private Integer numberOfSpeakers;
    private String frequencyRange;
    private Integer cordLength;

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(Integer numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(Integer cordLength) {
        this.cordLength = cordLength;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public Integer getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public Integer getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Objects.equals(powerConsumption, speakers.powerConsumption) &&
                Objects.equals(numberOfSpeakers, speakers.numberOfSpeakers) &&
                Objects.equals(frequencyRange, speakers.frequencyRange) &&
                Objects.equals(cordLength, speakers.cordLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }
}
