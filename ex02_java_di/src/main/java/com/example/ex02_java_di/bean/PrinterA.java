package com.example.ex02_java_di.bean;

public class PrinterA implements Printer{
    @Override
    public void print(String message) {
        System.out.println("Printer A : " + message);
    }
}
