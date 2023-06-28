package org.example;

public class Prostopadloscian extends Figura3D{
    int[] numbers;
    protected Prostopadloscian(int a,int b,int c) throws Exception {
        if(a==0||b==0||c==0){
            throw new Exception("bok nie moze byc rowny 0");

        }
        else {
            numbers = new int[]{a, b, c, a, b, c, a, b, c, a, b, c};
        }
    }

    @Override
    protected double pole() {
        double result = numbers[0] * numbers[1];
        return result;
    }

    @Override
    protected int sum() {
        int result = (numbers[0] + numbers[1]+numbers[3])*4;
        return result;
    }

    @Override
    protected double objetosc() {
        double result = numbers[0] * numbers[1] * numbers[2];
        return result;
    }
}
