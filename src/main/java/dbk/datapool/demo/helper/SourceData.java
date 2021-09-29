package dbk.datapool.demo.helper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reading json file from existing file in class path
 * @author vlad vasilev
 */
public class SourceData {

    /**
     * Static method for obtaining of json file as string
     * @param fileName Provided file name for retrieving as string
     * @return json file as string
     */
    public static String asString(String fileName) {
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(ClassLoader.getSystemResource(fileName).toURI()));
            return lines.collect(Collectors.joining());

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
