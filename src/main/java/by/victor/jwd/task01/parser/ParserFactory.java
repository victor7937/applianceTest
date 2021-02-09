package by.victor.jwd.task01.parser;

import by.victor.jwd.task01.parser.impl.*;
import by.victor.jwd.task01.entity.ApplianceType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class ParserFactory {

    private static final ParserFactory instance = new ParserFactory();
    private static final Map<ApplianceType, Supplier<ApplianceParser>> parsers = new HashMap<>();

    static {
        parsers.put(ApplianceType.Oven, OvenParser::new);
        parsers.put(ApplianceType.Laptop, LaptopParser::new);
        parsers.put(ApplianceType.Refrigerator, RefrigeratorParser::new);
        parsers.put(ApplianceType.VacuumCleaner, VacuumCleanerParser::new);
        parsers.put(ApplianceType.TabletPC, TabletPCParser::new);
        parsers.put(ApplianceType.Speakers, SpeakersParser::new);
    }

    private ParserFactory (){}

    public static ParserFactory getInstance() {
        return instance;
    }

    public ApplianceParser getParser (ApplianceType applianceType){
        Supplier<ApplianceParser> supplier = parsers.get(applianceType);
        return supplier != null ? supplier.get() : null;
    }
}
