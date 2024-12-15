package org.example;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {
    //reiksmes, pasiekiamos visoje programoje
    static String ltg =  "1. Lietuvos Gelezinkeliai";
    static String bank = "2. Bankas";
    static String exit = "3. Iseiti is programos";
    static String info = "1. Informacija";
    static String likutis = "2. Likutis";
    static String blogasAts = "";
    static String Euro = "€";
    public static void main(String[] args) {
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
        double sebSaskaitosLikutis = Math.round(Math.random()*100);
        double swedbankSaskaitosLikutis = Math.round(Math.random()*100);
        double luminorSaskaitosLikutis = Math.round(Math.random()*100);
            try{
                System.out.println("Pasirinkite norima banka:\n " + seb + "\n" + swedbank + "\n" + luminor);
                Scanner bank = new Scanner(System.in);
                int y = bank.nextInt();
                switch (y){
                    case 1:
                        System.out.println(seb);
                        System.out.println("Pasirinkite norima paslauga:\n" + info + "\n" + likutis);
                        bank.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Pasirinkta informacijos paslauga");
                                break;
                            case 2:
                                System.out.println("Pasirinkta likučio atvaizdavimo paslauga. \n Dabartinis " +
                                        "SEB saskaitos likutis yra:" + sebSaskaitosLikutis + Euro);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println(swedbank);
                        System.out.println("Pasirinkite norima paslauga:\n" + info + "\n" + likutis);
                        bank.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Pasirinkta informacijos paslauga");
                                break;
                            case 2:
                                System.out.println("Pasirinkta likučio atvaizdavimo paslauga. \n Dabartinis " +
                                        "Swedbank saskaitos likutis yra:" + swedbankSaskaitosLikutis + Euro);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println(luminor);
                        System.out.println("Pasirinkite norima paslauga:\n" + info + "\n" + likutis);
                        bank.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Pasirinkta informacijos paslauga");
                                break;
                            case 2:
                                System.out.println("Pasirinkta likučio atvaizdavimo paslauga. \n Dabartinis " +
                                        "Luminor saskaitos likutis yra:" + luminorSaskaitosLikutis + Euro);
                                break;
                        }
                        break;
                    default:
                        System.in.read();
        }} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void LTG(){
        boolean greitas;
        double bilietoKaina;
        System.out.println("Pasirinkite norima paslauga:");
        System.out.println("1. Turimas bilietu kiekis");
        System.out.println("2. Pirkti bilietus");
        Scanner ltg = new Scanner(System.in);

    }

}