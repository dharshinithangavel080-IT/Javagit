class AreaCalculator {

    // Area of square
    double area(double side) {
        return side * side;
    }

    // Area of rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of circle
    double area(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Area of Square = " + obj.area(5.0));
        System.out.println("Area of Rectangle = " + obj.area(10.0, 6.0));
        System.out.println("Area of Circle = " + obj.area(7));
    }
}