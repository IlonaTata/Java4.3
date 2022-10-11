public class CreditPaymentService {


    public double calculate(int summa, int time) {
        double percent = 9.99/100;
        double payment;

        double paymentAll = summa * percent;
        double summaAll = paymentAll + summa;
        payment = summaAll/time;


    return (int) payment; }
}
