public class Animal
{
    public String name;
    public String species;

    public Animal()
    {
        name = "John Doe";
        species = "Unknown";
    }

    public Animal(String iName, String iSpecies)
    {
        name = iName;
        species = iSpecies;
    }

    public void matingCall()
    {
        System.out.println("Generic sounds");
    }

    

}