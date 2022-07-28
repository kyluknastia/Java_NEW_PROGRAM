package task1;

public class Circle {
    Point center;
    double radiuce;
    Circle(){}
    Circle(Point center,double radiuce) {
        this.center=center;
        this.radiuce=radiuce;
    }
    public Point getCenter() {
        return center;
    }
    public double getRadiuce() {
        return radiuce;
    }
    public void setCenter(Point center) {
        this.center=center;
    }
    public void setRadiuce(double radiuce) {
        this.radiuce=radiuce;
    }
    public String toString() {
        return "center="+center+" "+"radiuce="+radiuce;
    }



    }




