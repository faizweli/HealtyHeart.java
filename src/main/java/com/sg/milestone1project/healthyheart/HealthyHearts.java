/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.milestone1project.healthyheart;

import java.util.Scanner;

/**
 *
 * @author faizaweli
 */
public class HealthyHearts {
    public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);
    //Ask user age
     System.out.println("What is your age?");
     int age = userInput.nextInt();
     //Calculate max Heart and Target rates
     int maxHeartrate = 220 - age;
     int maxTargetrate = (int)Math.round(0.85 *maxHeartrate);
     int minTargetrate = (int)Math.round(0.5 * maxHeartrate);
     //Display results
     System.out.println("Your maximum heart rate should be " +maxHeartrate +" beats per minute");
     System.out.println("Your target HR Zone is " +minTargetrate +" - " +maxTargetrate +" beats per minute");
    }
}
