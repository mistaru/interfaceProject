package auto.company;

import auto.OilReleaseble;

public class Gazprom extends AbstractOil implements OilReleaseble {

    public Gazprom(String name, String property) {
        super(name, property);
    }

    @Override
    public void releaseOil() {
        System.out.println("Я компания Газпром и теперь я могу выпускать авто масло");
    }
}
