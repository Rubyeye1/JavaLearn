package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 500;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else{
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : " + discount);

        if (true) // 중괄호를 안넣으면 뒤에 한 문장만 실행된다.
            System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행안됨");

    }
}
