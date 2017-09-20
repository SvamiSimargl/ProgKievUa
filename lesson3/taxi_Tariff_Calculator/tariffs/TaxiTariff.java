package lesson3.taxi_Tariff_Calculator.tariffs;

import lesson3.taxi_Tariff_Calculator.TaxiRide;

public interface TaxiTariff {
    long calculatePrice(TaxiRide ride);
}
