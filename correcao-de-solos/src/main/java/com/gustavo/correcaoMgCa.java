package com.gustavo;

    /* 
        Dados de entrada:
            % de participação do CÁLCIO na CTC, desejada;
            PRNT;
            Teor de CaO do corretivo;
            Fonte de Cálcio e Magnésio;
            Valor em toneladas;

        Dados de saída:
            Quantidade a aplicar;
            Custo R$/ha;
    */

public class correcaoMgCa {
    private double participacao;
    private double PRNT;
    private double teorCaO;
    private fonteDeCorrecao fontes[];

    public double getParticipacao() {
        return participacao;
    }

    public void setParticipacao(double participacao) {
        this.participacao = participacao;
    }

    public double getPRNT() {
        return PRNT;
    }

    public void setPRNT(double pRNT) {
        PRNT = pRNT;
    }

    public double getTeorCaO() {
        return teorCaO;
    }

    public void setTeorCaO(double teorCaO) {
        this.teorCaO = teorCaO;
    }

    public fonteDeCorrecao[] getFontes() {
        return fontes;
    }

    public void setFontes(fonteDeCorrecao[] fontes) {
        this.fontes = fontes;
    }

}
