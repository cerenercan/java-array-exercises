package com.company.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryListActions {
    private static Scanner scanner = new Scanner(System.in);
//    private static GroceryList groceryList = new GroceryList();

    public static void mainMethod(){
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    GroceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        GroceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item name: ");
        String newItem = scanner.nextLine();
        GroceryList.modifyGroceryItem(itemNo, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();
        GroceryList.removeGroceryItem(itemName);
    }
    public static void searchItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (GroceryList.inList(searchItem)){
            System.out.println("Found " + searchItem + " in the grocery list");
        } else {
            System.out.println(searchItem + " is not in the grocery list");
        }
    }
    private static void processArrayList() {
//        1st way of getting and copying an array-list into another array-list
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(GroceryList.getGroceryList());

//        2nd way of getting and copying an array-list into another array-list
        ArrayList<String> anotherArrayList = new ArrayList<>(GroceryList.getGroceryList());

//        Mapping an array-list into an array with its object type. In this case it is String.
        String [] myArray = new String[GroceryList.getGroceryList().size()];
        myArray = GroceryList.getGroceryList().toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
