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

public class Vehicle {

    private int passengerQuantity;
    private int currentSpeed;
    private List<Wheel> wheels;

    public class Doors {

    }

    public class Wheels implements Cloneable {

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
        private int currentVolume;

        // volume = new BigDecimal;



    }

    public int refuel (int inFuel){
        // заправка
        Vehicle.FuelTank currentVolume = new FuelTank();
        currentVolume += inFuel;

        return currentVolume;
    }

    public String checkFuelVolume (int currentVolume){
        // заправка
    }

    public void drive(boolean checkPassenger) {
        if (checkPassenger==true) {
            // движение
        } else System.out.println("В машине нет хотя бы одного водителя старше 18 лет");
    }

    public void pickUpPassenger(Passenger passenger){
        // pick up
    }

    public void dropPassenger(Passenger passenger){
        // drop passenger
    }

    public void speedUp(int currentSpeed){
        //
    }

    public void speedDown(int currentSpeed){
        //
    }

    public void checkSpeed(int currentSpeed){
        //
    }


}
