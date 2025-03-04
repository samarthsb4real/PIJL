class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0, 1);
    }

    public double area() {
        return Math.PI * dim_one * dim_one;
    }

    public double perimeter() {
        return 2 * Math.PI * dim_one;
    }
}