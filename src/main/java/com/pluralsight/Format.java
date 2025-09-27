package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName("Melendez","Iris"));

        String formattedName = formatName("Iris","Melendez");
        System.out.println(formattedName);

    }
    //i made a method string
    public static String formatName(String first, String last) {
        return last + ", " + first;

    }


    }