public final class Immutable {

    final private int wheels;

    public Immutable(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public static void main(String[] args) {

        Immutable car = new Immutable(4);
        System.out.println("Object car has " + car.wheels + " wheels");

    }

}
