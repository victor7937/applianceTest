package by.victor.jwd.task01.dao.utils.parser.impl;

import by.victor.jwd.task01.dao.utils.parser.ApplianceParser;
import by.victor.jwd.task01.dao.utils.parser.OneLineParser;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;

import java.util.HashMap;
import java.util.Map;

public class VacuumCleanerParser extends ApplianceParser {

    private final Map<Enum<?>, Object> VacuumCleanerMap = new HashMap<>();
    public VacuumCleanerParser (){}

    @Override
    public Map<Enum<?>, Object> parse(String expression) {
        Map<String,String> paramMap = OneLineParser.parseLine(expression);

        VacuumCleanerMap.put(VacuumCleaner.POWER_CONSUMPTION, Integer.parseInt(paramMap.get(VacuumCleaner.POWER_CONSUMPTION.toString())));
        VacuumCleanerMap.put(VacuumCleaner.FILTER_TYPE, paramMap.get(VacuumCleaner.FILTER_TYPE.toString()));
        VacuumCleanerMap.put(VacuumCleaner.BAG_TYPE, paramMap.get(VacuumCleaner.BAG_TYPE.toString()));
        VacuumCleanerMap.put(VacuumCleaner.WAND_TYPE, paramMap.get(VacuumCleaner.WAND_TYPE.toString()));
        VacuumCleanerMap.put(VacuumCleaner.MOTOR_SPEED_REGULATION, Integer.parseInt(paramMap.get(VacuumCleaner.MOTOR_SPEED_REGULATION.toString())));
        VacuumCleanerMap.put(VacuumCleaner.CLEANING_WIDTH, Integer.parseInt(paramMap.get(VacuumCleaner.CLEANING_WIDTH.toString())));

        return VacuumCleanerMap;
    }
}
