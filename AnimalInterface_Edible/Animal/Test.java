package AnimalInterface_Edible.Animal;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            System.out.println(animal.howtoEat());

        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1 : fruit){
            System.out.println(fruit1.howtoEat());
        }
    }

}


