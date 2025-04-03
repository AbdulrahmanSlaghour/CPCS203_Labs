public class Items {
    //***PROPERTIES***
    private String itemName;
    private double unitPrice;
    private int quantity;
    
    //***CONSTRUCTORS***
    public Items() {
    }
    
    public Items(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    
    
    //***METHODS***
    
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        return "Item Properties: [itemName= " + this.itemName + ", unitPrice= " + this.unitPrice + ", quantity= " + this.quantity;
    }
}
