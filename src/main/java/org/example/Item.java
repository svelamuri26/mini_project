package org.example;


// Create a class Item with fields like id, name, and quantity.
class Item {
    private int id;
    private String name;
    int quantity;

    public Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", name='" + name + "', quantity=" + quantity + "}";
    }
}