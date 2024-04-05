package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("칰힌");
    }

    @Override
    public void fly() {
        System.out.println("치킨이 날다");
    }
}
