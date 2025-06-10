package com.learn;

public class Laptop implements Computer {
    int ram;
    Processor processor;
    public Laptop() {
        System.out.println("Laptop Created!");
    }
    public Laptop(int ram, Processor processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public void compile(){
        System.out.println("Compiling using Laptop...");
    }
}
