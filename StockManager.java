package unkown;
import java.util.ArrayList;

public class StockManager {
    private ArrayList<Stock> stocks;

    public StockManager() {
        stocks = new ArrayList<>();
    }

    public void addStock(String name, int quantity, double price) {
        Stock newStock = new Stock(name, quantity, price);
        stocks.add(newStock);
        System.out.println("Stock added successfully");
    }

    public void removeStock(String name, int quantityToRemove) {
        for (Stock stock : stocks) {
            if (stock.getName().equals(name)) {
                stock.removeQuantity(quantityToRemove);
                System.out.println("Stock removed successfully");
                return;
            }
        }
        System.out.println("Stock not found");
    }

    public void viewStocks() {
        System.out.println("Current stocks:");
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }
}