package com.gustavo;
/**
 *
 * @author xande
 */
public enum TexturaSolo {
    ARGILOSO(9.0,0.35,6.0,1.5,9.0,0.0),
    TEXTURAMEDIA(12.0,0.25,4.0,1,6.0,0.0);
    
    private final double fosforo; 
    private final double potassio; 
    private final double calcio; 
    private final double magnesio; 
    private final double enxofre;
    private final double aluminio;
    
    TexturaSolo(double fosforo,double potassio,double calcio,double magnesio,double enxofre,double aluminio){
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
    }
    double getQTDIdealFosforo(){
        return fosforo;
    }
    double getQTDIdealPotassio(){
        return potassio;
    }
    double getQTDIdealCalcio(){
        return calcio;
    }
    double getQTDIdealMagnesio(){
        return magnesio;
    }
    double getQTDIdealEnxofre(){
        return enxofre;
    }
    double getQTDIdealAluminio(){
        return aluminio;
    }
}
