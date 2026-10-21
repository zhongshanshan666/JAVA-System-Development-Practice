package chapter3;

/*
 * Programming Assignment 4: Online shopping cart(Part 2) - ShoppingCartManager.java
 * @author shan shan zhong
 * @version 1.0
 */

import java.util.Scanner;

public class ShoppingCartManager {

    public static char printMenu(ShoppingCart theCart, Scanner scnr) {
        char menuOp = ' ';
        String productName;
        String productDescription;
        int productPrice;
        int productQuantity;

        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println();

        while (menuOp != 'a' && menuOp != 'd' && menuOp != 'c' && menuOp != 'i' && menuOp != 'o' && menuOp != 'q') {
            System.out.println("Choose an option:");
            menuOp = scnr.next().charAt(0);

            switch (menuOp) {
                case 'a':
                    scnr.nextLine();
                    System.out.println("ADD ITEM TO CART");

                    System.out.println("Enter the item name:");
                    productName = scnr.nextLine();

                    System.out.println("Enter the item description:");
                    productDescription = scnr.nextLine();

                    System.out.println("Enter the item price:");
                    productPrice = scnr.nextInt();

                    System.out.println("Enter the item quantity:");
                    productQuantity = scnr.nextInt();

                    // 创建新商品对象并添加到购物车
                    ItemToPurchase newItem = new ItemToPurchase(productName, productDescription, productPrice, productQuantity);
                    newItem.setQuantity(productQuantity);
                    theCart.addItem(newItem);

                    System.out.println();

                    break;
                case 'd':
                    scnr.nextLine();
                    System.out.println("REMOVE ITEM FROM CART");
                    System.out.println("Enter name of item to remove:");
                    productName = scnr.nextLine();
                    theCart.removeItem(productName);

                    System.out.println();

                    break;
                case 'c':
                    scnr.nextLine();
                    System.out.println("CHANGE ITEM QUANTITY");
                    System.out.println("Enter the item name:");
                    productName = scnr.nextLine();

                    System.out.println("Enter the new quantity:");
                    productQuantity = scnr.nextInt();

                    // 创建临时对象用于修改商品数量
                    ItemToPurchase modItem = new ItemToPurchase();
                    modItem.setName(productName);
                    modItem.setQuantity(productQuantity);
                    theCart.modifyItem(modItem);

                    System.out.println();
                    break;
                case 'i':
                    // 输出商品描述
                    System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                    theCart.printDescriptions();
                    System.out.println();
                    break;
                case 'o':
                    // 输出显示购物车
                    System.out.println("OUTPUT SHOPPING CART");
                    theCart.printTotal();
                    System.out.println();
                    break;
            }
        }
        return menuOp;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String customerName;
        String currentDate;
        char menuChoice = ' ';

        System.out.println("Enter Customer's Name:");
        System.out.println("Enter Today's Date:");

        customerName = scnr.nextLine();
        currentDate = scnr.nextLine();

        ShoppingCart myCart = new ShoppingCart(customerName, currentDate);
        System.out.println();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Today's Date: " + currentDate);
        System.out.println();

        while (menuChoice != 'q') {
            menuChoice = printMenu(myCart, scnr);
        }
    }
}

