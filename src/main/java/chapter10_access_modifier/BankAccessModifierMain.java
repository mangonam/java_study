package chapter10_access_modifier;

import java.util.Scanner;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccessModifier bankAccessModifier01 = new BankAccessModifier();
        System.out.print("입금할 금액 입력/비밀번호 입력:");
        bankAccessModifier01.deposit(scanner.nextLong(), scanner.nextInt());
        System.out.print("출금할 금액 입력/비밀번호 입력:");
        bankAccessModifier01.withdraw(scanner.nextLong(), scanner.nextInt());
        System.out.print("계좌정보:");
        bankAccessModifier01.showAccountInfo();
    }
}
