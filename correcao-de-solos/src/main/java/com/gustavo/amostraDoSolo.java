package com.gustavo;

public class amostraDoSolo {
    private double teorFosforo;
    private double teorPotassio;
    private double teorCalcio;
    private double teorMagnesio;
    private double teorEnxofre;
    private double teorAluminio;
    private double teorHAL;
    private double Scmol;
    private double CTCcmol;

    public amostraDoSolo (double teorFosforo, double teorPotassio, double teorCalcio, double teorMagnesio, double teorEnxofre, double teorAluminio, double teorHAL) {
        this.teorFosforo = teorFosforo;
        this.teorPotassio = teorPotassio;
        this.teorCalcio = teorCalcio;
        this.teorMagnesio = teorMagnesio;
        this.teorEnxofre = teorEnxofre;
        this.teorAluminio = teorAluminio;
        this.teorHAL = teorHAL;
        this.Scmol = teorCalcio + teorPotassio + teorMagnesio;
        this.CTCcmol = Scmol + teorHAL;
    }

    public double getTeorFosforo() {
        return teorFosforo;
    }

    public double getTeorPotassio() {
        return teorPotassio;
    }

    public double getTeorCalcio() {
        return teorCalcio;
    }

    public double getTeorMagnesio() {
        return teorMagnesio;
    }

    public double getTeorEnxofre() {
        return teorEnxofre;
    }

    public double getTeorAluminio() {
        return teorAluminio;
    }

    public double getTeorHAL() {
        return teorHAL;
    } 

    public double getScmol() {
        return Scmol;
    }

    public double getCTCcmol() {
        return CTCcmol;
    }
}
