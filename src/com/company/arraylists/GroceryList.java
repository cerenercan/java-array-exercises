package com.company.arraylists;

import java.util.ArrayList;

public class GroceryList {

    private static ArrayList<String> groceryList = new ArrayList<>();

    public static ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public static void addGroceryItem(String item) {
        groceryList.add(item);

    }
    public static void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for(int i = 0 ; i < groceryList.size() ; i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public static void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    private static void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified to " + newItem + ".");
    }
    public static void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    private static void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    private static int findItem(String searchedItem){
        return groceryList.indexOf(searchedItem);
    }
    public static boolean inList(String searchItem){
        int position = findItem(searchItem);
        return position >= 0;
    }

}
