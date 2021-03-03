package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // On déclare un scanner pour lire les entrées de la console
    Scanner sc = new Scanner(System.in);

    // Demander # de la table
    System.out.println("Resto Java - Numéro de table : ");
    Integer table = sc.nextInt();

    //lister la commande
    System.out.print("Nombre de type de plats commandés: ");
    int m = sc.nextInt();

    //Déclaration variables
    int index = 0;
    float TOTAL = 0;
    String FACTURE = "";

    // Boucle "for" - basée sur le nb de plats commandés
    for (index = 0; index < m; index++) {

      // Demander le plat
      System.out.println("Plat : ");
      String plat = sc.next();
      sc.nextLine();
      //plat = sc.next();

      // Demander le prix
      System.out.println("Prix : ");
      Float prix = sc.nextFloat();

      // Demander la quantité
      System.out.println("Quantité : ");
      Integer quantité = sc.nextInt();

      //Affichage de la ligne
      System.out.println(plat + ": prix " + prix + "€ * qté " + quantité + " = " + (prix * quantité) + "€");

      //Enregistrement de la ligne pour la facture
      FACTURE = (FACTURE + plat + ": prix " + prix + "€ * qté " + quantité + " = " + (prix * quantité) +"€ ");

      // Addition du total pour la facture
      TOTAL = ((prix * quantité) + TOTAL);
    }

    //Edition Facture = apparence à retravailler
    System.out.println("Facture table #: " + table);

    //Apparence corps facture à retravailler (printf)
    System.out.println(FACTURE);
    System.out.println("Total addition: " + TOTAL + " € TTC");

    //Calcul TVA à revoir
    System.out.println("Montant TVA 5,5% ");

    //Message de fin
    System.out.println("Merci pour votre visite et à bientôt!");


    // On ferme le scanner
    sc.close();
  }
}
