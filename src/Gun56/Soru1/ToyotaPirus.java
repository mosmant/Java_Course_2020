package Gun56.Soru1;

public class ToyotaPirus extends Vehicle implements IElectric,IGas{

    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu değiştirmeden sür";
    }

    @Override
    public String changeOil() {
        return "30 lt benzinle ile 1000 km gider.";
    }

    @Override
    public String drive() {
        return "ilk 10 km elektrik kullanır.";
    }
}
