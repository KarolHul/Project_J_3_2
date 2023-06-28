package org.example;

public abstract class Figura3D extends Figura{

    protected Figura3D() {
        super();
    }

    @Override
    protected abstract double pole();

    @Override
    protected abstract int sum();

    protected abstract double objetosc();
}
