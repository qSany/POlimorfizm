import java.util.Objects;

public class Car extends Transport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }



    @Override
    public void check() {
        super.check();
        checkEngine();
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}