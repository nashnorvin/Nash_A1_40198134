/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metoffice;

/**
 *
 * @author 40198134
 */
import java.util.Scanner;
public class MetOffice {

    public static void main(String[] args) {
        String[] months= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        int[] temprature23 = {8, 9, 12, 16, 18, 22, 24, 22, 20, 16, 12, 9};
        int[] temprature24 = {8, 9, 12, 17, 19, 20, 23, 22, 19, 16, 10, 8};   
        Scanner s = new Scanner (System.in); 
        String searchMonth;
        
        System.out.println("Temprature in London, 2023-2024");
       
        
        for (int i=0; i<12; i++){
            System.out.println("Month: "+ months[i] + " " + "Temprature in 2023: " + temprature23[i] + " " + "Temprature in 2024: "+ temprature24[i]);
        }
            
         //average temprature for 2023
        int total=0;
        int average=0;
        for (int i=0; i<12; i++){
            total = total+ temprature23[i];
        }
        average = total/12;
        System.out.println("The average temrature for 2023 is :" + average);
        
        //average temprature for 2024
        int total2=0;
        int average2=0;
        for (int i=0; i<12; i++){
            total = total+ temprature24[i];
        }
        average = total/12;
        System.out.println("The average temrature for 2024 is :" + average);
        
        //linear search
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