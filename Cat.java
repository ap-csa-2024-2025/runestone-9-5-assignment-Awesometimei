public class Cat extends Animal
{
    private int numLives = 9;

    public Cat(String iName)
    {
        super(iName, "Feline");
    }

    public int getLives()
    {
        return numLives;
    }
    
    public void matingCall()
    {
        System.out.println("Meow");
    }

}