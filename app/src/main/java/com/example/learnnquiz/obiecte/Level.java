package com.example.learnnquiz.Obiecte;



public class Level {

    private int proctot;
    private String liv;
    private int prog;
    private int tot;
    private int[] procurs;

    public Level(int proctot, String liv, int prog, int tot, int[] procurs) {
        this.proctot = proctot;
        this.liv = liv;
        this.prog = prog;
        this.tot = tot;
        this.procurs = procurs;
    }

    public int getProctot() {
        return proctot;
    }

    public void setProctot(int proctot) {
        this.proctot = proctot;
    }

    public String getLiv() {
        return liv;
    }

    public void setLiv(String liv) {
        this.liv = liv;
    }

    public int getProg() {
        return prog;
    }

    public void setProg(int prog) {
        this.prog = prog;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public int[] getProcurs() {
        return procurs;
    }

    public void setProcurs(int[] procurs) {
        this.procurs = procurs;
    }
}
