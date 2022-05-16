package BT.Accessmodifier;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        System.out.println("bán kính của hình tròn:");
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

    public double Area(){
        System.out.println("Diện tích hình tròn:");
        return Math.pow(this.radius,2)*Math.PI;
    }
}
