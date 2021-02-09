package by.victor.jwd.task01.factory.customizers;

import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.VacuumCleaner;
import by.victor.jwd.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public final class VacuumCleanerCustomizer extends Customizer {
    private VacuumCleaner vacuumCleaner;

    @Override
    public void setAppliance(Appliance Appliance) {
        this.vacuumCleaner = (VacuumCleaner) Appliance;
    }

    @Override
    public Appliance getAppliance(){
        return vacuumCleaner;
    }

    @Override
    public void customizeAppliance(Map<Enum<?>,Object> param) {
        vacuumCleaner.setPowerConsumption((Integer) param.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION));
        vacuumCleaner.setFilterType((String) param.get(SearchCriteria.VacuumCleaner.FILTER_TYPE));
        vacuumCleaner.setBagType((String) param.get(SearchCriteria.VacuumCleaner.BAG_TYPE));
        vacuumCleaner.setWandType((String) param.get(SearchCriteria.VacuumCleaner.WAND_TYPE));
        vacuumCleaner.setMotorSpeedRegulation((Integer) param.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION));
        vacuumCleaner.setCleaningWidth((Integer) param.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH));
    }

}
