package se.cma.directory_scanner_app.collector;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class ContentCollector {
    public String generateFinalString(List<File> readableFiles) throws IOException {
        StringBuilder contentString = new StringBuilder();
        List<List<String>> content = generateContentList(readableFiles);

        content.forEach(string -> string.forEach(contentString::append));

        return contentString.toString();
    }
    private List<List<String>> generateContentList(List<File> files){
        List <List<String>> contentList = files
                .stream()
                .map(file -> {
                    try {
                        return Files.readAllLines(file.toPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .collect(Collectors.toList());
        return  contentList;
    }
}
