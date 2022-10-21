import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(int summa, int time) {
        double percent = 9.99 / 100 / 12;
        double payment;
        int timem = time * 12;
        double koffecient;
        double partKoefficientVStepeni;
        double partKoefficient;
        partKoefficient = 1 + percent;
        partKoefficientVStepeni = pow(partKoefficient, timem);
        koffecient = (percent * partKoefficientVStepeni) / (partKoefficientVStepeni - 1);
        payment = koffecient * summa;
        return payment;
    }

}




