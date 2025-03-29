// Removed package declaration to match the directory structure



public class Regular extends Customer {
    // define discountRate=0.05 as constant
    private double discountRate = 0.05;
    //-------------------------------------
    public Regular()
    {
        
    }
    //--------------------------------------
    public Regular(String name,double purchasesCost)
    {
        super(name,purchasesCost);
    }
    //---------------------------------------
    //override getPurchasesCost as requested
    public double getPurchasesCost()
    {
        return super.getPurchasesCost() - (super.getPurchasesCost() * this.discountRate);
    }
    //---------------------------------------
    //override toString()as requested
    public String toString()
    {
        return "Customer name:"+ super.getName() +" , his/her purchases' Cost:"+ this.getPurchasesCost();
    }
}
