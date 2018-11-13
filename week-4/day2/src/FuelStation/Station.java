package FuelStation;

public class Station {

    int gasAmount;

    public void refillCar(Car car){
        gasAmount -= car.capacity - car.gasAmount;
        car.gasAmount = car.capacity;
    }

}
