package AimsProject;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski", 136, 19.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99);

        // Add DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);

        // Display the total cost
        System.out.println("Total cost: " + cart.totalCost());

        // Remove a DVD from the cart
        cart.removeDigitalVideoDisc(dvd1);

        // Display the updated total cost
        System.out.println("Total cost after removal: " + cart.totalCost());
    }
}

