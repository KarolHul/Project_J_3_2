package org.example;

public class Kwadrat extends Figura2D{
    int[] numbers;
    public Kwadrat(int a) throws Exception {
        if(a==0){
            throw new Exception("bok nie moze byc rowny 0");
        }
        else {
            numbers = new int[]{a, a, a, a};
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
