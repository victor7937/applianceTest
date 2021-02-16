package by.victor.jwd.task01.factory.customizer;



import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.Oven;
import by.victor.jwd.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public final class OvenCustomizer extends Customizer{
    private Oven oven;

    @Override
    public void setAppliance(Appliance Appliance) {
        this.oven = (Oven)Appliance;
    }

    @Override
    public Appliance getAppliance(){
        return oven;
    }

    @Override
    public void customizeAppliance(Map<Enum<?>,Object> param) {
        oven.setPowerConsumption((Integer) param.get(SearchCriteria.Oven.POWER_CONSUMPTION));
        oven.setWeight((Integer) param.get(SearchCriteria.Oven.WEIGHT));
        oven.setCapacity((Integer) param.get(SearchCriteria.Oven.CAPACITY));
        oven.setDepth((Integer) param.get(SearchCriteria.Oven.DEPTH));
        oven.setHeight((Double) param.get(SearchCriteria.Oven.HEIGHT));
        oven.setWidth((Double) param.get(SearchCriteria.Oven.WIDTH));
    }

}
