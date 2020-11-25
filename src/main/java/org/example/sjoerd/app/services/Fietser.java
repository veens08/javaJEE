package org.example.sjoerd.app.services;

import javax.inject.Inject;

public class Fietser {

    @Inject
    @File
    private Printer schermPrinter;

    /**
     * documentatie
     */
    public Fietser () {         // Constructor
    }

    public void gaatFietsen() {
        schermPrinter.print("Stapt op de fiets");
        schermPrinter.print("Fietst rondjes .....");
        schermPrinter.print("Stapt van de fiets af");
    }

}
