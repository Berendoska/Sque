package ru.netology.SqueService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test
    public void Sque() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}





