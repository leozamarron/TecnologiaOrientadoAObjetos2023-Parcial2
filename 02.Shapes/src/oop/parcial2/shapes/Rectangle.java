package oop.parcial2.shapes;

public class Rectangle extends Shape{
    private double base;
    private double height;

    public Rectangle(){
        super("Rectangulo");  
    }
    public Rectangle(double base, double height){
        this();
        this.base = base;
        this.height = height;
    }
    
    public double getArea(){return height * base;}
    public double getPerimeter(){return 2*height+2*base;}
    public double getSidesCount(){return 4;}
    public String draw(){return "█";}

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
