package com.gustavo;

public class CorrecaoDeFosforo {
    private String teorDeFosforoNoSolo;
    private String teorDeFosforoDesejado;
    private double eficienciaDoFosforo;
    private int fonteDeCorrecaoUtilizada;
    private fonteDeCorrecao fontesDeCorrecao[] = new fonteDeCorrecao[12];

    public CorrecaoDeFosforo(String teorDeFosforoNoSolo, String teorDeFosforoDesejado, double eficienciaDoFosforo, int fonteDeCorrecaoUtilizada) {
        this.teorDeFosforoNoSolo = teorDeFosforoNoSolo;
        this.teorDeFosforoDesejado = teorDeFosforoDesejado;
        this.eficienciaDoFosforo = eficienciaDoFosforo;
        this.fonteDeCorrecaoUtilizada = fonteDeCorrecaoUtilizada;
        System.arraycopy(fonteDeCorrecao.correcaoFosforo(), 0, fontesDeCorrecao, 0, 12);
    }

    public String getTeorDeFosforoNoSolo() {
        return teorDeFosforoNoSolo;
    }

    public void setTeorDeFosforo(String teorDeFosforo) {
        this.teorDeFosforo = teorDeFosforoNoSolo;
    }

    public double getEficienciaDoFosforo() {
        return eficienciaDoFosforo;
    }

    public int getFonteDeCorrecaoUtilizada() {
        return fonteDeCorrecaoUtilizada;
    }

    public fonteDeCorrecao[] getFontes() {
        return fontesDeCorrecao;
    }

    public String resultado() {
        //Custo
        double  quantidade=0, custo=0, 
                quantidadeFosforoEmMgDm, 
                quantidadeFosforoEmKgHa, 
                quantidadeP2O5EmKgHa, 
                quantidadeP2O5EmKgHa, 
                quantidadeDeFonteEmKgHa, 
                quantidadeDeFonteEmKgAlqueire;
        double nutrienteExtra1, nutrienteExtra2;
        String nomeNutrienteExtra1, nomeNutrienteExtra2;
        quantidadeFosforoEmMgDm = this.teorDeFosforoNoSolo - this.teorDeFosforoDesejado;
        if (quantidadeFosforoEmMgDm < 0.01) {
            return "Nao ha necessidade de correcao";
        }
        quantidadeFosforoEmKgHa = quantidadeFosforoEmMgDm*2;
        quantidadeP2O5EmKgHa = quantidadeFosforoEmKgHa*2,29;
        quantidadeP2O5EmKgHa *= 100/(this.eficienciaDoFosforo/100);
        quantidadeDeFonteEmKgHa = quantidadeP2O5EmKgHa * 100 / this.fontesDeCorrecao[fonteDeCorrecaoUtilizada].getTeor();
        quantidadeDeFonteEmKgAlqueire = quantidadeDeFonteEmKgHa*2;
        custo = (quantidadeDeFonteEmKgAlqueire * fontesDeCorrecao[fonteDeCorrecaoUtilizada].getPreco())/(1000*2,42);
        quantidade = quantidadeDeFonteEmKgHa;
        //"Essa correção de FÓSFORO, fornecerá também (kg/ha):"
        switch(fonteDeCorrecaoUtilizada){
            case 0:
                nomeNutrienteExtra1 = "Enxofre";
                nutrienteExtra1 = (quantidadeDeFonteEmKgAlqueire*0,1)/2,42;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 1:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.2)/2.42;
                break;
            case 2:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Nitrogenio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.09)/2.42;
                break;
            case 3:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Nitrogenio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.16)/2.42;
                break;
            case 4:
                nomeNutrienteExtra1 = "Magnesio";
                nutrienteExtra1 = quantidadeDeFonteEmKgHa*0,15;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 5:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.52)/2.42;
                break;
            case 6:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.52)/2.42;
                break;
            case 7:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.45)/2.42;
                break;
            case 8:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 9:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.44)/2.42;
                break;
            case 10:
                nomeNutrienteExtra1 = "";
                nutrienteExtra1 = 0.0;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.0);
                break;
            case 11:
                nomeNutrienteExtra1 = "Enxofre"
                nutrienteExtra1 = (quantidadeDeFonteEmKgAlqueire*0,1)/2,42
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.18)/2.42;
                break;
        }
        return "Quantidade a se aplicar: "+quantidade+"\nCusto R$/ha: "+custo;
    }
    
}
