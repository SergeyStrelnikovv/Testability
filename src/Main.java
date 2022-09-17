public class Main {
    public static void main(String[] args) {

        int mils = 1;
        int cashTicket = 20;
        int allCash = 21;

        int amountMils;

        if (allCash >= cashTicket) {
            amountMils = allCash / cashTicket * mils;
        } else {
            amountMils = 0;
        }
        System.out.println("Вам начислено " + amountMils + " миль(я)");

    }
}
