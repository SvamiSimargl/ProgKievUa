package lesson3.taxi_Tariff_Calculator.tariffs;

import lesson3.taxi_Tariff_Calculator.TaxiRide;

public class StandardTariff implements TaxiTariff {
    public long calculatePrice(TaxiRide ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
