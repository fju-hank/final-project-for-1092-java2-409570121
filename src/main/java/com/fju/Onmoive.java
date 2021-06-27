package com.fju;

import java.io.*;


public class Onmoive {
    public void moive(){
        try {
            FileInputStream F = new FileInputStream("C:/Users/recallgod/IdeaProjects/final-project-for-1092-java2-409570121/src/main/java/com/fju/onmovie.txt");
            InputStreamReader I = new InputStreamReader(F);
            BufferedReader B = new BufferedReader(I);
            String On = B.readLine();
            System.out.println(On);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
