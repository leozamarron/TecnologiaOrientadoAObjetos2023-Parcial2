package oop.parcial2.shapes;

public class Circle extends Shape{
    private double radio;

    public Circle(){
        super("Circle");
    }

    public Circle(double radio){
        this();
        this.radio = radio;
    }
    public double getArea(){return Math.PI * radio * radio;}
    public double getPerimeter(){return Math.PI * radio * 2;}
    public double getSidesCount(){return 0;}
    public String draw(){return "o";}
    public double getRadio() {
        return radio;
    }
}
