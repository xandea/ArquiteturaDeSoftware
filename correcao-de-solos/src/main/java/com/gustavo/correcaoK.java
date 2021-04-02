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
    private fonteDeCorrecao fontes[] = new fonteDeCorrecao[3];

    public correcaoK(double participacao) {
        this.participacao = participacao;
        System.arraycopy(fonteDeCorrecao.correcaoPottasio(), 0, fontes, 0, 3);
    }

    public double getParticipacao() {
        return participacao;
    }

    public fonteDeCorrecao[] getFontes() {
        return fontes;
    }

    public void setPrecoFonte(int i, double preco) {
        fontes[i].setPreco(preco);
    }

    public String resultado() {
        //falta o cálculo
        double quantidade=0, custo=0;
        return "Quantidade a se aplicar: "+quantidade+"\nCusto R$/ha: "+custo;
    }

}