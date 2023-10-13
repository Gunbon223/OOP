package bt1;

public class Square extends Shape{
    private  double side ;
    public Square(double side) {
        this.side=side;
    }

    @Override
    public double getPerimeter(double side1, double side2) {
        return side1 *side1;
    }


    @Override
    public double getArea(double side1, double side2) {
        return 2*2*side1;
    }

    @Override
    public String print() {
        return "Canh hinh vuong: "+side+" "+ getArea(side,side)+""+getPerimeter(side,side);

    }
}
