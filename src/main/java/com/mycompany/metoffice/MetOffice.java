/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metoffice;

/**
 *
 * @author 40198134
 */
import java.util.Scanner;// scanner for the overall program
public class MetOffice {

    public static void main(String[] args) {
        String[] months= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};//Array for month
        int[] temprature23 = {8, 9, 12, 16, 18, 22, 24, 22, 20, 16, 12, 9};                                    //Array for temprature in 2023
        int[] temprature24 = {8, 8, 12, 17, 19, 20, 23, 22, 19, 16, 10, 8};                                    //Array for temprature in 2024
        Scanner s = new Scanner (System.in);                                                                   //Scanner to take the user input
        String searchMonth;                                                                                    //Variable used for the linear search
        
        System.out.println("Temprature in London, 2023-2024");
       
        //display line to display each month and tempratures using the for loop
        for (int i=0; i<12; i++){
            System.out.println("Month: "+ months[i] + " " + "Temprature in 2023: " + temprature23[i] + " " + "Temprature in 2024: "+ temprature24[i]);
        }
            
         //Calculating the average temprature for 2023
        int total1=0;
        int average1=0;
        for (int i=0; i<12; i++){
            total1 = total1+ temprature23[i];
        }
        average1 = total1/12;
        System.out.println("The average temrature for 2023 is :" + average1);
        
        //Calculating the average temprature for 2024
        int total2=0;
        int average2=0;
        for (int i=0; i<12; i++){
            total2 = total2+ temprature24[i];
        }
        average2 = total2/12;
        System.out.println("The average temrature for 2024 is :" + average2);
        
        //linear search to search for the months in the array
        String entername;
        System.out.println("Which month do you want to look for? ");
        searchMonth = s.next();
        for(int i=0; i<12; i++){
            if (searchMonth.equals(months[i])){
            System.out.println("Month found:"+ " " + months[i] + " " + "Temprature in 2023: " + temprature23[i] + " "+ "Temprature in 2024: " + temprature24[i]);
            }
        }
        
        
       
    }
}