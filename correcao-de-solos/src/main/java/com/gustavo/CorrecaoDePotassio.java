package com.gustavo;

public class CorrecaoDePotassio {
    private double participacaoNaCTCDesejada;
    private double teorDePotassioNoSolo;
    private double teorDePotassioDesejado;
    private int fonteDeCorrecaoUtilizada;
    private double quantidadeAaplicarParaRecuperacaoDoPotassio;
    private double custoDeRecuperacaoDoPotassio;
    
    private FonteDeCorrecao fontesDeCorrecao[] = new FonteDeCorrecao[3];

    public CorrecaoDePotassio(double participacao, double teorDePotassioNoSolo, double teorDePotassioDesejado, int fonteDeCorrecaoUtilizada, AmostraDoSolo teoresDoSolo,double precoDaFonte ) {
        this.participacaoNaCTCDesejada = participacao;
        this.teorDePotassioNoSolo = teorDePotassioNoSolo;
        this.teorDePotassioDesejado = teorDePotassioDesejado;
        this.fonteDeCorrecaoUtilizada = fonteDeCorrecaoUtilizada;
        resultado(teoresDoSolo, precoDaFonte);
        //System.arraycopy(FonteDeCorrecao.correcaoPottasio(), 0, fontesDeCorrecao, 0, 3);
    }
    
    public double getQuantidadeAaplicarParaRecuperacaoDoPotassio() {
        return quantidadeAaplicarParaRecuperacaoDoPotassio;
    }
    public double getCustoDeRecuperacaoDoPotassio() {
        return custoDeRecuperacaoDoPotassio;
    }
    
    public double getParticipacaoNaCTCDesejada() {
        return participacaoNaCTCDesejada;
    }

    public double getTeorDePotassioNoSolo() {
        return teorDePotassioNoSolo;
    }

    public double getTeorDePotassioDesejado() {
        return teorDePotassioDesejado;
    }

    public int getFonteDeCorrecaoUtilizada() {
        return fonteDeCorrecaoUtilizada;
    }

    public FonteDeCorrecao[] getFontes() {
        return fontesDeCorrecao;
    }

    public void setPrecoFonte(int i, double preco) {
        fontesDeCorrecao[i].setPreco(preco);
    }

    private void resultado(AmostraDoSolo teoresDoSolo, double precoDaFonte) {
        //falta o cálculo
        double quantidade, custo;
        double participacaoNaCTCAtual, quantidadeKNecessarioCmolDm3, quantidadeKMgDm3, quantidadeKKgHa, quantidadeK2OKgHa, quantidadeK2OEficiencia, 
                quantidadeFonteKgHa, quantidadeFonteKgAlqueire, custoAlqueire;
        participacaoNaCTCAtual = this.teorDePotassioNoSolo / teoresDoSolo.ctc()*100;
        quantidadeKNecessarioCmolDm3 = (this.teorDePotassioNoSolo*participacaoNaCTCDesejada/participacaoNaCTCAtual) - this.teorDePotassioNoSolo;
        quantidadeKMgDm3 = quantidadeKNecessarioCmolDm3*39.1*10;
        if (quantidadeKMgDm3 < 0.01) {
            quantidade = 0;
        }
        quantidadeKKgHa = quantidadeKMgDm3*2;
        quantidadeK2OKgHa = quantidadeKKgHa*1.2;
        quantidadeK2OEficiencia = quantidadeK2OKgHa*100/85.0;
        quantidadeFonteKgHa = quantidadeK2OEficiencia*100/FonteDeCorrecao.correcaoPottasio()[fonteDeCorrecaoUtilizada].getTeor();
        quantidadeFonteKgAlqueire = quantidadeFonteKgHa*2.42;
        custoAlqueire = quantidadeFonteKgAlqueire*precoDaFonte/1000.0;
        custo = custoAlqueire/2.42;
        quantidade = quantidadeFonteKgHa;
        this.quantidadeAaplicarParaRecuperacaoDoPotassio = quantidade;
        this.custoDeRecuperacaoDoPotassio = custo;
    }

}