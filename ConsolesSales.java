/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number1electronicsreport;

/**
 *
 * @author Student
 */
    
public class ConsolesSales extends Consoles {
    private int sales2;
    private int sales3;

    public ConsolesSales(String city, int sales1, int sales2, int sales3) {
        super("Gaming Console", city, sales1 + sales2 + sales3);
        this.sales2 = sales2;
        this.sales3 = sales3;
    }

    public void printConsolesSales() {
        System.out.println("City: " + getStore());
        System.out.println("Total Sales: " + getTotalSales());
        System.out.println("-------------------------");
    }  
}