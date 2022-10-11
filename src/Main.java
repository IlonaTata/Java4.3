public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = (int) service.calculate (1000000,12);
        System.out.println(87911);

        int payment1 = (int) service.calculate (1000000,24);
        System.out.println(46140);

        int payment2 = (int) service.calculate (1000000,36);
        System.out.println(32262);
    }
}