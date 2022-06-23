class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this.x = 320;
        this.y = 200;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public Point getCoordinates() {
        return new Point(this.x, this.y);
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public double distance(Point point) {
        double distanceXPlane = point.getX() - this.x;
        double distanceYPlane = point.getY() - this.y;
        double underRoot = Math.pow(distanceXPlane, 2) + Math.pow(distanceYPlane, 2);
        return Math.sqrt(underRoot);
    }
}


