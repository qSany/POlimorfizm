import java.util.Objects;

public class Truck extends Transport {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


    @Override
    public void check() {
        super.check();
        checkTrailer();
        checkEngine();
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}