package com.gustavo;

public class CorrecaoDeCalcioMagnesio {
    private double participacao;
    private double PRNT;
    private double teorCaO;
    private FonteDeCorrecao fontesDeCorrecao[];

    public double getParticipacao() {
        return participacao;
    }

    public void setParticipacao(double participacao) {
        this.participacao = participacao;
    }

    public double getPRNT() {
        return PRNT;
    }

    public void setPRNT(double PRNT) {
        PRNT = pRNT;
    }

    public double getTeorCaO() {
        return teorCaO;
    }

    public void setTeorCaO(double teorCaO) {
        this.teorCaO = teorCaO;
    }

    public FonteDeCorrecao[] getfontesDeCorrecaoDeCorrecao() {
        return fontesDeCorrecao;
    }

    public void setfontesDeCorrecao(FonteDeCorrecao[] fontesDeCorrecao) {
        this.fontesDeCorrecao = fontesDeCorrecao;
    }

    public String resultado() {
        //falta o cálculo
        double quantidade=0, custo=0;
        return "Quantidade a se aplicar: "+quantidade+"\nCusto R$/ha: "+custo;
    }

}
