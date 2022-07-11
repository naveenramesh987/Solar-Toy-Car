public class Driver {
    public static void main(String[] args) {
        SolarToyCar car = new SolarToyCar();
        System.out.println(car.getBattery());
        car.turn(Direction.RIGHT, 45);
        System.out.println(car.getBattery());
        car.forward(30.0);
        System.out.println(car.getBattery());
        car.turnWithSolarEnergy(20.0);
        System.out.println(car.getBattery());
        car.moveWithSolarEnergy(100.0);
        System.out.println(car.getBattery());
        car.chargeBattery();
        System.out.println(car.getBattery());

    }
}
