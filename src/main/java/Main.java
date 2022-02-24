
import models.Deal;
import services.Reader;
import services.ReaderCSV;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        final String fileName = "src/main/resources/Template.csv";
        Reader readerCSV =new ReaderCSV();
        try {
            File file = ReaderCSV.getResource(fileName);
            List<Deal> dealList=readerCSV.readFile(file);
            // quantity by trader
            Set<Integer> listTraderId = dealList.stream().map(Deal::getId).collect(Collectors.toSet());
            Map<Integer,Integer> quantityByTrader = new HashMap<>();
            for (int id : listTraderId){
                int quantity = dealList.stream().filter(s -> s.getId() == id).map(Deal::getNominal).reduce(Integer::sum).get();
                quantityByTrader.put(id,quantity);
            }
            // quantity by product
            Set<Integer> listProductId = dealList.stream().map(Deal::getProductId).collect(Collectors.toSet());
            Map<Integer,Integer> quantityByProduct = new HashMap<>();
            for (int id : listProductId){
                int quantity = dealList.stream().filter(s -> s.getProductId() == id).map(Deal::getNominal).reduce(Integer::sum).get();
                quantityByProduct.put(id,quantity);
            }
            // output:
            dealList.forEach(System.out::println);
            System.out.println("Quantité par produit : "+quantityByProduct);
            System.out.println("Quantité par trader : "+quantityByTrader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
