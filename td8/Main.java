package td8;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(Gestion.myMax("Java","C++","Python"));
        List<String> l = Arrays.asList("toto","titi");
        List<String> lbis = Arrays.asList("tata","tutu");
        Gestion.print(l);
        Gestion.printLength(l);
        Gestion.listLength(l).forEach(item -> System.out.println(item));
        try {
            Gestion.fusion(l,lbis).forEach(item -> System.out.println(item));;
            System.out.println();
            List<String> l1= Arrays.asList ("C", "Tc");
            List<StringBuilder> l2= Arrays.asList (new StringBuilder ("a ma"), new StringBuilder ("he! "));
            List<? extends CharSequence> r1= Gestion.fusion(l1,l2);
            List<?> r2 = Gestion.fusion(l1,l2);
            List<Integer> l3 = Arrays.asList (1, 2) ;
            List<Integer> l4 = Arrays.asList (10,20) ;
            List<Integer> r3 = Gestion.fusion(l3,l4);
            List<?> r4 = Gestion.fusion(l1,l3) ;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}