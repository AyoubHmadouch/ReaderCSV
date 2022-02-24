package services;

import com.opencsv.bean.CsvToBeanBuilder;
import models.Deal;

import java.io.*;
import java.util.List;

public class ReaderCSV implements Reader{

    public static String getResourcePath(String fileName) {
        final File file = new File("");
        return file.getAbsolutePath() + File.separator + fileName;
    }

    public static File getResource(String fileName) {
        final String completeFileName = getResourcePath(fileName);
        return new File(completeFileName);
    }
    @Override
    public List<Deal> readFile(File file) throws Exception {

        return new CsvToBeanBuilder<Deal>(new FileReader(file))
                .withType(Deal.class).
                build().
                parse();
    }
}
