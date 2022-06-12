package fr.mj.gestion;

import java.util.Objects;

public class Joueur {
    private String pseudo;
    private int hamsterMale;
    private int hamsterFemme;
    private int sold;

    public Joueur(String pseudo){
        this.pseudo = pseudo;
        hamsterFemme = hamsterMale = 10;
        sold = 1000;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getHamsterMale() {
        return hamsterMale;
    }

    public int getHamsterFemme() {
        return hamsterFemme;
    }

    public int getSold() {
        return sold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur joueur = (Joueur) o;
        return hamsterMale == joueur.hamsterMale && hamsterFemme == joueur.hamsterFemme && sold == joueur.sold && Objects.equals(pseudo, joueur.pseudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pseudo, hamsterMale, hamsterFemme, sold);
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "pseudo='" + pseudo + '\'' +
                ", hamsterMale=" + hamsterMale +
                ", hamsterFemme=" + hamsterFemme +
                ", sold=" + sold +
                '}';
    }
}
