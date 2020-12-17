package by.victor.jwd.task01.dao.utils.parser.impl;

import by.victor.jwd.task01.dao.utils.parser.ApplianceParser;
import by.victor.jwd.task01.dao.utils.parser.OneLineParser;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;

import java.util.HashMap;
import java.util.Map;

public class TabletPCParser extends ApplianceParser {

    private final Map<Enum<?>, Object> TabletPCMap = new HashMap<>();

    public TabletPCParser (){}

    @Override
    public Map<Enum<?>, Object> parse(String expression) {
        Map<String,String> paramMap = OneLineParser.parseLine(expression);

        TabletPCMap.put(TabletPC.BATTERY_CAPACITY, Integer.parseInt(paramMap.get(TabletPC.BATTERY_CAPACITY.toString())));
        TabletPCMap.put(TabletPC.DISPLAY_INCHES, Integer.parseInt(paramMap.get(TabletPC.DISPLAY_INCHES.toString())));
        TabletPCMap.put(TabletPC.MEMORY_ROM, Integer.parseInt(paramMap.get(TabletPC.MEMORY_ROM.toString())));
        TabletPCMap.put(TabletPC.FLASH_MEMORY_CAPACITY, Integer.parseInt(paramMap.get(TabletPC.FLASH_MEMORY_CAPACITY.toString())));
        TabletPCMap.put(TabletPC.COLOR, paramMap.get(TabletPC.COLOR.toString()));

        return TabletPCMap;
    }
}
