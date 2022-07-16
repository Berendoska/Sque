package ru.netology.SqueService;

public class SQRService {

    public int calcSqrt(int x, int y) {
        int count = 0;
        x = 200;
        y = 300;
        int b;
        for (b = 10; b < 100; b++) {
            if (b * b >= x) {
                if (b * b <= y) {
                    count++;
                }
            }
        }
        return count;
    }
}
