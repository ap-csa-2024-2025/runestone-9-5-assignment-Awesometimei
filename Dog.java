public class Dog extends Animal
{
    private String breed;

    public Dog(String name, String iBreed)
    {
        super(name, "Canine");
        breed = iBreed;
    }

    public void wagTail()
    {
        System.out.println("Waggin");
    }

    public void matingCall()
    {
        System.out.println("Woof");
    }

}