package Gun53.JavaPolymorphism.Anlatim;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }

    public void kokladı() {
        System.out.println("kokladı");
    }
}
