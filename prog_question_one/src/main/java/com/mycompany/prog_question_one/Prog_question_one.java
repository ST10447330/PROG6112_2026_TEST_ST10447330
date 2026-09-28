/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_question_one;

/**
 *
 * @author emeris
 */
public class Prog_question_one {

    public static void main(String[] args) {
        
        /*
        creating the yearly sales for 3 different franchises,for three different gaming consoles PS5,Xbox,and nintendo
        */
        
        // Create Data Fields
     
        /*
        
        My declaration of array for CITY and CONSOLES 
        */
        // Print report header
        System.out.println("GAMING CONSOLE REPORT ");
        
        String[] city = {"CAPETOWN", "PORT ELIZABETH", "PETORIA"};
        String[] console = {"PS5", "XBOX", "SWITCH"};

        int[][] amount = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
   System.out.println("Display 1000: " + amount[0][0]);
        
        
        
        System.out.println("Display 1000: " + amount[2][1]);
        
       
       //Loop through the Rows of amounts for each city and console
        
        for (int row = 0; row < city.length; row++) {
            
        // Loops through the columns for our current row(specific row)
        
        for (int col = 0;col < amount[row].length; col++) {
        System.out.println(amount[row][col]  + "");
        
        } //The end of the inner loop
       System.out.println();
       //Start displaying the next row on another line
        // Determining and displaying the top-selling estate agent
        
        int topIndex = 0;
        for (int i = 1; i < amount.length; i++) {
            String[] totalamount = null;
            if (amount[i] > city[topIndex]) {
                topIndex = i;
            }
        }
        System.out.println("Top performing city: " + city[topIndex]);
       
       System.out.println("CITY WITH THE MOST SALES: PORT ELIZABETH ");
       
       
            
        }
    
    }
}
