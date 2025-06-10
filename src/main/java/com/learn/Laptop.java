package com.learn;

public class Laptop {
    int ram;
    Processor processor;
    public Laptop() {
        System.out.println("Laptop Created!");
    }
    public Laptop(int ram, Processor processor) {
        this.ram = ram;
        this.processor = processor;
    }
    public void compile(){
        System.out.println("Compiling using Laptop...");
    }
}
