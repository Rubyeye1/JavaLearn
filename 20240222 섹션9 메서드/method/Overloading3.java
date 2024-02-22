package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.2, 1.3));
    }



    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
