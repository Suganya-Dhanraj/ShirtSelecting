package org.example;

public class Shirt {
    public static String color;
    public static char Size;

    public Shirt(String newColor, char newSize) {
        this.color = newColor;
        this.Size = newSize;
    }

    public static void putOn() {
        System.out.println("shirt is on!");

    }

    public static void takeOff() {
        System.out.println("Shirt is ");
    }

    public static void SetColor(String newColor) {
        color = newColor;
    }

    public static void SetSize(char newSize) {
        Size = newSize;
    }

    public void setColor(String blue) {
        System.out.println("The color of the Shirt is:" + color);
    }

}

