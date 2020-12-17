package by.victor.jwd.task01.dao.utils.parser.impl;

import by.victor.jwd.task01.dao.utils.parser.ApplianceParser;
import by.victor.jwd.task01.dao.utils.parser.OneLineParser;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;

import java.util.HashMap;
import java.util.Map;

public class SpeakersParser extends ApplianceParser {

    private final Map<Enum<?>, Object> SpeakersMap = new HashMap<>();
    public SpeakersParser (){}

    @Override
    public Map<Enum<?>, Object> parse(String expression) {
        Map<String,String> paramMap = OneLineParser.parseLine(expression);

        SpeakersMap.put(Speakers.POWER_CONSUMPTION, Integer.parseInt(paramMap.get(Speakers.POWER_CONSUMPTION.toString())));
        SpeakersMap.put(Speakers.NUMBER_OF_SPEAKERS, Integer.parseInt(paramMap.get(Speakers.NUMBER_OF_SPEAKERS.toString())));
        SpeakersMap.put(Speakers.FREQUENCY_RANGE, paramMap.get(Speakers.FREQUENCY_RANGE.toString()));
        SpeakersMap.put(Speakers.CORD_LENGTH, Integer.parseInt(paramMap.get(Speakers.CORD_LENGTH.toString())));


        return SpeakersMap;
    }
}
