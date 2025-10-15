package AimsProject;

import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();
    private int qtyOrdered = 0;

    // Method to add DVD to cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            itemsOrdered.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Method to remove DVD from cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.contains(disc)) {
            itemsOrdered.remove(disc);
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }

    // Method to calculate the total cost
    public double totalCost() {
        double total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }
}
