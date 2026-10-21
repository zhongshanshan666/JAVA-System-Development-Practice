package chapter3;

/*
 * Programming Assignment 4: Online shopping cart(Part 2) - ItemToPurchase.java
 * @author shan shan zhong
 * @version 1.0
 */

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "none";
    }

    public ItemToPurchase(String userItemName, String userItemDescription, int userItemPrice, int userItemQuantity) {
        this.itemName = userItemName;
        this.itemDescription = userItemDescription;
        this.itemPrice = userItemPrice;
        this.itemQuantity = userItemQuantity;
    }

    public void setName(String userItemName) {
        this.itemName = userItemName;
    }

    public String getName() {
        return this.itemName;
    }

    public void setPrice(int userPrice) {
        this.itemPrice = userPrice;
    }

    public int getPrice() {
        return this.itemPrice;
    }

    public void setQuantity(int userQuantity) {
        this.itemQuantity = userQuantity;
    }

    public int getQuantity() {
        return this.itemQuantity;
    }

    public void setDescription(String userItemDescription) {
        this.itemDescription = userItemDescription;
    }

    public String getDescription() {
        return this.itemDescription;
    }

    public void printItemCost() {
        System.out.println(this.getName() + " " + this.getQuantity() + " @ $" + this.getPrice() + " = $" + (this.getPrice() * this.getQuantity()));
    }

    public void printItemDescription() {
        System.out.println(this.getName() + ": " + this.getDescription());
    }

}

