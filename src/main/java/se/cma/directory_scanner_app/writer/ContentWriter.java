package se.cma.directory_scanner_app.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ContentWriter {
    public void writeContentIntoFile(String content, File safeContentCatalog) throws IOException {
        Path contentPath = safeContentCatalog.toPath().resolve("content.txt");
        BufferedWriter bufferedWriter =  Files.newBufferedWriter(contentPath, StandardCharsets.UTF_8);
        bufferedWriter.write(content);
        bufferedWriter.close();
    }
}
