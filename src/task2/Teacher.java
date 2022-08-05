package task2;

import java.util.Arrays;

public class Teacher extends Person{
    int numCourses=0;
    String [] courses={"1","2","3","4","5"};

    Teacher() {}
    Teacher(String name,String address) {
        super(name,address);
    }
    @Override
    public String toString() {
        return super.name+"("+super.address+")";
    }


    public boolean addCourses(int course) {
        return false;
    }
    public boolean removeCourses(int course) {
        return false;
    }


}
