package Gun57.Ornek2;

public abstract class Sekil {
    private String name;

//    public Sekil()
//    {
//        System.out.println("calisti");
//    }
//
//    public Sekil(String name) {
//        this.name = name;
//    }

    abstract double alan();
    abstract double cevre();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ciz() {
        System.out.println(name+" şekli çizildi.");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan='" + Math.round(alan()) + '\'' +
                "cevre='" +Math.round(cevre()) + '\'' +
                '}';
    }
}
