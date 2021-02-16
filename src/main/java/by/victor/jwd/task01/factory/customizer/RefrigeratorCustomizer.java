package by.victor.jwd.task01.factory.customizer;



import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.Refrigerator;
import by.victor.jwd.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public final class RefrigeratorCustomizer extends Customizer{
    private Refrigerator refrigerator;

    @Override
    public void setAppliance(Appliance Appliance) {
        this.refrigerator = (Refrigerator) Appliance;
    }

    @Override
    public Appliance getAppliance(){
        return refrigerator;
    }

    @Override
    public void customizeAppliance(Map<Enum<?>,Object> param) {
        refrigerator.setPowerConsumption((Integer) param.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION));
        refrigerator.setWeight((Integer) param.get(SearchCriteria.Refrigerator.WEIGHT));
        refrigerator.setFreezerCapacity((Integer) param.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY));
        refrigerator.setOverallCapacity((Double) param.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY));
        refrigerator.setHeight((Integer) param.get(SearchCriteria.Refrigerator.HEIGHT));
        refrigerator.setWidth((Integer) param.get(SearchCriteria.Refrigerator.WIDTH));
    }
}
