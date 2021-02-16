package by.victor.jwd.task01.dao.util;

import by.victor.jwd.task01.filter.ApplianceFilter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public final class FileReader {

    private static final String DELIMITER = ":";

    public static List<String> getStringsByFilter (ApplianceFilter applianceFilter, String fileName) {
        boolean fileErrFlag = false;
        List<String> resultLines = new ArrayList<>();
        Stream<String> lines = null;
        try {
            URL url = ClassLoader.getSystemResource(fileName);
            if (url != null) {
                lines = Files.lines(Paths.get(url.toURI()));
                lines.filter(applianceFilter::filterExpression).forEach(line -> resultLines.add(line.split(DELIMITER)[1].strip()));
            }
        } catch ( URISyntaxException | IOException e) {
            fileErrFlag = true;
        } finally {
            if (lines != null) {
                lines.close();
            }
        }
        return fileErrFlag ? new ArrayList<>() : resultLines;
    }
}
