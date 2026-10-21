package chapter3;

import java.util.Scanner;


public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String itemName1;
        int itemPrice1;
        int itemQuantity1;

        String itemName2;
        int itemPrice2;
        int itemQuantity2;

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        itemName1 = scnr.nextLine();
        System.out.println("Enter the item price:");
        itemPrice1 = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity1 = scnr.nextInt();

        System.out.println();
        scnr.nextLine();
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        itemName2 = scnr.nextLine();
        System.out.println("Enter the item price:");
        itemPrice2 = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity2 = scnr.nextInt();

        ItemToPurchase item1 = new ItemToPurchase();
        item1.setName(itemName1);
        item1.setPrice(itemPrice1);
        item1.setQuantity(itemQuantity1);

        ItemToPurchase item2 = new ItemToPurchase();
        item2.setName(itemName2);
        item2.setPrice(itemPrice2);
        item2.setQuantity(itemQuantity2);

        System.out.println();
        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getQuantity() * item1.getPrice());
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getQuantity() * item2.getPrice());
        System.out.println();
        System.out.println("Total: $" + (item1.getQuantity() * item1.getPrice() + item2.getQuantity() * item2.getPrice()));

    }
}

