package poly.diamond;

public class Child implements InterfaceA,InterfaceB{

    @Override
    public void methodCommon() {
        System.out.println("Common");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }

    @Override
    public void methodA() {
        System.out.println("A");
    }
}
