package org.example.sjoerd.app.services;

import javax.enterprise.inject.Default;

@Scherm
public class SchermPrinter implements Printer {
    public void print(String tekst) {
        System.out.println ("Actie: " + tekst);
    }
}
