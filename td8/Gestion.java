package td8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Gestion {

    public static int myMax(int... array) {
        if(array.length == 0)
            throw new IllegalArgumentException("Il doit y avoir au moins 1 argument");
        int max = 0;
        for(int i : array)
            if(i > max)
                max = i;
        return max;
    }

    public static <T extends Comparable<T>> T myMax(T... array) {
        if(array.length == 0)
            throw new IllegalArgumentException("Il doit y avoir au moins 1 argument");
        T max = array[0];
        for(T i : array)
            if(i.compareTo(max) > 0)
                max = i;
        return max;
    }


    public static void print(List<?> list) {
        for(Object o : list)
            System.out.println(o);
    }

    public static void printLength(List<? extends CharSequence> list) {
        list.forEach(e -> System.out.println(e + " " + e.length()));
    }

    

    public static List<?> listLength(List<?> l) {
        ArrayList length = new ArrayList();

        for(int i = 0; i < l.size(); i++) {
            CharSequence seq = (CharSequence)l.get(i);
            length.add(seq.length());
        }

        return length;
    }

    public static <T> List<T> fusion(List<? extends T> a,List<? extends T> b) throws Exception {
        if(a.size() < 0 || b.size() < 0)
            throw new Exception("Les listes sont vides");
        if(a.size() != b.size())
            throw new Exception("Les listes ne sont pas de meme taille");
        List<T> finale = new ArrayList<>();
        for(int i = 0; i < a.size(); ++i)
            if(i % 2 == 0)
                finale.add(a.get(i));
            else
                finale.add(b.get(i));
        return finale;
    }

    public static <T> void shuffle(List<T> l, int i, int j) {
        T tmp = l.get(i);
        l.set(i, l.get(j));
        l.set(j, tmp);
    }

    public static <T> void shuffle(List<T> list) {
        List<Integer> iChanged = new ArrayList<>();
        Random r = new Random();
        int rd = -1;
        int rd2 = -1;
        T tmp = null;
        while (iChanged.size() < list.size()) {
            rd = r.nextInt(list.size());
            if(iChanged.contains(rd))
                continue;
            rd2 = r.nextInt(list.size());
            if(iChanged.contains(rd2))
                continue;
            tmp = list.get(rd);
            list.set(rd, list.get(rd2));
            list.set(rd2, tmp);
            iChanged.add(rd);
            iChanged.add(rd2);
        }
    }
        
}