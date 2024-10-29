package it.unibo;

public class Kangaroo implements  Diet, Animal{

    private double weight;
    private static boolean herbivore;
    private static boolean omnivore;
    private static boolean carnovore;
  

    public Kangaroo(double weight)
    {
      this.weight = weight;
      this.herbivore= true;
      this.omnivore = false;
      this.carnovore = false;

        
    }
    public boolean canEatVegetables()
    {
        if(this.herbivore == true)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean canEat(Animal a){

        if(this.carnovore == true)
        {
            return true;
        }
        else{
            return false;

        }
    }
    
}
