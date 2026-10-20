import LAB2.ByGradesComparator;
import LAB2.Student;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

void main() {

    List<Integer> x = new ArrayList();
    List<Integer> y = new ArrayList();
    List<Integer> xPlusY = new ArrayList(); //a
    Set<Integer> zSet = new TreeSet(); //b
    List<Integer> xMinusY = new ArrayList();//c
    int p = 4;
    List<Integer> xPlusYLimitedByP = new ArrayList(); //d
    List<Student>  students = new ArrayList();

    Student o1;
    Student o2;

    students.add(new Student("Popescu", "Ion", 221, new int[]{8, 9, 7, 10, 6}));
    students.add(new Student("Ionescu", "Ana",222, new int[]{10, 9, 9, 8, 10}));
    students.add(new Student("Corbeanu", "Laurentiu", 221, new int[]{5, 9, 10, 10, 4}));
    students.add(new Student("Lazar", "Aurelia",222, new int[]{10, 5, 9, 5, 10}));

    Random rand = new Random();
    int count = 0;

    for (int i = 0; i < 5; i++) {
        int numar = rand.nextInt(11);
        x.add(numar);
        xPlusY.add(numar);
    }

    for (int i = 0; i < 7; i++) {
        int numar = rand.nextInt(11);
        y.add(numar);
        xPlusY.add(numar);
    }

    Collections.sort(x);
    Collections.sort(y);
    Collections.sort(xPlusY);

    zSet.addAll(x);

    for(Integer element : x){
        if(!y.contains(x.get(element))){
            xMinusY.add(x.get(element));
        }
    }

    Collections.sort(xMinusY);

    for(Integer element : zSet){
        if(element <= p){
            xPlusYLimitedByP.add(element);
        }
    }

    Collections.sort(xPlusYLimitedByP);

    students.sort(
            Comparator.comparing((Student s) -> s.grupa)
                    .thenComparing(s -> s.nume)
                    .thenComparing(s -> s.prenume)
    );

    Collections.sort(students, new ByGradesComparator());

}