package Gun56.Soru1;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo disel ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "Şehir içine girme, yavaş sür yolcuları rahatsız etme, can taşıyorsun";
    }
}
