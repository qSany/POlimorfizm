public class Main {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle("salut" ,2);
        Car car =new Car("volga" ,4);
        Truck truck=new Truck("Volva" ,6);
        System.out.println(bicycle);
        System.out.println(car);
        System.out.println(truck);
        System.out.println();
        bicycle.check();
        car.check();
        truck.check();

  }
}