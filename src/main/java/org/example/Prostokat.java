package org.example;

public class Prostokat extends Figura2D{
    int[] numbers;
    protected Prostokat(int a,int b) throws Exception {
        if(a==0||b==0){
            throw new Exception("bok nie moze byc rowny 0");
        }
        else {
            numbers = new int[]{a, b, a, b};
        }
    }
    @Override
    protected double pole() {
        double result = numbers[0] * numbers[1];
        return result;
    }
    @Override
    protected int sum() {
        int result = numbers[0] + numbers[1]+ numbers[2]+numbers[3];
        return result;
    }
}
