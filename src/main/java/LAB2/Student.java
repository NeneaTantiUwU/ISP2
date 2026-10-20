package LAB2;

public class Student {
    public String nume;
    public String prenume;
    public int grupa;
    private int []note;

    public Student(String nume, String prenume, int grupa, int[] note) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = note;
    }

    public int average() {
        int suma = 0;
        int count = 0;
        for(int i = 0; i < note.length; i++) {
            suma += note[i];
            count ++;
        }
        return suma / count;
    }

    public boolean ifRestantier() {
        Student o1 = new Student(nume, prenume, grupa, note);
        return o1.average() < 5;
    }
}
