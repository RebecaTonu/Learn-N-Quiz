package com.example.learnnquiz.Obiecte;

import java.util.List;

public class Lectie{
    private int id;
    private String titlu;
    private List<String> sectiuni;
    private int rezultat;
    private int idcurs;
    private int sectiuniNr;

    public Lectie(int id, String titlu, List<String> sectiuni, int rezultat, int idcurs) {
        this.id = id;
        this.titlu = titlu;
        this.sectiuni = sectiuni;
        this.rezultat = rezultat;
        this.idcurs = idcurs;
    }

    public Lectie(int id, String titlu) {
        this.id = id;
        this.titlu = titlu;
    }

    public Lectie(int id, String titlu, int rezultat, int sectiuniNr) {
        this.id = id;
        this.titlu = titlu;
        this.rezultat = rezultat;
        this.sectiuniNr = sectiuniNr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public List<String> getSectiuni() {
        return sectiuni;
    }

    public void setSectiuni(List<String> sectiuni) {
        this.sectiuni = sectiuni;
    }

    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    public int getIdcurs() {
        return idcurs;
    }

    public void setIdcurs(int idcurs) {
        this.idcurs = idcurs;
    }

    public int getSectiuniNr() {
        return sectiuniNr;
    }

    public void setSectiuniNr(int sectiuniNr) {
        this.sectiuniNr = sectiuniNr;
    }
}
