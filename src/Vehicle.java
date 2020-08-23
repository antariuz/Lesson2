public final class Vehicle {

    final private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public static void main(String[] args) {

        Vehicle car = new Vehicle(4);
        System.out.println("Object car has " + car.wheels + " wheels");

    }

}
