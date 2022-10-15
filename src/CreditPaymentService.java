import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(int summa, int time) {
        double percent = 9.99 / 100 / 12;
        double payment;
        int timem = time * 12;
        double kof;
        double kkk;
        double kk;
        kk = 1 + percent;
        kkk = pow(kk, timem);
        kof = (percent * kkk) / (kkk - 1);
        payment = kof * summa;
        return payment;
    }

}




