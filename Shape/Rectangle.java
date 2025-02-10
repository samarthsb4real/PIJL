// Rectangle.java

class Rectangle extends Shape {
    public Rectangle(double dim_one, double dim_two) {
        super(dim_one, dim_two, 0, 4);
    }

    public double area() {
        return dim_one * dim_two;
    }

    public double perimeter() {
        return 2 * (dim_one + dim_two);
    }
}