package sqr;

public class SQRService {
    public static int calculateSQR(int downLimit, int upLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= downLimit && i * i <= upLimit) {
                counter = counter + 1;
            }
        }
//            System.out.println("Количество чисел: " + counter);
        return counter;
    }
}
