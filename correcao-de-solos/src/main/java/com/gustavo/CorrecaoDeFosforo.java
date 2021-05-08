package com.gustavo;

public class CorrecaoDeFosforo {
    private double quantidadeAAplicarKaHa;
    private double custoRsHa;
    private FonteDeCorrecao fontesDeCorrecao[] = new FonteDeCorrecao[12];

    public CorrecaoDeFosforo(
            double teorDeFosforoNoSolo, 
            double teorDeFosforoDesejado, 
            FonteDeCorrecao[] fontesDeCorrecao, 
            int fonteDeCorrecaoUtilizada,
            int eficienciaDoFosforo) {
        System.arraycopy(FonteDeCorrecao.correcaoFosforo(), 0, fontesDeCorrecao, 0, 12);
        this.quantidadeAAplicarKaHa = calculaQuandidadeAAplicar(teorDeFosforoNoSolo, teorDeFosforoDesejado,fontesDeCorrecao, fonteDeCorrecaoUtilizada,eficienciaDoFosforo);
        this.custoRsHa = calculaCusto(fontesDeCorrecao, fonteDeCorrecaoUtilizada);
    }

    private double calculaQuandidadeAAplicar(
                    double teorDeFosforoNoSolo, 
                    double teorDeFosforoDesejado, 
                    FonteDeCorrecao[] fontesDeCorrecao, 
                    int fonteDeCorrecaoUtilizada,
                    int eficienciaDoFosforo) {
        double  quantidadeFosforoEmMgDm; 
        double quantidadeFosforoEmKgHa;
        double quantidadeP2O5EmKgHa;
        double quantidadeDeFonteEmKgHa;
        quantidadeFosforoEmMgDm = teorDeFosforoDesejado - teorDeFosforoNoSolo;
        if (quantidadeFosforoEmMgDm < 0.01) {
            return 0.0;
        }
        quantidadeFosforoEmKgHa = quantidadeFosforoEmMgDm*2;
        quantidadeP2O5EmKgHa = quantidadeFosforoEmKgHa*2.29;
        quantidadeP2O5EmKgHa *= 100/(eficienciaDoFosforo/100);
        quantidadeDeFonteEmKgHa = quantidadeP2O5EmKgHa * 100 / this.fontesDeCorrecao[fonteDeCorrecaoUtilizada].getTeor();
        return quantidadeDeFonteEmKgHa;
    }

    private double calculaCusto (FonteDeCorrecao[] fontesDeCorrecao, int fonteDeCorrecaoUtilizada) {
        return (this.quantidadeAAplicarKaHa*2.0*fontesDeCorrecao[fonteDeCorrecaoUtilizada].getPreco())/(1000*2.42);
    }

    private void imprimeNutrienteExtra(int fonteDeCorrecaoUtilizada, double quantidadeDeFonteEmKgAlqueire, double quantidadeDeFonteEmKgHa) {
        String nomeNutrienteExtra1;
        String nomeNutrienteExtra2;
        double nutrienteExtra1; 
        double nutrienteExtra2;
        switch(fonteDeCorrecaoUtilizada){
            case 0:
                nomeNutrienteExtra1 = "Enxofre";
                nutrienteExtra1 = (quantidadeDeFonteEmKgAlqueire*0.1)/2.42;
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
                nutrienteExtra1 = quantidadeDeFonteEmKgHa*0.15;
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
                nomeNutrienteExtra1 = "Enxofre";
                nutrienteExtra1 = (quantidadeDeFonteEmKgAlqueire*0.1)/2.42;
                nomeNutrienteExtra2 = "Calcio";
                nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.18)/2.42;
                break;
    }
    }
}
