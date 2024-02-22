package Project;

public class Item {
    private String name;
    private double price;
    private boolean taxable;

    public Item(String name, double price, boolean taxable) {
        this.name = name;
        this.price = price;
        this.taxable = taxable;
    }
    
    public String getName() {
        return this.name;
    }

    
}
