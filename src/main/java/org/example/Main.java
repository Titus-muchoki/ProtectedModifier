package org.example;

public class Main {
    private String name;
    private int number;
    private  String object;
    public Main() {
        name = "tito";
        number = 22;
        object = "laptop";
    }
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.name);
        System.out.println(myObj.number);
        System.out.println(myObj.object);
    }
}