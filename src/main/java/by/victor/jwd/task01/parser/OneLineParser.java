package by.victor.jwd.task01.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class OneLineParser {
    private static final String APPLIANCE_PARAM_PATTERN = "([a-zA-Z_]+)=([a-zA-Z0-9-\\.]+)";

    public static Map<String,String> parseLine (String line){
        Pattern applianceParam = Pattern.compile(APPLIANCE_PARAM_PATTERN);
        Matcher matcher = applianceParam.matcher(line);
        Map<String,String> paramMap = new HashMap<>();
        while (matcher.find())
            paramMap.put(matcher.group(1),matcher.group(2));
        return paramMap;
    }
}
