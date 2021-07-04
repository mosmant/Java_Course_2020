package Gun56.Soru1;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {
        Tesla teslaCar=new Tesla("Model 5", 310);
        ToyotaPirus pirus=new ToyotaPirus("pirus", 1200);
        Bus bus=new Bus("IVECO",7000);

        System.out.println(teslaCar.changeBattery());
        System.out.println(bus.drive());

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(teslaCar);
        arabalar.add(pirus);
        arabalar.add(bus);

        for(Vehicle v : arabalar)
        {
            System.out.println("v = " + v);
            System.out.println("v.getClass().getSimpleName() = "
                    + v.getClass().getSimpleName());
        }
    }
}
