package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for( ; ; ) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
