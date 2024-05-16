package InhertancePolymophism.baitapPoint;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D (float x , float y ,float z){
        super(x,y);
        this.z = z;

    }
    public Point3D(){}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y ,float z ){
       setX(x);
       setY(y);
       this.z =z ;
    }
    public float[] getXYZ(){
        return new float[] {getX(),getY(),z};
    }
    @Override
    public String toString(){
        return super.toString() + " z = "  + z;
    }
}
class Test{
    public static void main(String[] args) {
        Point3D point = new Point3D(3,4,5);
        System.out.println(point);
    }
}
