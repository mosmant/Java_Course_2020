package Gun28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_SETS {
    public static void main(String[] args) {
        // SETS :  HashSet, LinkedHashSet, TreSet

        // Hash algoritmasına bağlı sıralamaya göre saklar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs); // hs = [dört, iki, bir, üç, beş]


        //Eklenme sırasına göre elemanları tutuyor.
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs); // lhs = [bir, iki, üç, dört, beş]

        //Alafabetik sıraya göre her eklemede saklar
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts); // ts = [beş, bir, dört, iki, üç]

        //sayısal soraya göre her eklemede saklar
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(5);
        ts2.add(89);
        ts2.add(3);
        ts2.add(17);
        ts2.add(1);
        System.out.println("ts2 = " + ts2); // ts2 = [1, 3, 5, 17, 89]



    }
}
