package oop.parcial2.shapes;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(){
        super("Triangulo");
    }
    public Triangle(double base, double height) {
        this();
        this.base = base;
        this.height = height;
    }

    public double getArea(){return base*height/2;}
    public double getPerimeter(){return 3*height;}
    public double getSidesCount(){return 3;}
    public String draw(){return "/_\\";}

    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
}
