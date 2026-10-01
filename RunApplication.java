/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number1electronicsreport;

/**
 *
 * @author Student
 */
public class RunApplication {
    public static void main (String [] args) {
        //create sample report
         
        ConsolesSales report1 = new ConsolesSales("Cape Town", 1000, 2000, 3000);
        ConsolesSales report2 = new ConsolesSales("Port Elizabeth", 2000, 3000, 4000);
        ConsolesSales report3 = new ConsolesSales("Pretoria", 1500, 1100, 1200);

        report1.printConsolesSales();
        report2.printConsolesSales();
        report3.printConsolesSales();  
    }
}
            
        
        
    
