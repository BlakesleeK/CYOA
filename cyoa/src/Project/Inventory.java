package Project;

public class Inventory {
    
    public static void main(String[] args) {
        Item x = new Item("Knife");
        Item y = new Item("Banana peel");
        
    }

    private Item[] inventory;


    public boolean addItem(Item item) {
        for (int i = 0; i < inventory.length; i ++) {
            if (inventory)=[i] == null) {
                inventory[i] = item;
                return true;
            }
        }
        return false;
    }
}
