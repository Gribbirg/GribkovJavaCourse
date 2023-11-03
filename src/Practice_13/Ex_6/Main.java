package Practice_13.Ex_6;

import ForAll.Messages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Messages.printExNum("6");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: "); // C:\\Users\\gribk\\IdeaProjects\\JavaCourse\\src\\Files\\text.txt
        String fileName = scanner.nextLine();

        String content = Files.readString(Path.of(fileName));

        System.out.println(getLine(new ArrayList<>(List.of(content.split(" ")))));
    }

    private static StringBuilder getLine(ArrayList<String> words) {

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>(words);

        stringBuilder.append(list.get(0));
        list.remove(0);
        boolean good;

        while (!list.isEmpty()) {
            good = false;
            for (String s : list) {
                if (s.toLowerCase().charAt(0) == stringBuilder.toString().toLowerCase().charAt(stringBuilder.length() - 1)) {
                    stringBuilder.append(" ").append(s);
                    list.remove(s);
                    good = true;
                    break;
                }
            }
            if (!good) {
                Collections.shuffle(words);
                return getLine(words);
            }
        }
        return stringBuilder;
    }
}
