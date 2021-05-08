package com.gustavo;

public class AmostraDoSolo {
    private double teorFosforo;
    private double teorPotassio;
    private double teorCalcio;
    private double teorMagnesio;
    private double teorEnxofre;
    private double teorAluminio;
    private double teorHAL;
    private double materiaOrganica;

    public AmostraDoSolo (double teorFosforo, double teorPotassio, double teorCalcio, double teorMagnesio, double teorEnxofre, double teorAluminio, double teorHAL,double materiaOrganica) {
        this.teorFosforo = teorFosforo;
        this.teorPotassio = teorPotassio;
        this.teorCalcio = teorCalcio;
        this.teorMagnesio = teorMagnesio;
        this.teorEnxofre = teorEnxofre;
        this.teorAluminio = teorAluminio;
        this.teorHAL = teorHAL;
        this.materiaOrganica = materiaOrganica;
    }

    public double somaCmol() {
        return this.teorPotassio + this.teorCalcio + this.teorMagnesio;
    }

    public double ctc() {
        return somaCmol() + this.teorHAL;
    }

    public double satBaseV() {
        return (somaCmol()/ctc())*100;
    }

    public double moCento() {
		return this.materiaOrganica/10;
	}

	public double carbono() {
		return this.materiaOrganica/10/1.72*10;
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
    
}
