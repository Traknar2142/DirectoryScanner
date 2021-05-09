package se.cma.directory_scanner_app.scanner;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatalogScan {
    private final List<File> readableFiles = new ArrayList();
    private final Comparator<File> fileNameComparator = Comparator.comparing(File::getName);

    public List<File> getReadableFilesSortByFileName(File file) {
        scanCatalog(file);
        readableFiles.sort(fileNameComparator);
        return readableFiles;
    }

    private void scanCatalog(File file) {
        if (file.isDirectory()){
            File[] children = file.listFiles();
            for (File childFile: children){
                scanCatalog(childFile);
            }
        }else{
            readableFiles.add(file);
        }
    }
}
