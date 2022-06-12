package fr.mj.main;

import fr.mj.dao.Fichier;
import fr.mj.gestion.Joueur;
import fr.mj.gestion.Magasin;
import fr.mj.gestion.Materielle;
import fr.mj.gestion.Nourriture;

public class Main {
    public static void main(String[] args) {
        String fichierNourriture = "F:/JAVA/workSpace__JetBrain/Jeux/ListeDesNourritures.txt";
        String fichierMaterielle = "F:/JAVA/workSpace__JetBrain/Jeux/ListeDesMaterielle.txt";
        Magasin magasin = new Magasin(fichierNourriture, fichierMaterielle);


        System.out.println(magasin.getListeMaterielle());

        for(int i = 0; i < magasin.getListeNourriture().size();i++)
            System.out.printf("%s%nValeur: %s€%n%n", magasin.getListeNourriture().get(i).getNom() , magasin.getListeNourriture().get(i).getValeur());

        System.out.printf("-------------------------------------%n");

        for(int i = 0; i < magasin.getListeMaterielle().size();i++)
            System.out.printf("%s%nValeur: %s€%n%n", magasin.getListeMaterielle().get(i).getNom(), magasin.getListeMaterielle().get(i).getValeur());
         magasin.getListeNourriture().get(0).setValeur(40000);



        Joueur joueur1 = new Joueur("Nargin");
        //     System.out.printf("Pseudo: %s Hamster male: %d hamster Femme: %d sold: %d", joueur1.getPseudo(), joueur1.getHamsterMale(), joueur1.getHamsterFemme(), joueur1.getSold());


    }
}
