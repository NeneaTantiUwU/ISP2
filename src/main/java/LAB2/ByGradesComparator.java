package LAB2;

import java.util.Comparator;

public class ByGradesComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.average() == o2.average()) {
            return 0;
        }
        return o1.average() < o2.average() ? 1 : -1; //descrescator
    }
}