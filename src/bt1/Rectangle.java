package bt1;

public class Rectangle extends Shape{
    private double width,length;

    public Rectangle() {
    }

    public double getPerimeter(double width,double length) {
        return 2*(width+length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(double width,double length) {
        return width*length;
    }

    public String print() {
        return "Dien tich la: "+ getPerimeter(width,length)+"\nChu vi la: "+getArea(width,length);
    }



    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
