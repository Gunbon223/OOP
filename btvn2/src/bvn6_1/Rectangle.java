package bvn6_1;

public class Rectangle extends Shape{
    private double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        return width*length;
    }

    @Override
    public double Perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle co canh: " +
                "length=" + length +
                ", width=" + width
                ;
    }
}
