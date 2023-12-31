package Practice_21;

import ForAll.Messages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Mass<T> {
    private ArrayList<T> mass;

    public Mass(ArrayList<T> mass) {
        this.mass = mass;
    }

    public T get(int index) {
        return mass.get(index);
    }

    public int getSize() {
        return mass.size();
    }

    public static ArrayList<String> getCatalog(String path) {
        File f = new File(path);
        String[] fArray = null;
        if (f.exists() || f.isDirectory()) fArray = f.list(null);
        else System.out.print("Папка не найдена");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(fArray));

        for (int i = 0; i < list.size(); i++) {
            if (i < 5) System.out.println(list.get(i));
        }
        return list;
    }

    private static <T> ArrayList<T> getList(T[] mass) {
        ArrayList<T> list = new ArrayList<>();
        for (T t : mass) list.add(t);
        return list;
    }

    public static void main(String[] args) {
        Messages.printExNum("1, 2, 3, 4");

        Mass<Double> mass = new Mass<>(getList(new Double[]{1.432, 2.123, 3.321, 4.4214}));
        for (int i = 0; i < mass.getSize(); i++) System.out.println(mass.get(i));
        System.out.println();

        getCatalog("C:\\Users\\gribk\\IdeaProjects\\JavaCourse\\src");
    }
}
