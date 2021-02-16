package by.victor.jwd.task01.factory;

import by.victor.jwd.task01.entity.*;
import by.victor.jwd.task01.factory.customizer.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static by.victor.jwd.task01.entity.ApplianceType.*;


public final class ApplianceFactory {

    private static final Map<ApplianceType, Supplier<Appliance>> templates = new HashMap<>();
    private static final Map<ApplianceType, Supplier<Customizer>> customizers = new HashMap<>();

    private static final ApplianceFactory instance = new ApplianceFactory();

    public static ApplianceFactory getInstance() { return instance; }

    static {
        templates.put(Oven, Oven::new);
        templates.put(Laptop, Laptop::new);
        templates.put(Refrigerator, Refrigerator::new);
        templates.put(VacuumCleaner, VacuumCleaner::new);
        templates.put(TabletPC, TabletPC::new);
        templates.put(Speakers, Speakers::new);

        customizers.put(Oven, OvenCustomizer::new);
        customizers.put(Laptop, LaptopCustomizer::new);
        customizers.put(Refrigerator, RefrigeratorCustomizer::new);
        customizers.put(VacuumCleaner, VacuumCleanerCustomizer::new);
        customizers.put(TabletPC, TabletPCCustomizer::new);
        customizers.put(Speakers, SpeakersCustomizer::new);
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
        else {
            return null;
        }
    }
}
