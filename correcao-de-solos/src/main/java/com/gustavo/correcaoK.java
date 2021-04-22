package com.gustavo;

import javax.lang.model.element.QualifiedNameable;

/* 
        Dados de entrada:
            Participação do Potássio na CTC, desejada;
            Fonte de Potássio;
            Valor em toneladas;

        Dados de saída:
            Quantidade a aplicar;
            Custo R$/ha;
    */

public class correcaoK {
    private double participacaoNaCTCDesejada;
    private double teorDePotassioNoSolo;
    private double teorDePotassioDesejado;
    private int fonteDeCorrecaoUtilizada;
    private fonteDeCorrecao fontes[] = new fonteDeCorrecao[3];

    public correcaoK(double participacao, double teorDePotassioNoSolo, double teorDePotassioDesejado, int fonteDeCorrecaoUtilizada) {
        this.participacaoNaCTCDesejada = participacao;
        this.teorDePotassioNoSolo = teorDePotassioNoSolo;
        this.teorDePotassioDesejado = teorDePotassioDesejado;
        this.fonteDeCorrecaoUtilizada = fonteDeCorrecaoUtilizada;
        System.arraycopy(fonteDeCorrecao.correcaoPottasio(), 0, fontes, 0, 3);
    }

    public double getParticipacaoNaCTCDesejada() {
        return participacao;
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

    public fonteDeCorrecao[] getFontes() {
        return fontes;
    }

    public void setPrecoFonte(int i, double preco) {
        fontes[i].setPreco(preco);
    }

    public String resultado(amostraDoSolo teoresDoSolo) {
        //falta o cálculo
        double quantidade, custo;
        double participacaoNaCTCAtual, qtdKNecessarioCmolDm3, qtdKMgDm3, qtdKKgHa, qtdK2OKgHa, qtdK2OEficiencia, 
                qtdFonteKgHa, qtdFonteKgAlqueire, custoAlqueire;
        participacaoNaCTCAtual = this.teorDePotassioNoSolo / teoresDoSolo.ctc();
        qtdKNecessarioCmolDm3 = (this.teorDePotassioNoSolo*participacaoNaCTCDesejada/participacaoNaCTCAtual) - this.teorDePotassioNoSolo;
        qtdKMgDm3 = qtdKNecessarioCmolDm3*39.1*10;
        if (qtdKMgDm3 < 0.01) {
            quantidade = 0;
        }
        qtdKKgHa = qtdKMgDm3*2;
        qtdK2OKgHa = qtdKKgHa*1.2;
        qtdK2OEficiencia = qtdK2OKgHa*100/0.85;
        qtdFonteKgHa = qtdK2OEficiencia*100/fontes[fonteDeCorrecaoUtilizada].getTeor();
        qtdFonteKgAlqueire = qtdFonteKgHa*2.42;
        custoAlqueire = qtdFonteKgAlqueire*fontes[fonteDeCorrecaoUtilizada].getPreco()/1000.0;
        custo = custoAlqueire/2.42;
        quantidade = qtdFonteKgHa;
        return "Quantidade a se aplicar: "+quantidade+"\nCusto R$/ha: "+custo;
    }

}