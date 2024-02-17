package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){
            sum = sum + i;
            if (sum > 100){
                System.out.println("i의 값 : " + i);
                break;
            }
            i++;

        }
    }
}
