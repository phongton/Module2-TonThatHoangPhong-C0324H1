package OOPjava;



public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = Slow;
        this.on = false;
        this.radius = 5;
        this.color = " blue";
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (getOn()){
            return "speed "+getSpeed()+"color : "+getColor()+"radius : "+ getRadius()+" fan is on ";
        }else {
            return "color : "+ getColor()+"radius : "+ getRadius()+" fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.Fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("đối tượng 1 : "+ fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.Medium);
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }
}
