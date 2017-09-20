package lesson3.taxi_Tariff_Calculator;


public class TaxiRide {
    private int passengers;
    private int distance;
    private int duration;

    public TaxiRide(int passengers, int distance, int duration) {
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
    }


    public int getPassengers() {
        return passengers;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }


}
