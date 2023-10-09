package org.example;
import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int itemId, int quantity) throws ItemNotFoundException, InsufficientStockException {
        Item foundItem = null;

        for (Item item : items) {
            if (item.getId() == itemId) {
                foundItem = item;
                break;
            }
        }

        if (foundItem == null) {
            throw new ItemNotFoundException("Item with id " + itemId + " not found.");
        }

        if (foundItem.getQuantity() < quantity) {
            throw new InsufficientStockException("Not enough items in stock for item with id " + itemId + ".");
        }

        foundItem.quantity -= quantity;
    }
}



