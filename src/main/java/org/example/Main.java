package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sveiki atvykę į Lietuvos Geležinkelių ir banko programą");
        System.out.println("Pasirinkite norimą programą:");
        System.out.println("1. Lietuvos Gelezinkeliai");
        System.out.println("2. Bankas");
        System.out.println("3. Išeiti iš programos");
        try{
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    LTG();
                case 2:
                    Bankas();
                case 3:
                    exit(0);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void Bankas() {
    }

    private static void LTG(){
        
    }

}