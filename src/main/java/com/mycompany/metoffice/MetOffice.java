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
        String[] months= new String[12];
        int[] temprature23 = new int[12];
        int[] temprature24 = new int[12];     
        System.out.println("Temprature in London, 2023-2024");
        
        months[0]="Jannuary";
        temprature23[0]= 8;
        temprature24[0]= 8;
        
        months[1]="February";
        temprature23[1]= 9;
        temprature24[1]= 8;
        
        months[2]="March";
        temprature23[2]= 12;
        temprature24[2]= 12;
        
        months[3]="April";
        temprature23[3]= 16;
        temprature24[3]= 17;
        
        months[4]="May";
        temprature23[4]= 18;
        temprature24[4]= 19;
        
        months[5]="June";
        temprature23[5]= 22;
        temprature24[5]= 20;
        
        months[6]="July";
        temprature23[6]= 24;
        temprature24[6]= 23;
        
        months[7]="August";
        temprature23[7]= 22;
        temprature24[7]= 22;
        
        months[8]="September";
        temprature23[8]= 20;
        temprature24[8]= 19;
        
        months[9]="October";
        temprature23[9]= 16;
        temprature24[9]= 16;
        
        months[10]="November";
        temprature23[10]= 12;
        temprature24[10]= 10;
        
        months[11]="December";
        temprature23[11]= 9;
        temprature24[11]= 8;
        
        
        //linear search
        /*String entername;
        Scanner I=new Scanner(System.in);
        System.out.println("Who are you looking for? ");
        entername = I.next();
        for(int i=0; i<12; ++){
            if (entername.equals(Classlist[i])){
            System.out.println("name found" +i);
            }
        }
        */
        //average
        /*int total=0;
        int average=0
        for (int i=0; i<12; i++){
            total = total+ agelist[i];
        }
        average = total/12;
        System.out.println(" the average temrature is :" average);
        */
        
    }
}