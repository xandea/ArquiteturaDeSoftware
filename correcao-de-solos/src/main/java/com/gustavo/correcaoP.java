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
    private fonteDeCorrecao fontes[] = new fonteDeCorrecao[12];

    public correcaoP(String teorDeFosforo, double eficiencia) {
        fonteDeCorrecao teste = new fonteDeCorrecao("a", 0.0);
        this.teorDeFosforo = teorDeFosforo;
        this.eficiencia = eficiencia;
        System.arraycopy(fonteDeCorrecao.correcaoFosforo(), 0, fontes, 0, 12);
    }

    public String getTeorDeFosforo() {
        return teorDeFosforo;
    }

    public void setTeorDeFosforo(String teorDeFosforo) {
        this.teorDeFosforo = teorDeFosforo;
    }

    public double getEficiencia() {
        return eficiencia;
    }


    public fonteDeCorrecao[] getFontes() {
        return fontes;
    }


    public String resultado() {
        //falta o cálculo
        double quantidade=0, custo=0;
        return "Quantidade a se aplicar: "+quantidade+"\nCusto R$/ha: "+custo;
    }
    
}
