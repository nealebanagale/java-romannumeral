package com.romannumeral;

import java.util.Scanner;

public class RomanNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int remainder = number;
        String romanNumeral = "";
        while (remainder != 0) {
            if(remainder >= 1000) {
                int quotient = remainder / 1000;
                String translatedNumber = translateToRomanNumeral('M', quotient, romanNumeral);
                romanNumeral = translatedNumber;
                remainder = remainder % 1000;
            } else if (remainder >= 500) {
                int quotient = remainder / 500;
                String translatedNumber = translateToRomanNumeral('D', quotient, romanNumeral);
                romanNumeral = translatedNumber;
                remainder = remainder % 500;
            } else if (remainder >= 100) {
                int quotient = remainder / 100;
                String translatedNumber = translateToRomanNumeral('C', quotient, romanNumeral);
                romanNumeral = translatedNumber;
                remainder = remainder % 100;
            } else if (remainder >= 50) {
                int quotient = remainder / 50;
                String translatedNumber = translateToRomanNumeral('L', quotient, romanNumeral);
                romanNumeral = translatedNumber;
                remainder = remainder % 50;
            } else if (remainder >= 10) {
                int quotient = remainder / 10;
                String translatedNumber = translateToRomanNumeral('X', quotient, romanNumeral);
                romanNumeral = translatedNumber;
                remainder = remainder % 10;
            } else if (remainder >= 5) {
                int quotient = remainder / 5;
                String translatedNumber = translateToRomanNumeral('V', quotient, romanNumeral);
                romanNumeral = translatedNumber;
                remainder = remainder % 5;
            } else if (remainder >= 1) {
                int quotient = remainder / 1;
                String translatedNumber = translateToRomanNumeral('I', quotient, romanNumeral);
                romanNumeral = translatedNumber;
                remainder = remainder % 1;
            }
        }
        System.out.println("Roman Numeral: " + romanNumeral);
    }
    static String translateToRomanNumeral(char ch, int count, String romanNumeral) {
        String res = romanNumeral;
        for (int i = 0; i < count; i++) {
            res = res + ch;
        }
        return res;
    }
}
