package com.learn;

public class MainApp {
    String user;
    Laptop laptop;
    public MainApp() {
        System.out.println("Main Created!");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void code(){
        System.out.println("Coding...");
    }
}
