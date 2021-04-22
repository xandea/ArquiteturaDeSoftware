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
    private String teorDeFosforoNoSolo;
    private String teorDeFosforoDesejado;
    private double eficiencia;
    private int fonteDeCorrecaoUtilizada;
    private fonteDeCorrecao fontes[] = new fonteDeCorrecao[12];

    public correcaoP(String teorDeFosforoNoSolo, String teorDeFosforoDesejado, double eficiencia, int fonteDeCorrecaoUtilizada) {
        this.teorDeFosforoNoSolo = teorDeFosforoNoSolo;
        this.teorDeFosforoDesejado = teorDeFosforoDesejado;
        this.eficiencia = eficiencia;
        this.fonteDeCorrecaoUtilizada = fonteDeCorrecaoUtilizada;
        System.arraycopy(fonteDeCorrecao.correcaoFosforo(), 0, fontes, 0, 12);
    }

    public String getTeorDeFosforoNoSolo() {
        return teorDeFosforoNoSolo;
    }

    public void setTeorDeFosforo(String teorDeFosforo) {
        this.teorDeFosforo = teorDeFosforoNoSolo;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public int getFonteDeCorrecaoUtilizada() {
        return fonteDeCorrecaoUtilizada;
    }

    public fonteDeCorrecao[] getFontes() {
        return fontes;
    }

    public String resultado() {
        //Custo
        double quantidade=0, custo=0, qtdFosforoEmMgDm, qtdFosforoEmKgHa, qtdP2O5EmKgHa, qtdP2O5EmKgHa, qtdDeFonteEmKgHa, 
                qtdDeFonteEmKgAlqueire;
        double nutrienteExtra1, nutrienteExtra2;
        String nomeNutrienteExtra1, nomeNutrienteExtra2;
        qtdFosforoEmMgDm = this.teorDeFosforoNoSolo - this.teorDeFosforoDesejado;
        if (qtdFosforoEmMgDm < 0.01) {
            return 0;
        }
        qtdFosforoEmKgHa = qtdFosforoEmMgDm*2;
        qtdP2O5EmKgHa = qtdFosforoEmKgHa*2,29;
        qtdP2O5EmKgHa *= 100/(this.eficiencia/100);
        qtdDeFonteEmKgHa = qtdP2O5EmKgHa * 100 / this.fontes[fonteDeCorrecaoUtilizada].getTeor();
        qtdDeFonteEmKgAlqueire = qtdDeFonteEmKgHa*2;
        custo = (qtdDeFonteEmKgAlqueire * fontes[fonteDeCorrecaoUtilizada].getPreco())/(1000*2,42);
        quantidade = qtdDeFonteEmKgHa;
        //"Essa correção de FÓSFORO, fornecerá também (kg/ha):"
        switch(fonteDeCorrecaoUtilizada){
            case 0:
                nomeNutrienteExtra1 = "Enxofre";
                nutrienteExtra1 = (qtdDeFonteEmKgAlqueire*0,1)/2,42;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 1:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.2)/2.42;
                break;
            case 2:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Nitrogenio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.09)/2.42;
                break;
            case 3:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Nitrogenio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.16)/2.42;
                break;
            case 4:
                nomeNutrienteExtra1 = "Magnesio";
                nutrienteExtra1 = qtdDeFonteEmKgHa*0,15;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 5:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.52)/2.42;
                break;
            case 6:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.52)/2.42;
                break;
            case 7:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.45)/2.42;
                break;
            case 8:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 9:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.44)/2.42;
                break;
            case 10:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.0);
                break;
            case 11:
                nomeNutrienteExtra1 = "Enxofre"
                nutrienteExtra1 = (qtdDeFonteEmKgAlqueire*0,1)/2,42
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (qtdDeFonteEmKgAlqueire * 0.18)/2.42;
                break;
        }
        return "Quantidade a se aplicar: "+quantidade+"\nCusto R$/ha: "+custo;
    }
    
}
