package by.victor.jwd.task01.factory;

import by.victor.jwd.task01.entity.*;
import by.victor.jwd.task01.factory.customizers.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static by.victor.jwd.task01.entity.ApplianceType.*;


public class ApplianceFactory {

    private static final Map<ApplianceType, Supplier<Appliance>> templates = new HashMap<>();
    private static final Map<ApplianceType, Supplier<Customizer>> customizers = new HashMap<>();

    static {
        templates.put(OVEN, Oven::new);
        templates.put(LAPTOP, Laptop::new);
        templates.put(REFRIGERATOR, Refrigerator::new);
        templates.put(VACUUMCLEANER, VacuumCleaner::new);
        templates.put(TABLETPC, TabletPC::new);
        templates.put(SPEAKERS, Speakers::new);

        customizers.put(OVEN, OvenCustomizer::new);
        customizers.put(LAPTOP, LaptopCustomizer::new);
        customizers.put(REFRIGERATOR, RefrigeratorCustomizer::new);
        customizers.put(VACUUMCLEANER, VacuumCleanerCustomizer::new);
        customizers.put(TABLETPC, TabletPCCustomizer::new);
        customizers.put(SPEAKERS, SpeakersCustomizer::new);

    }

    private Appliance produceTemplate(ApplianceType ApplianceType){
        Supplier<Appliance> supplier = templates.get(ApplianceType);
        return supplier != null ? supplier.get() : null;
    }

    private Customizer getCustomizer(ApplianceType ApplianceType){
        Supplier<Customizer> supplier = customizers.get(ApplianceType);
        return supplier != null ? supplier.get() : null;
    }

    public Appliance produce (ApplianceType ApplianceType, Map<Enum<?>,Object> param) {
        Appliance template = produceTemplate(ApplianceType);
        Customizer customizer = getCustomizer(ApplianceType);
        if(customizer != null && template != null) {
            customizer.setAppliance(template);
            customizer.customizeAppliance(param);
            return customizer.getAppliance();
        }
        else return null;
    }
}
