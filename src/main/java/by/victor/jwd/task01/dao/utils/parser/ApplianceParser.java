package by.victor.jwd.task01.dao.utils.parser;

import java.util.Map;

public abstract class ApplianceParser {
    public abstract Map<Enum<?>,Object> parse(String expression);
}
