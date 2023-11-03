package Practice_18.Ex_8;

import ForAll.Messages;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println("Try again!");
            getKey();
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "0")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Messages.printExNum("7");

        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey();
    }
}
