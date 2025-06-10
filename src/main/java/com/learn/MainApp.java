package com.learn;

public class MainApp {
    String user;
    Computer computer;
    public MainApp() {
        System.out.println("Main Created!");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void code(){
        System.out.println("Coding...");
        computer.compile();
    }
}
