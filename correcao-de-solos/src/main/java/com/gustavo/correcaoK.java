package com.gustavo;

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
    private double participacao;
    private fonteDeCorrecao fontes[];

    public double getParticipacao() {
        return participacao;
    }

    public void setParticipacao(double participacao) {
        this.participacao = participacao;
    }

    public fonteDeCorrecao[] getFontes() {
        return fontes;
    }

    public void setFontes(fonteDeCorrecao[] fontes) {
        this.fontes = fontes;
    }
}
