package task1;

public class Dispatcher {
    public static void main(String [] args) {
    Point p1=new Point(6,7);
    Point p2=new Point(10,5);
    Point p3=new Point(2,8);

    Circle c1=new Circle(p1,16);
    Circle c2=new Circle(p2,23);
    Circle c3=new Circle(p2,32);


    Point [] points=new Point[3];
    points[0]=p1;
    points[1]=p2;
    points[2]=p3;

    for(Point temp:points){
        System.out.println(temp);
    }

    Circle [] circles=new Circle[3];
    circles[0]=c1;
    circles[1]=c2;
    circles[2]=c3;

    for(Circle temp:circles) {
            System.out.println(temp);
    }

}}
