package task2;

public class Student extends Person{
    int numCourses=0;
    String []courses={"1","2","3","4","5"};
    String []grades={"9","10","11","12"};
    Student() {}
    Student(String name,String address) {
        super(name,address);
    }
    public String toString() {
        return super.name+"("+super.address+")";

    }
    public void addCourseGrade(String course,int grades) {
        System.out.println("course "+course+" grades "+grades);
    }
    public void printGrade(int grades) {
        System.out.println("grades "+grades);
    }
    public void AverangeGrade(int grade) {
        System.out.println("grade "+grade);
    }


}
