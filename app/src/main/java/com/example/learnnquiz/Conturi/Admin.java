package com.example.learnnquiz.Conturi;



public class Admin {

    private int id;
    private String nume;
    private String email;
    private String inregistrare;
    private String parola;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getInregistrare() { return inregistrare; }

    public void setInregistrare(String trim) { this.inregistrare = inregistrare; }

    public String getParola(){
        return parola;
    }

    public void setParola(String parola){
        this.parola = parola;
    }
}
