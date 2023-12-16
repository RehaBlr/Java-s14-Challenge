import com.workintech.burger.enums.BreadRollType;
import com.workintech.burger.enums.CipsType;
import com.workintech.burger.enums.DrinkType;
import com.workintech.burger.model.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addAddition("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.FANTA),new Cips(CipsType.NORMAL));

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();
        Hamburger hamburger1 = new Hamburger("ham1",5, BreadRollType.DOUBLE_BURGER);
        hamburger.addAddition("cheese",1.1);

        hamburger.addAddition("tomato",0.5);

        hamburger.addAddition("carot",1.3);


    }
}