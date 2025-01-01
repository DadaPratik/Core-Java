package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaofRoom1 = room1.calculateArea();
        System.out.println(areaofRoom1);

        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println(areaOfRoom2);

        double totalArea = areaofRoom1 + areaOfRoom2;
        System.out.println(totalArea);



    }
}
