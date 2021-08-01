package com.example.learnnquiz.Obiecte;
public class Sectiune {
    private int lectieid;
    private int nrsectiune;
    private String titlu;
    private String text;
    private String titlulectie;
    private int sectiunelectie;

    public Sectiune (int lectieid, int nrsectiune, String titlu, String text, String titlulectie, int sectiunelectie) {
        this.lectieid = lectieid;
        this.nrsectiune = nrsectiune;
        this.titlu = titlu;
        this.text = text;
        this.titlulectie = titlulectie;
        this.sectiunelectie = sectiunelectie;
    }


    public int getLectieid() {
        return lectieid;
    }

    public void setLectieid(int lectieid) {
        this.lectieid = lectieid;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitlulectie() {
        return titlulectie;
    }

    public void setTitlulectie(String titlulectie) {
        this.titlulectie = titlulectie;
    }

    public int getNrsectiune() {
        return nrsectiune;
    }

    public void setNrsectiune(int nrsectiune) {
        this.nrsectiune = nrsectiune;
    }

    public void setSectiunelectie(int sectiunelectie) {
        this.sectiunelectie = sectiunelectie;
    }

    public int getSectiunelectie() {
        return sectiunelectie;
    }
}
