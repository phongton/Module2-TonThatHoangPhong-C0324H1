package AnimalInterface_Edible.Animal;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "tiger : grgrgrgr ";
    }

    @Override
    public String howtoEat() {
        return "ádsadads";
    }
}
