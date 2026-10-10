package LAB1;

public class Cuvant {
    String cuvant;

    public Cuvant(String cuvant) {
        this.cuvant = cuvant;
    }

    String reversed() {
        StringBuilder variabila = new StringBuilder();
        variabila.append(cuvant);
        return variabila.reverse().toString();
    }
}
