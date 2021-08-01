package com.example.learnnquiz.Obiecte;

import java.util.List;

public class Curs {
    private int id;
    private String titlu;
    private List<Lectie> lectie;
    private int Progproc;

    public Curs(int id, String titlu) {
        this.id = id;
        this.titlu = titlu;
    }

    public Curs(int id, String titlu, List<Lectie> lectie) {
        this.id = id;
        this.titlu = titlu;
        this.lectie = lectie;
    }

    public Curs(String titlu, int Progproc) {
        this.titlu = titlu;
        this.Progproc = Progproc;
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

    public List <Lectie> getLectie() {
        return lectie;
    }

    public void setLectie(List<Lectie> lectie) {
        this.lectie = lectie;
    }

    public int getProgproc() {
        return Progproc;
    }

    public void setProgproc(int progproc) {
        this.Progproc = progproc;
    }
}
