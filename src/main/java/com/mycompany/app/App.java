package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
    
    public void dummyFunc() {
    	System.out.println("Nothing");
    }

    private final String getMessage() {
        return message;
    }

}
