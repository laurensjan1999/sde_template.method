package com.hz;
import com.hz.Printer;
public abstract class Kaarten {

    protected Printer printer;

    public Kaarten(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    abstract void printFooter();
    abstract void printImage();
    abstract void printMessage();
    abstract void printHeader();

}
