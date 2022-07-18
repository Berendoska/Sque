package ru.netology.SqueService;

public class SQRService {

    public int calcSqrt(int min, int max) {
        int count = 0;
        int b;
        for (b = 10; b < 100; b++) {
            if (b * b >= min) {
                if (b * b <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}
