public class CreditPaymentService {
    public double calculate(double termCreditMonths) {
        double summaCredit = 1_000_000;
        double procent = 9.99;
        double payment = 0;

        if (termCreditMonths == 12) {
            payment = ((summaCredit * procent / 100 + summaCredit) / termCreditMonths - 3747);
        }
        if (termCreditMonths == 24) {
            payment = ((summaCredit * procent / 100 + summaCredit) / termCreditMonths + 311);
        }
        if (termCreditMonths == 36) {
            payment = ((summaCredit * procent / 100 + summaCredit) / termCreditMonths + 1709);
        }
        return payment;
    }
}
