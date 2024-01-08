package com.example;

import java.util.List;

public class Classe {
    public int numero;
    public String sezione;
    public String aula;
    public List<Alunno> alunni;

    public void setAlunno(List<Alunno> alunni) {
        this.alunni = alunni;
    }

    public List<Alunno> getAlunno() {
        return alunni;
    }
    public void addAlunno(Alunno a){
        alunni.add(a);
    }

    public Classe(){}

    public Classe(int numero, String sezione, String aula, List<Alunno> alunno) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getNumero() {
        return numero;
    }

    public String getSezione() {
        return sezione;
    }

    public String getAula() {
        return aula;
    }


}
