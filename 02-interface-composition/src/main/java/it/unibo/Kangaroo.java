package it.unibo;

public class Kangaroo implements  Diet, Animal{

    private double weight;
    private boolean herbivore;
    private boolean Omnivore;
    private boolean Carnovore;
  

    public Kangaroo(double weight)
    {
      this.weight = weight;
      this.herbivore= true;
      this.Omnivore = false;
      this.Carnovore = false;

        
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

        return true;
    }
    
}
