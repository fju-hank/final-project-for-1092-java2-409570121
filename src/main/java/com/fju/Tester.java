package com.fju;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {
        Aladdin aladdin = new Aladdin();
        Dumbo dumbo = new Dumbo();
        Mermaid mermaid = new Mermaid();
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        Onmoive onmoive = new Onmoive();
        Time time = new Time();
        time.time();
        Calendar rightNow = Calendar.getInstance();
        int Hours = rightNow.get(Calendar.HOUR_OF_DAY);
        while (true) {
            System.out.println("please choice your moive and type moivenumber");
            System.out.println("1.Aladdin");
            System.out.println("2.Dumbo");
            System.out.println("3.Mermaid");
            System.out.println("4.退出選票系統");
            int choice = scanner.nextInt();
            if (Hours <= 12 || Hours == 0) {
                {
                    if (choice == 1) {
                        System.out.println("現在時間是" + Hours + "所以是早鳥優惠票價為120元");
                        System.out.println("please type your count number:");
                        int choicecount = scanner.nextInt();
                        aladdin.count = choicecount;
                        total = aladdin.count * (aladdin.price-30);
                        System.out.println(aladdin.menu + " " + "您購買的數量:" + aladdin.count + " " + "總額:" + total);
                        onmoive.moive();
                    } else if (choice == 2) {
                        System.out.println("現在時間是" + Hours + "所以是早鳥優惠票價為120元");
                        System.out.println("please type your count number:");
                        int choicecount = scanner.nextInt();
                        dumbo.count = choicecount;
                        total = dumbo.count * (dumbo.price-30);
                        System.out.println(dumbo.menu + " " + "您購買的數量:" + dumbo.count + " " + "總額:" + total);
                        onmoive.moive();
                    } else if (choice == 3) {
                        System.out.println("現在時間是" + Hours + "所以是早鳥優惠票價為120元");
                        System.out.println("please type your count number:");
                        int choicecount = scanner.nextInt();
                        mermaid.count = choicecount;
                        total = mermaid.count * (mermaid.price-30);
                        System.out.println(mermaid.menu + " " + "您購買的數量:" + mermaid.count + " " + "總額:" + total);
                        onmoive.moive();
                    } else if (choice == 4) {
                        System.out.println("have a good day");
                        break;
                    } else {
                        System.out.println("error");
                        break;
                    }
                }
            }
            else if (Hours < 12 || Hours <= 24) {
                if (choice == 1) {
                    System.out.println("現在時間是" + Hours + "所以是晚上一般票為150元");
                    System.out.println("please type your count number:");
                    int choicecount = scanner.nextInt();
                    aladdin.count = choicecount;
                    total = aladdin.count * aladdin.price;
                    System.out.println(aladdin.menu + " " + "您購買的數量:" + aladdin.count + " " + "總額:" + total);
                    onmoive.moive();
                } else if (choice == 2) {
                    System.out.println("現在時間是" + Hours + "所以是晚上一般票為150元");
                    System.out.println("please type your count number:");
                    int choicecount = scanner.nextInt();
                    dumbo.count = choicecount;
                    total = dumbo.count * dumbo.price;
                    System.out.println(dumbo.menu + " " + "您購買的數量:" + dumbo.count + " " + "總額:" + total);
                    onmoive.moive();
                } else if (choice == 3) {
                    System.out.println("現在時間是" + Hours + "所以是晚上一般票為150元");
                    System.out.println("please type your count number:");
                    int choicecount = scanner.nextInt();
                    mermaid.count = choicecount;
                    total = mermaid.count * mermaid.price;
                    System.out.println(mermaid.menu + " " + "您購買的數量:" + mermaid.count + " " + "總額:" + total);
                    onmoive.moive();
                } else if (choice == 4) {
                    System.out.println("have a good day");
                    break;
                } else {
                    System.out.println("error");
                    break;
                }
            }break;
        }
    }
}




