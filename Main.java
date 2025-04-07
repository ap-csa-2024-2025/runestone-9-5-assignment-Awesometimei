/**
 * The ShoppingCart class has an ArrayList of Items. You will write a new class
 * DiscountedItem that extends Item. This code is adapted from
 * https://practiceit.cs.washington.edu/problem/view/bjp4/chapter9/e10-DiscountBill
 */
public class Main
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal("Justin", "Human");
        a1.matingCall();

        Dog d1 = new Dog("Justin", "German Shepherd");
        d1.wagTail();
        d1.matingCall();

        Cat c1 = new Cat("Justin");
        System.out.println(c1.getLives());
        c1.matingCall();

        ShoppingCart cart = new ShoppingCart();
        cart.add(new Item("bread", 3.25));
        cart.add(new Item("milk", 2.50));

        cart.add(new DiscountedItem("ice cream", 4.50, 1.50));
         cart.add(new DiscountedItem("apples", 1.35, 0.25));

        cart.printOrder();
    }
}