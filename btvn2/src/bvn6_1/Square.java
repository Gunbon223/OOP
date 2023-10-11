package bvn6_1;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double Area() {
        return side*side;
    }

    @Override
    public double Perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "\nSquare co canh: " +
                "side=" + side;
    }
}
