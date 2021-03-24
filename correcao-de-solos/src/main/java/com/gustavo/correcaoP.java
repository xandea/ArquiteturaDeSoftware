package com.gustavo;

    /* 
        Dados de entrada:
            Teor de fósforo a atingir;
            Eficiência do Fósforo;
            Fonte de Fósforo;
            Valor em toneladas;

        Dados de saída:
            Quantidade a aplicar;
            Custo R$/ha;
    */

public class correcaoP {
    private String teorDeFosforo;
    private double eficiencia;
    private fonteDeCorrecao fontes[];

    public String getTeorDeFosforo() {
        return teorDeFosforo;
    }

    public void setTeorDeFosforo(String teorDeFosforo) {
        this.teorDeFosforo = teorDeFosforo;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    public fonteDeCorrecao[] getFontes() {
        return fontes;
    }

    public void setFontes(fonteDeCorrecao[] fontes) {
        this.fontes = fontes;
    }

    public String resultado() {
        //falta o cálculo
        double quantidade=0, custo=0;
        return "Quantidade a se aplicar: "+quantidade+"\nCusto R$/ha: "+custo;
    }
    
}
