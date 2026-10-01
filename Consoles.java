 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number1electronicsreport;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles {
    protected String IconsoleType;
    protected String store;
    protected int sales;
    
    //Constructor initializes fields
    public Consoles(String iconsoleType, String store, int sales){
        this.IconsoleType = IconsoleType;
        this.store = store;
        this.sales = sales;
    }//
    //Implement interface methods
    
@Override
public String getIConsolesType() { 
    return IconsoleType;
}

@Override
public String getStore() {
    return store;
} // 
@Override
public int getTotalSales() {
    return sales;
    
}
}