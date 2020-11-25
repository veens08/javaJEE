package org.example.sjoerd.app.services;

@File
public class FilePrinter implements Printer{

    public void print(String tekst){
        System.out.println ("Print tekst naar file: " + tekst);
    }
}
