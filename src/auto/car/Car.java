package auto.car;

import auto.OilReleaseble;

public class Car {
    String model;
    OilReleaseble oil;

    public Car(String model, OilReleaseble oil) {
        this.model = model;
        this.oil = oil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OilReleaseble getOil() {
        return oil;
    }

    public void setOil(OilReleaseble oil) {
        this.oil = oil;
    }


    public OilReleaseble printOilName(Car car) {
        return car.getOil();
    }


}
