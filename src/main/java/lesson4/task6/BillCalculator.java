package lesson4.task6;

public class BillCalculator {

    //presume that serviceCharge is in percentage
    public double calculate(double billValue, float serviceCharge) {
        double calculatedServiceCharge = (billValue * serviceCharge) / 100;
        double total = billValue + calculatedServiceCharge;
        return total;
    }

    //presume that serviceCharge/discount are in percentage
    public double calculate(double billValue, float serviceCharge, double discount) {
        double calculatedServiceCharge = (billValue * serviceCharge) / 100;
        double calculatedDiscount = (billValue * discount) / 100;
        double total = (billValue - calculatedDiscount) + calculatedServiceCharge;
        return total;
    }

    //presume that serviceCharge is in percentage
    public double calculate(double billValue, float serviceCharge, short takeawayCharge) {
        double calculatedServiceCharge = (billValue * serviceCharge) / 100;
        double total = billValue + calculatedServiceCharge + takeawayCharge;
        return total;
    }
}
