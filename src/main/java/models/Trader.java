package models;

import com.opencsv.bean.CsvBindByName;

public class Trader {
    @CsvBindByName(column = "TradeId")
    private int idTrade;
    @CsvBindByName(column = "Operation")
    private String operation;
    @CsvBindByName(column = "ProductId")
    private int productId;
    @CsvBindByName(column = "Nomminal")
    private double nominal;
    @CsvBindByName(column = "Price")
    private double price;
    public Trader(){}
    public Trader(int id, String operation, int productId, double nominal, double price) {
        this.idTrade = id;
        this.operation = operation;
        this.productId = productId;
        this.nominal = nominal;
        this.price = price;
    }

    public int getId() {
        return idTrade;
    }

    public String getOperation() {
        return operation;
    }

    public int getProductId() {
        return productId;
    }

    public double getNominal() {
        return nominal;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.idTrade = id;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "idTrader=" + idTrade +
                ", operation=" + operation +
                ", productId=" + productId +
                ", nominal=" + nominal +
                ", price=" + price +
                '}';
    }
}
