package org.example;

public class main {
    public static void main(String[] args) {
        Shirt S = new Shirt("Blue", 'M');
        S.putOn();

        System.out.println(S.color);
        System.out.println(S.Size);

    }
}

