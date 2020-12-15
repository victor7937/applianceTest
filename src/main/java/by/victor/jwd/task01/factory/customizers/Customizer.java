package by.victor.jwd.task01.factory.customizers;


import by.victor.jwd.task01.entity.Appliance;

import java.util.Map;

public abstract class Customizer {

    public abstract void setAppliance(Appliance appliance);
    public abstract Appliance getAppliance();
    public abstract void customizeAppliance(Map<Enum<?>,Object> param);

}
