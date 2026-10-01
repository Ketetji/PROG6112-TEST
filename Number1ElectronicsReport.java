/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number1electronicsreport;

/**
 *     
 * @author Student
 */
public class Number1ElectronicsReport {
    
   public static void main(String[] args) {
        //cities
        String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};
        
        //Two dimensional array
        //Column 0= PS5 Column 1= XBOX Column 2= Switch
        int [][] sales = { {1000, 2000, 3000},
                           {2000, 3000, 4000},
                           {1500, 1100, 1200}
        };
        
        //Print report
        System.out.println("city\t\tPS5\tXBOX\tSWITCH\tTotal");
        //Most sales in total
        int highestTotal = 0;       
        //City with highest gaming sales
        String highestCity = "";
        
        for (int i=0; i< cities.length; i++) {
            int PS5 = sales[i][0];
            int XBOX = sales [i][1];
            int SWITCH = sales[i][2];
            int total = PS5 + XBOX + SWITCH;
            System.out.println(cities[i]+ "\t" +PS5 +"\t" +XBOX + "\t" + SWITCH+ "\t" + total);
            
            if(total > highestTotal) {
                highestTotal = total;
                highestCity = cities[i]; }
            }
        System.out.println("\nCity with highest gaming console sales: "+ highestCity+ "("+highestTotal +")");
                                                                                            
        }
    }
    

