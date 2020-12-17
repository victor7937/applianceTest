package by.victor.jwd.task01.dao.utils.parser.impl;

import by.victor.jwd.task01.dao.utils.parser.ApplianceParser;
import by.victor.jwd.task01.dao.utils.parser.OneLineParser;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OvenParser extends ApplianceParser {

    private final Map<Enum<?>, Object> ovenMap = new HashMap<>();
    public OvenParser (){}

    @Override
    public Map<Enum<?>, Object> parse(String expression) {
        Map<String,String> paramMap = OneLineParser.parseLine(expression);

        ovenMap.put(Oven.POWER_CONSUMPTION, Integer.parseInt(paramMap.get(Oven.POWER_CONSUMPTION.toString())));
        ovenMap.put(Oven.WEIGHT, Integer.parseInt(paramMap.get(Oven.WEIGHT.toString())));
        ovenMap.put(Oven.CAPACITY, Integer.parseInt(paramMap.get(Oven.CAPACITY.toString())));
        ovenMap.put(Oven.DEPTH, Integer.parseInt(paramMap.get(Oven.DEPTH.toString())));
        ovenMap.put(Oven.HEIGHT, Double.parseDouble(paramMap.get(Oven.HEIGHT.toString())));
        ovenMap.put(Oven.WIDTH, Double.parseDouble(paramMap.get(Oven.WEIGHT.toString())));

        return ovenMap;
    }
}
