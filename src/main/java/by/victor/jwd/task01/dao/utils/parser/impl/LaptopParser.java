package by.victor.jwd.task01.dao.utils.parser.impl;

import by.victor.jwd.task01.dao.utils.parser.ApplianceParser;
import by.victor.jwd.task01.dao.utils.parser.OneLineParser;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;

import java.util.HashMap;
import java.util.Map;

public class LaptopParser extends ApplianceParser {
    private final Map<Enum<?>, Object> LaptopMap = new HashMap<>();
    public LaptopParser (){}

    @Override
    public Map<Enum<?>, Object> parse(String expression) {
        Map<String,String> paramMap = OneLineParser.parseLine(expression);

        LaptopMap.put(Laptop.BATTERY_CAPACITY, Double.parseDouble(paramMap.get(Laptop.BATTERY_CAPACITY.toString())));
        LaptopMap.put(Laptop.OS, paramMap.get(Laptop.OS.toString()));
        LaptopMap.put(Laptop.MEMORY_ROM, Integer.parseInt(paramMap.get(Laptop.MEMORY_ROM.toString())));
        LaptopMap.put(Laptop.SYSTEM_MEMORY, Integer.parseInt(paramMap.get(Laptop.SYSTEM_MEMORY.toString())));
        LaptopMap.put(Laptop.CPU, Double.parseDouble(paramMap.get(Laptop.CPU.toString())));
        LaptopMap.put(Laptop.DISPLAY_INCHES, Integer.parseInt(paramMap.get(Laptop.DISPLAY_INCHES.toString())));

        return LaptopMap;
    }
    
}
