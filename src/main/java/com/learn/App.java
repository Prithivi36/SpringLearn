package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        MainApp app = (MainApp)context.getBean("app");
        app.code();

        Laptop laptop = (Laptop)context.getBean("lap");
        laptop.ram=8;
        //Singleton sing object on the whole
        //<bean id="lap" class="com.learn.Laptop" scope="prototype"></bean>  multiple object diff values for each
        Laptop laptop2 = (Laptop)context.getBean("lap");

        System.out.println(app.user);
    }
}
