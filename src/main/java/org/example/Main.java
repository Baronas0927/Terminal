package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        String ltg = "1. Lietuvos Gelezinkeliai";
        String bank = "2. Bankas";
        String exit = "3. Iseiti is programos";
        System.out.println("Sveiki atvykę į Lietuvos Geležinkelių ir banko programą");
        System.out.println("Pasirinkite norimą programą: \n" + ltg + "\n" + bank + "\n" + exit);
        try{
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    LTG();
                    break;
                case 2:
                    Bankas();
                    break;
                case 3:
                    exit(0);
            }
        } catch (Exception e) {
            System.out.println("Atsirado klaida: " + e);
        }
    }

    private static void Bankas() {
        String seb = "1. SEB";
        String swedbank = "2. Swedbank";
        String luminor = "3. Luminor";
        double sebSaskaitosLikutis = 720.30;
        double swedbankSaskaitosLikutis = 620.50;
        double luminorSaskaitosLikutis = 430.70;
        try{
        System.out.println("Pasirinkite norima banka:\n " + seb + "\n" + swedbank + "\n" + luminor);
        Scanner bank = new Scanner(System.in);
        int y = bank.nextInt();
        switch (y){
            case 1:
                System.out.println(seb);
                break;
            case 2:
                System.out.println(swedbank);
                break;
            case 3:
                System.out.println(luminor);
                break;
        }} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void LTG(){
        System.out.println("Pasirinkite norima paslauga:");
        String informacija;
        boolean greitas;
        double bilietoKaina;
    }

}