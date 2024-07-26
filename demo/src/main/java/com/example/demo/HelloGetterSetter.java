package com.example.demo;

public class HelloGetterSetter {
    private String hello;
    private int lombok;

    HelloGetterSetter(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }

    public String getHello() {
        return this.hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public int getLombok() {
        return this.lombok;
    }

    public void setLombok(int lombok) {
        this.lombok = lombok;
    }

    public static void main(String[] args) {
        HelloGetterSetter helloGettController = new HelloGetterSetter("김삼남", 97);
        // helloGettController.setHello("김일남");
        // helloGettController.setLombok(99);

        System.out.println(helloGettController.getHello());
        System.out.println(helloGettController.getLombok());
    }
}
