package AnimalInterface_Edible.Animal;

public abstract class Fruit implements Edible {
}
class Orange extends Fruit implements Edible{
    @Override
    public String howtoEat() {
        return "Orange ";
    }

    @Override
    public String makeSound() {
        return null;
    }
}
class Apple extends Fruit implements Edible{
    @Override
    public  String howtoEat(){
        return "apple";
    }
    @Override
    public  String makeSound(){
        return null;
    }
}
