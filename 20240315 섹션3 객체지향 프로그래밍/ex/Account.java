package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
        if (balance < 0) {
            System.out.println("잔액 부족");
            balance += amount;
        }
    }

    void balanceShow(){
        System.out.println("잔고 : " + balance);
    }

}
