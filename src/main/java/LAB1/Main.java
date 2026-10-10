package LAB1;

import java.util.Random;
import java.util.ArrayList;

public class Main {

    void main() {
        Cuvant cuvant = new Cuvant("A inceput scoala");
        System.out.println(cuvant.reversed());

        Random rand = new Random();
        ArrayList<Integer> listaNumere = new ArrayList<>();
        ArrayList<Integer> listaNoua = new ArrayList<>();

        int maxim = 0;
        int minim = Integer.MAX_VALUE;

        for(int i = 0; i < listaNumere.size(); i++){
            int numar = rand.nextInt(21) + 5;
            listaNumere.add(numar);
            if(numar > maxim){
                maxim = numar;
            }
            if(numar < minim){
                minim = numar;
            }
        }

        System.out.println(maxim);
        System.out.println(minim);

        maxim = 0;
        minim = Integer.MAX_VALUE;

        for(int i = 0; i < listaNumere.size(); i++){
            if(listaNumere.get(i) >= 10 && listaNumere.get(i) <= 20){
                listaNoua.add(listaNumere.get(i));
                System.out.println(listaNumere.get(i));
            }
        }
        for(int i = 0; i < listaNoua.size(); i++){
            if(listaNoua.get(i) > maxim){
                maxim = listaNoua.get(i);
            }
            if(listaNoua.get(i) < minim){
                minim = listaNoua.get(i);
            }
        }

        System.out.println(maxim);
        System.out.println(minim);
    }
}