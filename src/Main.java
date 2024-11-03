public class Main {
    public static void main(String[] args) {
        double distance = 100;
        double carCost = TransportType.CAR.calculateTravelCost(distance);
        double busCost = TransportType.BUS.calculateTravelCost(distance);
        double truckCost = TransportType.TRUCK.calculateTravelCost(distance);
        System.out.println("Стоимость поездки на автомобиле:$" + carCost);
        System.out.println("Стоимость поездки на автобусе:$" + busCost);
        System.out.println("Стоимость поездки на грузовике:$" + truckCost);
    }
}