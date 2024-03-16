package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User(); // 보통 자주 사용하는 클래스를 import 한다.
        pack.b.User USERb = new pack.b.User();
    }
}
