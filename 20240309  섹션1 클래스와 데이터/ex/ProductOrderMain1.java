package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] Products = new ProductOrder[3];
        ProductOrder P1 = new ProductOrder();
        P1.productName = "두부";
        P1.price = 2000;
        P1.quantity = 2;

        ProductOrder P2 = new ProductOrder();
        P2.productName = "김치";
        P2.price = 5000;
        P2.quantity = 1;

        ProductOrder P3 = new ProductOrder();
        P3.productName = "콜라";
        P3.price = 1500;
        P3.quantity = 2;

        Products[0] = P1;
        Products[1] = P2;
        Products[2] = P3;

        int totalprice = 0;
        for (ProductOrder P : Products) {
            System.out.println("상품명 : " + P.productName + " 가격 : " + P.price + " 수량 : " + P.quantity);
            totalprice += P.price * P.quantity;
            System.out.println(totalprice);
        }

    }
}
