import java.util.Objects;

abstract public class Transport implements ServiceStation  {
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }
@Override
public void check () {
    System.out.println("Обслуживаем " + getModelName());
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return wheelsCount == transport.wheelsCount && Objects.equals(modelName, transport.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public abstract void updateTyre();


}
