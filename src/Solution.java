

import java.io.*;
import java.util.*;



// Bubble sort_:

/* Donades les puntuacions i els equips d'una divisió determinada (desordenats), dóna el nom del primer a l'últim i les seves respectives puntuacions de forma ordenada.

PISTA: fes ús de l'algorisme BubbleSort

Simulació de Bubble Sort

Implementació de l'algorisme per ordenar nombres

Input Format

N: enter, serà el nombre d'equips que participen. Tot seguit hi ha una sucessió de N equips amb els seus respectius punts.

Constraints

No n'hi ha.

Output Format

Apareixen els equips amb les seves puntuacions de forma ordenada.

Sample Input 0

5
Equip1 10
Equip2 4
Equip3 24
Equip4 12
Equip5 40
Sample Output 0

Equip5 40
Equip3 24
Equip4 12
Equip1 10
Equip2 4

 */



public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Grosor = sc.nextInt();
        String [] equipo = new String [Grosor];
        int [] punto = new int [Grosor];


        for (int i = 0; i < Grosor; i++)
        {
            equipo[i] = sc.next();
            punto[i] = sc.nextInt();

        }
        boolean HayIntercambio = true;
        while (HayIntercambio)
        {
            HayIntercambio = false;
            for(int i = 0; i < Grosor -1 ; i++)
            {
                if (punto[i] < punto[i+1])
                {
                    int aux = punto[i];
                    punto [i] = punto [i+1];
                    punto[i+1] = aux;

                    String auxString = equipo[i];
                    equipo[i] = equipo[i+1];
                    equipo[i+1] = auxString;
                    HayIntercambio = true;
                }
            }
        }
        for (int i = 0; i < Grosor; i++)
        {
            System.out.println(equipo[i] + " " + punto[i]);
        }


    }
}
