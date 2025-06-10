package com.learn;

import java.beans.ConstructorProperties;

public class Processor {
    int core;
    String name;

    @ConstructorProperties({"core","name"})
    public Processor(int core, String name) {
        this.core = core;
        this.name = name;
    }

    public Processor() {
        System.out.println("Processor Created");
    }
}
