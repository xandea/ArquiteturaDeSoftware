package com.gustavo;

public class fonteDeCorrecao {
    private String nome;
    private double preco;

    public fonteDeCorrecao( String nome, double preco ) {
        this.nome = nome;
        this.preco = preco;
    }

    public static fonteDeCorrecao[] correcaoFosforo() {
        fonteDeCorrecao fontesDeFosforo[] = new fonteDeCorrecao[12];
        fontesDeFosforo[0] = new fonteDeCorrecao("Superfosfato Simples", 0.0);
        fontesDeFosforo[1] = new fonteDeCorrecao("Superfosfato Triplo", 0.0);
        fontesDeFosforo[2] = new fonteDeCorrecao("MAP", 0.0);
        fontesDeFosforo[3] = new fonteDeCorrecao("DAP", 0.0);
        fontesDeFosforo[4] = new fonteDeCorrecao("Yoorin", 0.0);
        fontesDeFosforo[5] = new fonteDeCorrecao("Fosfato Arad", 0.0);
        fontesDeFosforo[6] = new fonteDeCorrecao("Fosfato Gafsa", 0.0);
        fontesDeFosforo[7] = new fonteDeCorrecao("Fosfato Daoui", 0.0);
        fontesDeFosforo[8] = new fonteDeCorrecao("Fosf. Patos Minas", 0.0);
        fontesDeFosforo[9] = new fonteDeCorrecao("Escória de Thomas", 0.0);
        fontesDeFosforo[10] = new fonteDeCorrecao("Ácido Fosfórico", 0.0);
        fontesDeFosforo[11] = new fonteDeCorrecao("Multif.Magnesiano", 0.0);
        return fontesDeFosforo;
    }

    public static fonteDeCorrecao[] correcaoPottasio() {
        fonteDeCorrecao fontesDePotassio[] = new fonteDeCorrecao[3];
        fontesDePotassio[0] = new fonteDeCorrecao("Cloreto de Potássio", 0.0);
        fontesDePotassio[1] = new fonteDeCorrecao("Sulfato de Potássio", 0.0);
        fontesDePotassio[2] = new fonteDeCorrecao("Sulf.Potássio/Mag.", 0.0);
        return fontesDePotassio;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
