package Gun22;

public class _02_JavaMethod {

    public static void main(String[] args) {
        merhabaYaz();
        ismeMerhabaYaz("ismet"); // parametre gönderme
        ismeMerhabaYaz("ahmet");
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba");
    }

    public static void ismeMerhabaYaz(String isim) { // parametreyi tanımlama

        System.out.println("Merhaba " + isim.toUpperCase());

        // for while dowhile.....
    }

}


