package Gun58.Ornek1;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava baklava=new Baklava();
        baklava.setName("Baklava");
        System.out.println(baklava);
        System.out.println("*****");
        baklava.madeIn();
        baklava.taste();
    }
}
