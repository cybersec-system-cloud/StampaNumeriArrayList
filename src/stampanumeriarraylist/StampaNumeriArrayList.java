package stampanumeriarraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StampaNumeriArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Dichiara ArrayList (inizialmente vuoto)
        ArrayList<Integer> numeri = new ArrayList<Integer>(); 
        
        // Legge i valori da inserire nel vettore
        int n = 1;
        while(n!=0) {
            System.out.println("Inserisci un numero: ");
            try {
                n = input.nextInt();
                if(n!=0) numeri.add(n);
            } catch (InputMismatchException e) {
                input.nextLine(); // Server per svuotare buffer di input
                System.out.println("Hai inserito un non-numero...riprova!");
            }
        }
        
        // Stampa dei numeri nella forma n1 -> n2 -> n3 -> ... -> FINE
        for(int num : numeri) {
            System.out.print(num + "->");
        }
        System.out.println("FINE");
        
        
    }
    
}
