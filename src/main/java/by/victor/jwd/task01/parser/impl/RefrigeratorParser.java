package by.victor.jwd.task01.parser.impl;

import by.victor.jwd.task01.parser.ApplianceParser;
import by.victor.jwd.task01.parser.OneLineParser;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;

import java.util.HashMap;
import java.util.Map;

public final class  RefrigeratorParser extends ApplianceParser {
    private final Map<Enum<?>, Object> RefrigeratorMap = new HashMap<>();

    public RefrigeratorParser (){}

    @Override
    public Map<Enum<?>, Object> parse(String expression) {
        Map<String,String> paramMap = OneLineParser.parseLine(expression);

        RefrigeratorMap.put(Refrigerator.POWER_CONSUMPTION, Integer.parseInt(paramMap.get(Refrigerator.POWER_CONSUMPTION.toString())));
        RefrigeratorMap.put(Refrigerator.WEIGHT, Integer.parseInt(paramMap.get(Refrigerator.WEIGHT.toString())));
        RefrigeratorMap.put(Refrigerator.FREEZER_CAPACITY, Integer.parseInt(paramMap.get(Refrigerator.FREEZER_CAPACITY.toString())));
        RefrigeratorMap.put(Refrigerator.OVERALL_CAPACITY, Double.parseDouble(paramMap.get(Refrigerator.OVERALL_CAPACITY.toString())));
        RefrigeratorMap.put(Refrigerator.HEIGHT, Integer.parseInt(paramMap.get(Refrigerator.HEIGHT.toString())));
        RefrigeratorMap.put(Refrigerator.WIDTH, Integer.parseInt(paramMap.get(Refrigerator.WIDTH.toString())));

        return RefrigeratorMap;
    }
}
