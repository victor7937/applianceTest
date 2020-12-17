package by.victor.jwd.task01.dao.utils.parser;

import by.victor.jwd.task01.dao.utils.parser.impl.OvenParser;
import by.victor.jwd.task01.entity.ApplianceType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class ParserFactory {

    private static final ParserFactory instance = new ParserFactory();
    private static final Map<ApplianceType, Supplier<ApplianceParser>> parsers = new HashMap<>();

    static {
        parsers.put(ApplianceType.Oven, OvenParser::new);
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
