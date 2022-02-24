
import models.Trader;
import services.Reader;
import services.ReaderCSV;
import java.io.File;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        final String fileName = "src/main/resources/Template.csv";
        Reader readerCSV =new ReaderCSV();
        try {
            File file = ReaderCSV.getResource(fileName);
            List<Object> traderList=readerCSV.readFile(file);
            traderList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
