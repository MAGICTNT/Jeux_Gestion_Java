package fr.mj.gestion;

import java.util.Objects;

public class Nourriture implements Comparable<Nourriture> {
    private String nom;
    private int valeur;

    public Nourriture(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }




    @Override
    public int compareTo(Nourriture o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nourriture that = (Nourriture) o;
        return Objects.equals(nom, that.nom) && Objects.equals(valeur, that.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, valeur);
    }

    @Override
    public String toString() {
        return "Nourriture{" +
                "nom='" + nom + '\'' +
                ", valeur='" + valeur + '\'' +
                '}';
    }
}
