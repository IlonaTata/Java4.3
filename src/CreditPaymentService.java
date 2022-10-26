import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(int summa, int time) {
        double percent = 9.99 / 100 / 12;
        double payment;
        int timem = time * 12;
        double koeffecient;
        double partKoefficientInDegree;
        double partKoefficient;
        partKoefficient = 1 + percent;
        partKoefficientInDegree = pow(partKoefficient, timem);
        koeffecient = (percent * partKoefficientInDegree) / (partKoefficientInDegree - 1);
        payment = koeffecient * summa;
        return payment;
    }

}




