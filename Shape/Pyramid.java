class Pyramid extends Shape {
    public Pyramid(double side, double height) {
        super(side, height, 0, 8);
    }

    public double calculateVolume() {
        return (dim_one * dim_one * dim_two) / 3;
    }

    public double calculateArea() {
        return dim_one * dim_one + 2 * dim_one * Math.sqrt((dim_one * dim_one) / 4 + dim_two * dim_two);
    }

    public double calculatePerimeter() {
        return 4 * dim_one + 4 * dim_two;
    }
}