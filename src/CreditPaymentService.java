public class CreditPaymentService {
    public double calculate(double termCreditMonths) {
        double summaCredit = 1_000_000;
        double procent = 9.99;

        double payment = summaCredit * (procent / 100 / 12 + (procent / 100 / 12 / (Math.pow((1 + procent / 100 / 12), termCreditMonths) - 1)));

        return payment;
    }
}
