package lesson8.task1;

import java.util.*;

public class Names {

    public static void removeDuplicateNames(Set<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("List without duplicates:");
        for (String name : uniqueNames) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }

    public static void replaceName(Set<String> names, String oldName, String newName) {
        names.remove(oldName);
        names.add(newName);
        System.out.println("\nList after replacing " + oldName + " to " + newName + ":");
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }

    public static void reverseOrder(Set<String> names) {
        System.out.println("\nList in reverse order:");
        List<String> reversedNames = new ArrayList<>(names);
        Collections.reverse(reversedNames);
        for (String name : reversedNames) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }

}