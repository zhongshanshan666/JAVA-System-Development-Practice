package chapter3;

/*
 * Programming Assignment 4: Online shopping cart(Part 2) - ShoppingCart.java
 * @author shan shan zhong
 * @version 1.0
 */

import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getDate() {
        return this.currentDate;
    }

    public void addItem(ItemToPurchase itemToPurchase) {
        this.cartItems.add(itemToPurchase);
    }

    public void removeItem(String customerName) {
        int i;
        boolean isRemoved;

        isRemoved = false;
        for (i = 0; i < this.cartItems.size(); ++i) {
            if ((!isRemoved)&&(this.cartItems.get(i).getName().equals(customerName))) {
                this.cartItems.remove(i);
                isRemoved = true;
            }
        }

        if (!isRemoved) {
            System.out.println("Item not found in cart. Nothing removed.");
        }

    }

    public void modifyItem(ItemToPurchase itemToPurchase) {
        int i;
        boolean isModify;

        isModify = false;
        for (i = 0; i < this.cartItems.size(); ++i) {
            if ((!isModify)&&(itemToPurchase.getName().equals(this.cartItems.get(i).getName()))) {

                if (!itemToPurchase.getDescription().equals("none")) {
                    this.cartItems.get(i).setDescription(itemToPurchase.getDescription());
                }

                if (itemToPurchase.getPrice() != 0) {
                    this.cartItems.get(i).setPrice(itemToPurchase.getPrice());
                }

                if (itemToPurchase.getQuantity() != 0) {
                    this.cartItems.get(i).setQuantity(itemToPurchase.getQuantity());
                }

                isModify = true;
            }
        }

        if (!isModify) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart() {
        int numAllIQuantity;
        int i;

        numAllIQuantity = 0;
        for (i = 0; i < this.cartItems.size(); ++i) {
            numAllIQuantity += this.cartItems.get(i).getQuantity();
        }

        return numAllIQuantity;
    }

    public int getCostOfCart() {
        int numAllPrice;
        int i;

        numAllPrice = 0;
        for (i = 0; i < this.cartItems.size(); ++i) {
            numAllPrice += (this.cartItems.get(i).getPrice() * this.cartItems.get(i).getQuantity());
        }

        return numAllPrice;
    }

    public void printTotal() {
        int i;

        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart());
        System.out.println();

        if (this.cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
        }
        else
        {
            for (i = 0; i < this.cartItems.size(); ++i) {
                this.cartItems.get(i).printItemCost();
            }
        }

        System.out.println();
        System.out.println("Total: $" + getCostOfCart());
    }


    public void printDescriptions() {
        int i;
        String itemName;
        String itemDescription;

        System.out.println(this.customerName + "'s Shopping Cart - " + this.currentDate);
        System.out.println();
        System.out.println("Item Descriptions");

        for (i = 0; i < this.cartItems.size(); ++i) {
            itemName = this.cartItems.get(i).getName();
            itemDescription = this.cartItems.get(i).getDescription();
            System.out.println(itemName + ": " + itemDescription);
        }
    }
}

