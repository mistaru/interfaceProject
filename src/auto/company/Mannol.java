package auto.company;

import auto.OilReleaseble;

public class Mannol extends  AbstractOil implements OilReleaseble {
    public Mannol(String name, String property) {
        super(name, property);
    }

    @Override
    public void releaseOil() {
        System.out.println("Я компания Манннол и теперь я могу выпускать авто масло");
    }
}
