package org.example.metod;

import java.util.*;

public class MainApp {
    public static void main(String args[]) {
        HashMap<String, String> hm = new HashMap<>(); //HashMap
        hm.put(" Russia", " Moscow");
        hm.put(" France", " Paris");
        hm.put(" Germany", " Berlin");
        hm.put(" Norway", " Oslo");
        for (Map.Entry<String, String> o : hm.entrySet()) {
            System.out.println(o.getKey() + " : " + o.getValue());
        }
        hm.put(" Germany", " Berlin2");
        System.out.println(" New Germany Entry: " + hm.get(" Germany"));

        Set<String> set = new HashSet<>();              //HashSet
        set.add(" Aльфa");
        set.add(" Бета");
        set.add(" Aльфa");
        set.add(" Этa");
        set.add(" Гaммa");
        set.add(" Эпсилон");
        set.add(" Oмeгa");
        set.add(" Гaммa");
        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();
        set1.add(" Бета");
        set1.add(" Aльфa");
        set1.add(" Этa");
        set1.add(" Гaммa");
        set1.add(" Эпсилон");
        set1.add(" Aльфa");
        set1.add(" Oмeгa");
        System.out.println(set1);

        Set<String> set2 = new TreeSet<>();
        set2.add(" C");
        set2.add(" A");
        set2.add(" B");
        set2.add(" E");
        set2.add(" F");
        set2.add(" D");
        System.out.println(set2);

        List<String> list = new ArrayList<>();     //Итератор. Позволяет обойти все элементы коллекции.
        Iterator<String> iter = list.iterator();

        List<String> list1 = new ArrayList<>(Arrays.asList(" A", " B", " C", " C", " A", " A",
                "B", " C", " B")); //Удаление всех строк, содержащих " A".
        Iterator<String> iter1 = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals(" A")) {
                iter.remove();
            }

        List<String> list2 = new ArrayList<>(Arrays.asList(" A", " B", " C", " C", " A", " A",
                    "B", " C", " B"));
        ListIterator<String> iter2 = list.listIterator();//При работе с List
            // мы можем использовать “расширенный” вариант итератора
        }
        System.out.println(list);


        List<Cat> cats = new  ArrayList<>(Arrays.asList(
                new  Cat(" A",  5 ) , new  Cat(" B",  2 ) , new  Cat(" C",  4 )
        ));
        System.out.println(cats);
        Collections.sort(cats);
    }
}

