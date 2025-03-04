package unkown;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        int choice;

        do 
        {
            System.out.println("1. Add stock");
            System.out.println("2. Remove stock");
            System.out.println("3. View stock");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the stock name: ");
                    String name = input.next();
                    System.out.print("Enter the stock quantity: ");
                    int quantity = input.nextInt();
                    System.out.print("Enter the stock price: ");
                    double price = input.nextDouble();
                    stockManager.addStock(name, quantity, price);
                    break;

                case 2:
                    System.out.print("Enter the stock name: ");
                    String stockName = input.next();
                    System.out.print("Enter the quantity to remove: ");
                    int removeQuantity = input.nextInt();
                    stockManager.removeStock(stockName, removeQuantity);
                    break;

                case 3:
                    stockManager.viewStocks();
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }

        } while (choice != 4);
        
        input.close();
    }
}