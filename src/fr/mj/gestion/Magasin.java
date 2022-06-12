package fr.mj.gestion;

import fr.mj.dao.MaterielleDAO;
import fr.mj.dao.NourritureDAO;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Magasin implements Comparable<Magasin>{

    private String nomFichier;
    private final Charset charset = StandardCharsets.UTF_8;

    private ArrayList<Nourriture> listeNourriture;
    private ArrayList<Materielle> listeMaterielle;

    public Magasin(String fichierNourriture, String fichierMaterielle){
        this.nomFichier = nomFichier;
        listeNourriture = new NourritureDAO(fichierNourriture).lire();
        listeMaterielle = new MaterielleDAO(fichierMaterielle).lire();
    }

    public ArrayList<Nourriture> getListeNourriture() {
        return listeNourriture;
    }

    public ArrayList<Materielle> getListeMaterielle() {
        return listeMaterielle;
    }

    public void ajouterNourriture(Nourriture nourriture){
        listeNourriture.add(nourriture);
    }

    public void ajouterMaterielle(Materielle object){
        listeMaterielle.add(object);
    }

    @Override
    public int compareTo(Magasin o) {
        return 0;
    }
}
