 class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() { }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + this.radius +
                ", color='" + this.color + '\'' +
                ']';
    }
 }

class Cylinder extends Circle {
    private double height;

    Cylinder () {
        super();
        height = 1.0;
    }

    Cylinder (double height) {
        super();
        this.height = height;
    }

    Cylinder (double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
