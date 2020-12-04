package com.hz;

public class KerstKaarten extends Kaarten {

    public KerstKaarten(Printer printer) {
        super(printer);
    }

    void printFooter() {
        this.printer.printLine("footer");
    }

    void printImage() {
        this.printer.printLine("kerstkaart");
    }

    void printMessage() {
        this.printer.printLine("goeie kerst");
    }

    void printHeader() {
        this.printer.printLine("header");
    }

}
