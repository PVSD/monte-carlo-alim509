package com.company;

public class Tester {

    public static void main(String[] args) {

        int cirCount = 0;
        int sqrCount = 0;
        MonteCarlo mcObj = new MonteCarlo (5,3, 2);

        for (int i = 0; i < 10000000; i++) {
            if (mcObj.insideCircle(mcObj.nextRainDrop_x(), mcObj.nextRainDrop_y())) {
                cirCount++;
            }
            sqrCount++;
        }

        System.out.println(cirCount * ((2*mcObj.r)*(2*mcObj.r)) / (sqrCount * (mcObj.r*mcObj.r)));

    }

}
