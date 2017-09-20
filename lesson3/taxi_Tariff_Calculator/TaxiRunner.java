package lesson3.taxi_Tariff_Calculator;

import lesson3.taxi_Tariff_Calculator.tariffs.FamilyTariff;
import lesson3.taxi_Tariff_Calculator.tariffs.StandardTariff;

//Написать программу, которая подсчитывает стоимость поездок в такси в соответствии с различными тарифами.

public class TaxiRunner {
    public static void main(String[] args) {
        TaxiRides rides = new TaxiRides();
        rides.addNewRide(new TaxiRide(2,25,50));
        rides.addNewRide(new TaxiRide(5,10,15));

        System.out.println("Price per ride = " + rides.getPrice(new StandardTariff()) + " UAH");
        System.out.println("Price per ride = " + rides.getPrice(new FamilyTariff()) + " UAH");


    }
}
