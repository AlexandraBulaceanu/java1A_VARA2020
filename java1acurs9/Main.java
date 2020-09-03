/**
 * Un magazin contine mai multe produse. Maximul de produse pe care le poate avea magazinul este
 * de 20. Se va face o exceptie PreaMulteProduseException daca se depaseste aceasta limita. Produsele
 * pot sa fie ciocolata sau bere. Un produs are un nume si un pret. O ciocolata este un produs cu un numar
 * de kcal, iar berea este un produs cu procent de alcool.
 * Utilizatorul poate sa dea urmatoarele comenzi de la tastatura:
 * adaugaCioco nume pret kcal
 * adaugaBere nume pret pa
 * afisare
 * afisareCioco
 * sterge nume
 * exit
 */
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Comanda: ");
            String cmd = scanner.nextLine();
            String [] cuvinte = cmd.split("\\s+");//vector de cuvinte, facem o impartire dupa spatii
            switch(cuvinte[0]){
                case "exit": System.out.println("Se inchide aplicatia!");
                             System.exit(0);//return;
                case "adaugaCioco": Cioco c = new Cioco();
                                    c.nume = cuvinte[1];
                                    c.pret = Double.parseDouble(cuvinte[2]);
                                    c.kcal = Integer.parseInt(cuvinte[3]);
                                    Magazin.getInstance().adaugaProdus(c);
                                    System.out.println("A fost adaugata o cioco!");
                                    break;
                case "adaugaBere":  Bere b = new Bere();
                                    b.nume = cuvinte[1];
                                    b.pret = Double.parseDouble(cuvinte[2]);
                                    b.pa = Double.parseDouble(cuvinte[3]);
                                    Magazin.getInstance().adaugaProdus(b);
                                    System.out.println("A fost adaugata o bere!");
                                    break;
                case "afisare": Magazin.getInstance().afisareProduse();
                                break;
                case "afisareCioco": Magazin.getInstance().afisareCioco();
                                     break;
                case "sterge": Magazin.getInstance().sterge(cuvinte[1]);
                               System.out.println("Produsul a fost sters!");
                               break;
                                    
            }
        }
    }
}