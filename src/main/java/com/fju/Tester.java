package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Aladdin aladdin = new Aladdin();
        Dumbo dumbo = new Dumbo();
        Mermaid mermaid = new Mermaid();
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int discount=0;
        Time time = new Time();
        time.time();
        while(true){
            System.out.println("please ch your moive and type moivenumber");
            System.out.println("1.Aladdin");
            System.out.println("2.Dumbo");
            System.out.println("3.Mermaid");
            System.out.println("type 0 to leave");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("please type your count");
                int choicecount = scanner.nextInt();
                aladdin.count = choicecount;
                total = aladdin.count*aladdin.price;
                System.out.println(aladdin.menu + " " + "您購買的數量:" + aladdin.count + " " + "總額:" + total);
            }else if (choice == 2){
                System.out.println("please type your count");
                int choicecount = scanner.nextInt();
                dumbo.count = choicecount;
                total = dumbo.count*dumbo.price;
                System.out.println(dumbo.menu + " " + "您購買的數量:" + dumbo.count + " " + "總額:" + total);
            }else if (choice == 3){
                System.out.println("please type your count");
                int choicecount = scanner.nextInt();
                mermaid.count = choicecount;
                total = mermaid.count*mermaid.price;
                System.out.println(mermaid.menu + " " + "您購買的數量:" + mermaid.count + " " + "總額:" + total);
            }else if (choice == 0){
                System.out.println("have a good day");
                break;
            }else{
                System.out.println("error");
                break;
            }break;
        }
    }
}
