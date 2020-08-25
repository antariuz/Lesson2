// ----------------------------------------------------------------------------------
// должна включать в себя двери, колеса, мотор (enum), пассажира (отдельные классы),
// должна иметь состояние: количество пассажиров, максимум 5; начинать движение, заканчивать движение;
// увеличивать скорость, сбрасывать скорость, измерять скорость, максимум 100 км/час, высаживать пассажиров, подбирать.
// Двери в зависимости от местоположения создаются и нельзя две одинаковые засунуть
// Безобак может быть на 30, 50, 70 литров
// Метод toString в машине, должен показать состояние её
// Объем топлива в бензобаке, тип BigDecimal
// Ещё пусть в тачке будет поле recentActivityDate и меняй мне его в зависимости от изменений
// Выполнено: ++++++++++++++++++++++++++++++++++++++++++++
// Пасскажир должен содержать имя, возраст, пол
// Машина может поехать, только если есть хоть один пассажир старше 18
// Класс колеса, должен содержать тип резины(зима,лето, демисезон) и диаметр
// Естественно его можно заправлять (бензобак)
// Реализуй клонабле для колес
// В машину всунь бензобака и проверяй количество бензина

import java.util.Date;
import java.util.List;

public class Vehicle {

    private int passengerQuantity;
    private int currentSpeed;
    private List<Wheel> wheels;
    private List<Door> doors;
    private String engine;
    private int currentFuelVolume;
    private int fuelVolume;
    private Date recentActivityDate;

    public static class Door {
        //
    }

    public static class Wheel implements Cloneable {

        private String type;
        private int diameter;

    }

    public void setWheels(List<Wheel> wheels) {

    }

    public class Engine {
        // двигатель
    }

    public class Passenger {
        // пассажир

        private int age;
        private String name;
        private String surname;
        private String sex;
    }

    public static class Builder {

    }

    public class FuelTank {

        private int volume;
        private int currentFuelVolume;

        // volume = new BigDecimal;

    }

    public int refuel(int inFuel) {
        // заправка
        Vehicle.FuelTank currentFuelVolume = new FuelTank();
        currentFuelVolume += inFuel;

        return currentFuelVolume;
    }

    public String checkFuelVolume(int currentVolume) {
        // заправка
    }

    public void drive(boolean checkPassenger) {
        if (checkPassenger == true) {
            // движение
        } else System.out.println("В машине нет хотя бы одного водителя старше 18 лет");
    }

    public void pickUpPassenger(Passenger passenger) {
        // pick up
    }

    public void dropPassenger(Passenger passenger) {
        // drop passenger
    }

    public void speedUp(int currentSpeed) {
        //
    }

    public void speedDown(int currentSpeed) {
        //
    }

    public void checkSpeed(int currentSpeed) {
        //
    }

    private Date recentActivityDate

    {
        //
        return recentActivityDate;
    }

    @Override
    public String toString() {
        return
                "Quantity of Passengers: " + passengerQuantity + "\n" +
                "Current speed: " + currentSpeed + "\n" +
                "Level of Fuel: " + currentFuelVolume + "\n" +
                "Volume of Fuel Tank: " + fuelVolume + "\n" +
                "Last Activity Date: " + recentActivityDate + "\n"
                ;
    }

    public static void main(String[] args) {
        Vehicle currentCar = new Vehicle();
        Wheel wheels = new Wheel();
        currentCar.addWheel(wheel);
    }

}
