package LAB1;

public class Dreptunghi {

   private int n;
   private int m;

    Dreptunghi(int randuri, int coloane) {
        n = randuri;
        m = coloane;
    }

    void afiseaza() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}