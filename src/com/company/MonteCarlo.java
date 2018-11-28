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

    private Random rndm = new Random();

    public MonteCarlo (double midWidth, double midHeight, double radius) {
        h = midWidth;
        k = midHeight;
        r = radius;

        width = 2 * midWidth;
        height = 2 * midHeight;
    }

    public double nextRainDrop_x() {
        a = (rndm.nextDouble() * (2*r)) + (h);
        return a;
    }

    public double nextRainDrop_y() {
        b = (rndm.nextDouble() * (2*r)) + (k);
        return b;
    }

    public boolean insideCircle(double x, double y) {
        if ((((x - h) * (x - h)) + ((y - k) * (y - k))) >= (r * r)) {
            return true;
        } else {
            return false;
        }
    }
}
