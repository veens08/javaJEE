package org.example.sjoerd.app.services;

import javax.inject.Inject;

public class Wandelaar {

    @Inject
    @Scherm
    private SchermPrinter schermPrinter;

    public Wandelaar() {            // Constructor
    }

    public void gaatWandelen() {
        schermPrinter.print("Hij doet zijn jas aan");
        schermPrinter.print("Dino wordt aangelijnd");
        schermPrinter.print("Pebbles wordt aangelijnd");
        schermPrinter.print("Hij wandeld een rondje .....");
        schermPrinter.print("Komt thuis");
        schermPrinter.print("Honden weer in de mand");
    }
}
