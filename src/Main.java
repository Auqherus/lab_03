import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


        //zad 1 index = 60725

      /*  int number = 1000;
        do {if(number%25 == 0){System.out.println("Liczba : "+" "+number+" "+"podzielna przez 25!");}number--;
        } while(number>=0);
*/
        //zad 2 a)

        /*int tab [] = new int [5];
        tab[0] = 231;
        tab[1] = 12;
        tab[2] = 443;
        tab[3] = 41;
        tab[4] = 52;

        int i = 0;
        Arrays.sort(tab);
        Arrays.toString(tab);
        while(i<=4){System.out.println(tab[i]);i++;}*/

        // zad 2 b)
 /*       double tab [] = new double [5];

        tab[0] = 34.2;
        tab[1] = 2.7;
        tab[2] = 1.3;
        tab[3] = 6.3;
        tab[4] = 43.2;
        Arrays.sort(tab);
        Arrays.toString(tab);

        int i = 4;
        while(i>=0){ System.out.println(tab[i]);i--;}*/

        // zad 2 c)
        String tab [] = new String [5];

        tab[0] = "Tadeusz";
        tab[1] = "Adrian";
        tab[2] = "Ignacy";
        tab[3] = "Juliusz";
        tab[4] = "Werter";
        Arrays.sort(tab);
        int i = 4;
        while(i>=0){ System.out.println(tab[i]);i--;}


    }
}
