package se.cma.directory_scanner_app;

import se.cma.directory_scanner_app.scanner.CatalogScan;
import se.cma.directory_scanner_app.collector.ContentCollector;
import se.cma.directory_scanner_app.writer.ContentWriter;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        File safeContentCatalog = new File(args[0]);
        File rootScanCatalog = new File(args[1]);

        CatalogScan catalogScan = new CatalogScan();
        ContentCollector contentCollector = new ContentCollector();
        ContentWriter contentWriter = new ContentWriter();

        String content = contentCollector.generateFinalString(catalogScan.getReadableFilesSortByFileName(rootScanCatalog));
        contentWriter.writeContentIntoFile(content, safeContentCatalog);
    }
}
