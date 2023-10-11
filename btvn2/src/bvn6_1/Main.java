package bvn6_1;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(3,4);
        System.out.println(rectangle);
        System.out.print("Dien tich hcn la: "+ rectangle.Area()+ "\n"+"Chu vi hinh chu nhat la "+ rectangle.Perimeter());

        Square square = new Square(9);
        System.out.println(square);
        System.out.print("Dien tich v la: "+ square.Area()+ "\n"+"Chu vi hinh v la "+ square.Perimeter());
    }

}
