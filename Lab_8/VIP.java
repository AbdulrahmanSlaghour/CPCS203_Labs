// Removed package declaration to match the directory structure


public class VIP extends Customer {
    // define discountRate=0.1 as constant
    private double discountRate = 0.1;
    // define and initialize GiftCertivacateValue with zero
    private double GiftCertificateValue = 0;
    //-------------------------------------
    public VIP()
    {
        
    }
    //--------------------------------------
    public VIP(String name,double purchasesCost)
    {
        super(name,purchasesCost);
    }
    //---------------------------------------
    //add GiftCertivacate()that check if the PurchasesCost exceed 1000,
    //then a 100 will be added to GiftCertivacateValue and returned
    public double GiftCertificate() {
        if (this.getPurchasesCost() > 100) {
            this.GiftCertificateValue += 100;
            return GiftCertificateValue;
        }

        return GiftCertificateValue;
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
