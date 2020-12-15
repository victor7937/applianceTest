package by.victor.jwd.task01.factory.customizers;


import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.Laptop;
import by.victor.jwd.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class LaptopCustomizer extends Customizer {

    private Laptop laptop;

    @Override
    public void setAppliance(Appliance Appliance) {
        this.laptop = (Laptop)Appliance;
    }

    @Override
    public Appliance getAppliance() {
        return laptop;
    }

    @Override
    public void customizeAppliance(Map<Enum<?>, Object> param) {
        laptop.setBatteryCapacity((Integer)param.get(SearchCriteria.Laptop.BATTERY_CAPACITY));
        laptop.setOs((String) param.get(SearchCriteria.Laptop.OS));
        laptop.setMemoryRom((Integer)param.get(SearchCriteria.Laptop.MEMORY_ROM));
        laptop.setSystemMemory((Integer)param.get(SearchCriteria.Laptop.SYSTEM_MEMORY));
        laptop.setCpu((Double) param.get(SearchCriteria.Laptop.CPU));
        laptop.setDisplayInches((Integer)param.get(SearchCriteria.Laptop.DISPLAY_INCHES));
    }
}
