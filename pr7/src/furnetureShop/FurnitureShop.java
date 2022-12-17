package furnetureShop;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> shop = new ArrayList<Furniture>();

    public void add(Furniture f) {
        shop.add(f);
    }

    public void remove(Furniture f) {
        shop.remove(f);
    }

    public void printGoods() {
        System.out.println("All our goods:\n");
        int number = 1;
        for (Furniture item : shop) {
            System.out.println(number + ". " + item + "\n");
            number++;
        }
        System.out.println("Total: " + shop.size() + " items.\n");
    }
}