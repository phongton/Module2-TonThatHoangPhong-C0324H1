package AnimalInterface_Edible.ColorAble;

public class Square extends Square2 implements ColorAble{
    public Square(double side) {
        super(side);
    }
    @Override
    public void howToColor(){
        System.out.println("color all four sides");
    }
}
