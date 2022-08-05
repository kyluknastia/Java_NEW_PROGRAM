package task2;

public class Dispatcher {
    public static void main(String arhs[]) {
        Person p1 = new Person("Katia", "street Tiper");
        System.out.println(p1);
        Teacher t1 = new Teacher("Meri","street Seec");
        System.out.println(t1);
        Student s1=new Student("Tania","street Pochakov");
        System.out.println(s1);
        s1.addCourseGrade("5",12);
        s1.printGrade(10);
        s1.AverangeGrade(8);
        t1.addCourses(1);



    }
}