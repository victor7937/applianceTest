package by.victor.jwd.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance {

    public TabletPC (){}

    private Integer batteryCapacity;
    private Integer displayInches;
    private Integer memoryRom;
    private Integer flashMemoryCapacity;
    private String color;

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(Integer displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(Integer flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public Integer getDisplayInches() {
        return displayInches;
    }

    public Integer getMemoryRom() {
        return memoryRom;
    }

    public Integer getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(batteryCapacity, tabletPC.batteryCapacity) &&
                Objects.equals(displayInches, tabletPC.displayInches) &&
                Objects.equals(memoryRom, tabletPC.memoryRom) &&
                Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
