package Practice_13.Ex_5;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("5");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер телефона: ");
        PhoneNumber phoneNumber = new PhoneNumber(scanner.nextLine());

        System.out.println(phoneNumber);
    }
}
