import auto.OilReleaseble;
import auto.car.Car;
import auto.company.Gazprom;
import auto.company.Mannol;
import auto.company.Tottachi;

public class Main {
    public static void main(String[] args) {
        Mannol mannol = new Mannol("Масло маннол", "5/30");
        Gazprom gazprom = new Gazprom("Масло газпром", "10/30");
        Tottachi tottachi = new Tottachi("Масло тотачи", "10/40");
        Car car = new Car("Audi", gazprom);

        OilReleaseble oilReleaseble = car.printOilName(car);

        oilReleaseble.releaseOil();
    }
}