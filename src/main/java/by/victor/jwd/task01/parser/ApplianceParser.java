package by.victor.jwd.task01.parser;

import java.util.Map;

public abstract class ApplianceParser {
    public abstract Map<Enum<?>,Object> parse(String expression);
}
