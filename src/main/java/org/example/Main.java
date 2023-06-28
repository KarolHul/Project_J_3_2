package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Prostokat prostokat = new Prostokat(4, 4);
        System.out.println(prostokat.sum());
        System.out.println(prostokat.pole());
        Kwadrat kwadrat = new Kwadrat(1);
        System.out.println(kwadrat.sum());
        System.out.println(kwadrat.pole());
        Prostopadloscian prostopadloscian = new Prostopadloscian(4,4,3);
        System.out.println(prostopadloscian.sum());
        System.out.println(prostopadloscian.pole());
        System.out.println(prostopadloscian.objetosc());
    }
}