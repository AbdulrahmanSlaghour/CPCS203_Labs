// Removed package declaration to match the directory structure

import java.util.Scanner;
public class Customer {
    //Initialize the name with empty string  and the purchasesCost with zero
    private String name = "";
    private double purchasesCost = 0;
    //------------------------------
    public Customer ()
    {
        
    }
    //-------------------------------
    public Customer (String name,double purchasesCost)
    {
        this.name=name;
        this.purchasesCost=purchasesCost;
    }
    //--------------------------------
    public String getName()
    {
        return name;
    }
    //--------------------------------
    public void setName(String name) //changed parameter name from "String n" to "String name" to match documentation
    {
        this.name=name;
    }
    //--------------------------------
    public double getPurchasesCost()
    {
        return purchasesCost;
    }
    //--------------------------------
    public void setPurchasesCost(double purchasesCost) //changed parameter name from "double c" to "double purchasesCost" to match documentation
    {
        this.purchasesCost=purchasesCost;
    }
    //--------------------------------
    public void ReadCustInfo(Scanner in) { //added method to match documentation requirements
        

        
    }
    //--------------------------------
    public String toString()
    {
        return "Customer name:"+ name+" , his/her purchases' Cost:"+purchasesCost;
    }        
}
