package oop.parcial2.shapes;

public abstract class Shape {

    private String name;

    public Shape(String name){
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract double getSidesCount();
    public abstract String draw();

    @Override
    public String toString(){
        return draw();
    }
}
