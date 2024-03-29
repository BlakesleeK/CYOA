package Project;

public class Inventory {

    private Item[] inventory;

    public Inventory(int maxItemSize) {
        this.inventory = new Item[maxItemSize];
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

    public boolean isPresent(Item item) {
        boolean present = false;
        for (int i = 0; i < this.inventory.length; i++) {
            if (inventory[i] == item) {
                present = true;
                break;
            }
        }
        return present;
    }

    public String listInventory() {
        String wow = "";
        for (int i = 0; i < this.inventory.length; i++) {
            if (inventory[i] != null) {
                wow += inventory[i].getName();
            }
        }
        return wow;
    }

    public void removeAll() {
        for (int i = 0; i < this.inventory.length; i++) {
            inventory[i] = null;
        }
    }

}
