package by.victor.jwd.task01.dao.utils;

import by.victor.jwd.task01.filter.ApplianceFilter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public final class FileReader {

    private static final String DELIMITER = ":";

    public static List<String> getStringsByFilter (ApplianceFilter applianceFilter, String fileName) throws IOException, URISyntaxException {
        List<String> resultLines = new ArrayList<>();

        try(Stream<String> lines = Files.lines(Paths.get(ClassLoader
                .getSystemResource(fileName).toURI()))){
            lines.filter(applianceFilter::filterExpression).forEach(
                    line -> resultLines.add(line.split(DELIMITER)[1].strip()));
        }
        return resultLines;
    }
}
