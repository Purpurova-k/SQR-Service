package sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldCalculateSQR1() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = SQRService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateSQR2() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = SQRService.calculateSQR(200, 400);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSQR3() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = SQRService.calculateSQR(200, 200);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateSQR4() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = SQRService.calculateSQR(300, 400);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSQR5() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = SQRService.calculateSQR(100, 300);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateSQR6() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = SQRService.calculateSQR(300, 200);
        assertEquals(expected, actual);
    }
}
