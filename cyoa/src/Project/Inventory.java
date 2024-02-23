package Project;

public class Inventory {

    public static void main(String[] args) {
        Item s0 = new Item("Knife");
        // System.out.println(s0.getName());
        Item s1 = new Item("Banana Peel");
    }

    private Item[] inventory;

    public Inventory(int maxItemSize) {
        this.inventory = new Item[maxItemSize];
    }
    // creates an array of items. this is the inventory of the player.

    public String Hi() {
        return "true";
    }

    public boolean addItem(Item item) {
        for (int i = 0; i < this.inventory.length; i++) {
            if (this.inventory[i] == null) {
                this.inventory[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item getItem(int i) {
        if (this.inventory[i] == null || i >= this.inventory.length) {
            return null;
        } else {
            return this.inventory[i];
        }
    }

}
