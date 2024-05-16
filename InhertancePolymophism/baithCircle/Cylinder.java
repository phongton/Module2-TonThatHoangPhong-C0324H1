package InhertancePolymophism.baithCircle;

public class Cylinder extends Circle{
    private double length = 1.0;
    public Cylinder(){}
    public Cylinder(double length,double radius){
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double VolumeCylinder(){
        return Math.PI*Math.pow(getRadius(),2)*length;
    }
    @Override
    public String toString(){
        return "length Cylinder is = " + length + super.toString()+ "Volume  = " + VolumeCylinder();
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.5,3.5);
        System.out.println(cylinder);
    }
}
