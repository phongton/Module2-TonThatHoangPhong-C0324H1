package AnimalInterface_Edible.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Duck : clack clack";
    }
    @Override
    public String howtoEat(){
        return "could be fried";
    }

}
