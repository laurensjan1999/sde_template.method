package com.hz;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Console();
        Kaarten postKaarten = new PostKaarten(printer);
        Kaarten kerstKaarten = new KerstKaarten(printer);
        Kaarten geslaagdkaart = new Geslaagdkaart(printer);


        postKaarten.print();
        kerstKaarten.print();
        geslaagdkaart.print();
    }
}