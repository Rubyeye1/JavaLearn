package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int amount) {
        this.max = amount;
    }

    public void increment() {
        count += 1;
        if (count > max) {
            System.out.println("최대값을 초과할 수 없습니다");
            count -= 1;
        }
    }

    public int getCount() {
        return count;
    }

}
