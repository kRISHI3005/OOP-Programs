class Rectangle2 {
    double width;
    double height;

        Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        Rectangle2 r1 = new Rectangle2(4, 40);
        Rectangle2 r2 = new Rectangle2(3.5, 35.9);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 2 Area: " + r2.getArea());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area");
        } else {
            System.out.println("Rectangle 2 has larger area");
        }
    }
}
