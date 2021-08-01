package com.example.learnnquiz.Obiecte;

public class Intrebare {

    private int nrintrebare;
    private int sectiuneid;
    private int[] rezultate;
    private String titlu;
    private String[] raspuns;


    public Intrebare(int nrintrebare, int sectiuneid, String titlu, String[] raspuns) {
        this.nrintrebare = nrintrebare;
        this.sectiuneid = sectiuneid;
        this.titlu = titlu;
        this.raspuns = raspuns;
    }

    public int getNrintrebare() {
        return nrintrebare;
    }

    public void setNrintrebare(int nrintrebare) {
        this.nrintrebare = nrintrebare;
    }

    public int getSectiuneid() {
        return sectiuneid;
    }

    public void setSectiuneid(int sectiuneid) {
        this.sectiuneid = sectiuneid;
    }

    public int[] getRezultate() {
        return rezultate;
    }

    public void setRezultate(int[] rezultate) {
        this.rezultate = rezultate;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String[] getRaspuns() {
        return raspuns;
    }

    public void setRaspuns(String[] raspuns) {
        this.raspuns = raspuns;
    }
}
