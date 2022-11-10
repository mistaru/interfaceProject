package auto.company;

import auto.OilReleaseble;

public class Tottachi extends AbstractOil implements OilReleaseble {
    public Tottachi(String name, String property) {
        super(name, property);
    }

    @Override
    public void releaseOil() {
        System.out.println("Я компания Тотачи и теперь я могу выпускать авто масло");
    }

}
