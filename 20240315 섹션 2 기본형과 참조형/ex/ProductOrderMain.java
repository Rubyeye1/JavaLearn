package ref.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] Products = new ProductOrder[Number];
        for (int i = 0; i< Products.length; i++){
            String productName = scanner.nextLine();
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            scanner.nextLine();
            Products[i] = createorder(productName, price, quantity);
        }

        printorder(Products);
        int totalAmount  = getTotalAmount(Products);
        System.out.println("총 결제 금액 : " + totalAmount);
    }
    static ProductOrder createorder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printorder(ProductOrder[] Products) {
        for (ProductOrder order : Products){
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] Products){
        int totalAmount = 0;
        for (ProductOrder order : Products) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
}
