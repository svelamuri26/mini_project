package org.example;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item(1, "Item 1", 10);
        Item item2 = new Item(2, "Item 2", 45);


        inventory.addItem(item1);
        inventory.addItem(item2);


        try {
            inventory.removeItem(1, 15);
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            inventory.removeItem(3, 1);
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}