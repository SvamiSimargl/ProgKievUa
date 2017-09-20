package lesson3.taxi_Tariff_Calculator.tariffs;

import lesson3.taxi_Tariff_Calculator.TaxiRide;

public class FamilyTariff implements TaxiTariff {
    public long calculatePrice(TaxiRide ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
