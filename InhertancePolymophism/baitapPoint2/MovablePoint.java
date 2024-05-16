package InhertancePolymophism.baitapPoint2;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(float x,float y,float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        setxSpeed(getX());
        setySpeed(getY());
    }
    public float[] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }
    public String toString(){
        return super.toString() +"xspeed : "+  xSpeed +"yspeed: " + ySpeed;
    }
    public MovablePoint Move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this ;
    }
}
class TestMove{
    public static void main(String[] args) {
        MovablePoint move = new MovablePoint();
        System.out.println(move);
        move.setXY(3.5f,3.6f);
        move.setSpeed(3.2f,3.2f);
        float[] arr = move.getSpeed();
        System.out.println(move);
    }
}
