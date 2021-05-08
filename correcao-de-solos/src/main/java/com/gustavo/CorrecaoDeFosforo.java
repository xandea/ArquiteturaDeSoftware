package com.gustavo;

public class CorrecaoDeFosforo {
    private double quantidadeAAplicarKaHa;
    private double custoRsHa;
    private String nomeNutrienteExtra1;
    private String nomeNutrienteExtra2;
    private double nutrienteExtra1;
    private double nutrienteExtra2;

    public double getCustoRsHa(){
        return this.custoRsHa;
    }
    public double getquantidadeAAplicarKaHa(){
        return this.quantidadeAAplicarKaHa;
    }
    public String getnomeNutrienteExtra1(){
        return this.nomeNutrienteExtra1;
    }
    public String getnomeNutrienteExtra2(){
        return this.nomeNutrienteExtra2;
    }
    public double getnutrienteExtra1(){
        return this.nutrienteExtra1;
    }
    public double getnutrienteExtra2(){
        return this.nutrienteExtra2;
    }
    

    public CorrecaoDeFosforo(
            double teorDeFosforoNoSolo, 
            double teorDeFosforoDesejado, 
            /*FonteDeCorrecao[] fontesDeCorrecao,*/ 
            int fonteDeCorrecaoUtilizada,
            double eficienciaDoFosforo,
            double precoDaFonte) {
        //System.arraycopy(FonteDeCorrecao.correcaoFosforo(), 0, fontesDeCorrecao, 0, 12);
        this.quantidadeAAplicarKaHa = calculaQuandidadeAAplicar(teorDeFosforoNoSolo,teorDeFosforoDesejado,/*fontesDeCorrecao,*/fonteDeCorrecaoUtilizada,eficienciaDoFosforo);
        this.custoRsHa = calculaCusto(precoDaFonte);
        imprimeNutrienteExtra(fonteDeCorrecaoUtilizada, quantidadeAAplicarKaHa*2.42, quantidadeAAplicarKaHa);
    }

    private double calculaQuandidadeAAplicar(
                    double teorDeFosforoNoSolo, 
                    double teorDeFosforoDesejado, 
                    /*FonteDeCorrecao[] fontesDeCorrecao,*/ 
                    int fonteDeCorrecaoUtilizada,
                    double eficienciaDoFosforo) {
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
        quantidadeDeFonteEmKgHa = quantidadeP2O5EmKgHa/FonteDeCorrecao.correcaoFosforo()[fonteDeCorrecaoUtilizada].getTeor();
        return quantidadeDeFonteEmKgHa;
    }

    private double calculaCusto (double precoDaFonte) {
        return (this.quantidadeAAplicarKaHa/1000*precoDaFonte);
    }

    private void imprimeNutrienteExtra(int fonteDeCorrecaoUtilizada, double quantidadeDeFonteEmKgAlqueire, double quantidadeDeFonteEmKgHa) {
        switch(fonteDeCorrecaoUtilizada){
            case 0:
                this.nomeNutrienteExtra1 = "Enxofre";
                this.nutrienteExtra1 = (quantidadeDeFonteEmKgAlqueire*0.1)/2.42;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 1:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.2)/2.42;
                break;
            case 2:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Nitrogenio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.09)/2.42;
                break;
            case 3:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Nitrogenio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.16)/2.42;
                break;
            case 4:
                this.nomeNutrienteExtra1 = "Magnesio";
                this.nutrienteExtra1 = quantidadeDeFonteEmKgHa*0.15;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 5:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.52)/2.42;
                break;
            case 6:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.52)/2.42;
                break;
            case 7:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.45)/2.42;
                break;
            case 8:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.28)/2.42;
                break;
            case 9:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.44)/2.42;
                break;
            case 10:
                this.nomeNutrienteExtra1 = "";
                this.nutrienteExtra1 = 0.0;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.0);
                break;
            case 11:
                this.nomeNutrienteExtra1 = "Enxofre";
                this.nutrienteExtra1 = (quantidadeDeFonteEmKgAlqueire*0.1)/2.42;
                this.nomeNutrienteExtra2 = "Calcio";
                this.nutrienteExtra2 = (quantidadeDeFonteEmKgAlqueire * 0.18)/2.42;
                break;
    }
    }
}
