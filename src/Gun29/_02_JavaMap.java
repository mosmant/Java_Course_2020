package Gun29;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        Map<String,String> elifKartvizit = new HashMap<>();
        elifKartvizit.put("isim", "Elif Grifflinberg");
        elifKartvizit.put("email", "elifgriff@hotmail.com");
        elifKartvizit.put("adres", "Cologne/Almanya");
        elifKartvizit.put("telefon", "0 176 980000");

        System.out.println("elifMap.get(isim) = " + elifKartvizit.get("isim"));
        System.out.println("elifMap.get(telefon) = " + elifKartvizit.get("telefon"));

        Map<String,String> glcnKartvizit = new HashMap<>();
        glcnKartvizit.put("isim", "Gülcan Grifflinberg");
        glcnKartvizit.put("email", "glcngriff@gmail.com");
        glcnKartvizit.put("adres", "Paris/France");
        glcnKartvizit.put("telefon", "0 143 9980000");

        System.out.println("glcnKartvizit.get(isim) = " + glcnKartvizit.get("isim"));
        System.out.println("glcnKartvizit.get(telefon) = " + glcnKartvizit.get("telefon"));

           //semih    kartviziti
        Map<String, Map<String,String>  >   kartvizitler=new HashMap<>();
        kartvizitler.put("elif", elifKartvizit);
        kartvizitler.put("gülcan", glcnKartvizit);

        System.out.println("elif in telefonu = " + kartvizitler.get("elif").get("telefon"));
        System.out.println("gülcan in bilgileri = " + kartvizitler.get("gülcan"));
        System.out.println("kartvizitler = " + kartvizitler);




    }
}


//elifMap.get(isim) = Gülcan Elif
//        semihMap.get(telefon) = 0 532 230000
//        glcnKartvizit.get(isim) = Gülcan Elif
//        glcnKartvizit.get(telefon) = 0 1546 750000
//        elif in telefonu = 0 532 230000
//        gülcan in bilgileri = {telefon=0 143 9980000, adres=Paris/France, email=elifgriff@hotmail.com, isim=Gülcan Elif}
//        kartvizitler = {gulcan={telefon=0 143 9980000, adres=Paris/France, email=elifgriff@hotmail.com, isim=Gülcan Elif}, elif={telefon=0 176 980000, adres=Cologne/Almanya, email=elifgriff@hotmail.com, isim=Gülcan Elif}}
