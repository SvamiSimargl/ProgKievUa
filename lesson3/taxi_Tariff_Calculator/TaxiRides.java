package lesson3.taxi_Tariff_Calculator;

import lesson3.taxi_Tariff_Calculator.tariffs.TaxiTariff;

import java.util.ArrayList;
import java.util.List;

public class TaxiRides {
    private List<TaxiRide> rideList = new ArrayList<>();

    public void addNewRide(TaxiRide ride) {
        rideList.add(ride);
    }

    long getPrice(TaxiTariff tariff) {
        if (rideList.isEmpty()) {
            throw new IllegalStateException("There is no ride to calculate");
        } else {
            long totalPrice = 0;
            for (TaxiRide taxiRide : rideList) {
                totalPrice += tariff.calculatePrice(taxiRide);

            }
            return totalPrice;
        }
    }
}
