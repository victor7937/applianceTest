package by.victor.jwd.task01.factory.customizers;



import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.TabletPC;
import by.victor.jwd.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public final class TabletPCCustomizer extends Customizer{
    private TabletPC tabletPC;

    @Override
    public void setAppliance(Appliance Appliance) {
        this.tabletPC = (TabletPC) Appliance;
    }

    @Override
    public Appliance getAppliance(){
        return tabletPC;
    }

    @Override
    public void customizeAppliance(Map<Enum<?>,Object> param) {
        tabletPC.setBatteryCapacity((Integer) param.get(SearchCriteria.TabletPC.BATTERY_CAPACITY));
        tabletPC.setDisplayInches((Integer) param.get(SearchCriteria.TabletPC.DISPLAY_INCHES));
        tabletPC.setMemoryRom((Integer) param.get(SearchCriteria.TabletPC.MEMORY_ROM));
        tabletPC.setFlashMemoryCapacity((Integer) param.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY));
        tabletPC.setColor((String) param.get(SearchCriteria.TabletPC.COLOR));
    }

}
