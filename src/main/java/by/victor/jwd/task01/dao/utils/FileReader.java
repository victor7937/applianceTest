package by.victor.jwd.task01.dao.utils;

import by.victor.jwd.task01.entity.ApplianceType;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {

    private static final String delimiter = ":";

    public static List<String> getStrings (String applianceType, String filePath) throws IOException, URISyntaxException {
        List<String> resultLines = new ArrayList<>();

        try(Stream<String> lines = Files.lines(Paths.get(ClassLoader
                .getSystemResource(filePath).toURI()))){
            lines.filter(line -> line.contains(applianceType)).forEach(
                    line -> resultLines.add(line.split(delimiter)[1].strip())
            );
        }
        return resultLines;
    }
}
