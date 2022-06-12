package fr.mj.dao;

import fr.mj.gestion.Nourriture;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class NourritureDAO {

    private Fichier fichier;

    public NourritureDAO(String nomDeFichier) {
        fichier = new Fichier(nomDeFichier, StandardCharsets.UTF_8);
    }

    public ArrayList<Nourriture> lire() {
        ArrayList<String> lignes = fichier.lire();
        ArrayList<Nourriture> nourriture = new ArrayList<>();

        for (String ligne : lignes)
            nourriture.add(StringToNourriture(ligne));

        return nourriture;
    }

    private Nourriture StringToNourriture(String ligne) {

        String[] colonnes = ligne.split("/");

        int col2 = Integer.parseInt(colonnes[1]);

            return new Nourriture(colonnes[0], col2);



    }

}
