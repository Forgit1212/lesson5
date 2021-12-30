package org.example.dz;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        String [] words = new String[]{
                "мороз",
                "улице",
                "минус",
                "носках",
                "сидели",
                "свитерах",
                "шерстяных",
                "носках",
                "сложена",
                "углу",
                "улице",
                "железной",
                "носках",
                "печки"
        };

        Set<String> set = new HashSet<>();
        Collections.addAll(set, words);
        System.out.println(set);


        Iterator<String> iter = set.iterator();
        int a = 0;
        while (iter.hasNext()) {
            String str = iter.next();
            for (String o:set) {
                if (str.equals(o)) {
                    a++;
                }
            }
            System.out.println("Слово "+str+" встречается "+a+" раз");
            a = 0;
        }
        //System.out.println(set );
    }
}
