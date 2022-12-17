import dish.Grater;
import dish.Pan;
import dog.DutchHund;
import dog.Hasky;
import furnetureShop.FurnitureShop;
import furnetureShop.Sofa;
import furnetureShop.Wardrobe;

public class Tester {
    public static void main(String[] args) {

        //  ==== DISH CLASS TEST =====
        Pan pan = new Pan(true, "black", 26);
        pan.fry("Eggs");
        pan.flip();
        pan.wash();
        pan.breakUp();

        Grater grater = new Grater(4, "black", 10);
        grater.grate("carrot");
        grater.turnOver();
        grater.wash();
        grater.breakUp();

        // ===== DOG CLASS TEST =====
        DutchHund dob = new DutchHund("Seb", 6);
        dob.sound();
        dob.defend();
        dob.sleep();

        Hasky shib = new Hasky("Shi", 7);
        shib.sound();
        shib.defend();
        shib.sleep();

        // ===== FURNITURE CLASS TEST =====
        Sofa sofa = new Sofa(2370, 1000, "white");
        System.out.println(sofa.toString());
        sofa.paint("green");
        sofa.setIsClean(false);
        System.out.println("\n" + sofa);

        Wardrobe wardrobe = new Wardrobe(2386, 2252, "grey");
        System.out.println(wardrobe);
        wardrobe.open();
        wardrobe.paint("blue");
        wardrobe.setIsClean(false);
        System.out.println("\n" + wardrobe);

        FurnitureShop shop = new FurnitureShop();
        shop.add(sofa);
        shop.add(wardrobe);
        shop.printGoods();
    }
}