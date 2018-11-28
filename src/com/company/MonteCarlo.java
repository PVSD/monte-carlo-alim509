package com.company;

import java.util.Random;

public class MonteCarlo {

    public double h;
    public double k;
    public double r;

    public double width;
    public double height;

    public double a;
    public double b;

    public MonteCarlo (double midWidth, double midHeight, double radius) {
        h = midWidth;
        k = midHeight;
        r = radius;

        width = 2 * midWidth;
        height = 2 * midHeight;
    }

    private Random rndm = new Random();

    public double nextRainDrop_x() {
        a = rndm.nextDouble() * (width) + (h + r - (2 * h));
        return a;
    }

    public double nextRainDrop_y() {
        b = rndm.nextDouble() * (height) + (k + r) - (2 * h);
        return b;
    }

    public boolean insideCircle(double x, double y) {
        if ((((x - h) * (x - h)) + ((y - k) * (y - k))) <= (r * r)) {
            return true;
        } else {
            return false;
        }
    }
}
