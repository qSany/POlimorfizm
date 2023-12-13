import java.util.Objects;

public class Bicycle extends Transport {




    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        super.check();
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
