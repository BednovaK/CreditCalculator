public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        //Тест-кейс 1
        double terms12Months = service.calculate(12);
        System.out.println("Ежемесячный платёж на 1 год");
        System.out.println(Math.round(terms12Months));

        //Тест-кейс 2
        double terms24Months = service.calculate(24);
        System.out.println("Ежемесячный платёж на 2 года");
        System.out.println(Math.round(terms24Months));

        //Тест-кейс 3
        double terms36Months = service.calculate(36);
        System.out.println("Ежемесячный платёж на 3 года");
        System.out.println(Math.round(terms36Months));


    }
}
