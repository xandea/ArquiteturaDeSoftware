package com.gustavo;

public class FonteDeCorrecao {
    private final String nome;
    private double preco;
    private final double teor;

    public FonteDeCorrecao (String nome, double preco, double teor) {
        this.nome = nome;
        this.preco = preco;
        this.teor = teor;
    }
    
    public static FonteDeCorrecao[] correcaoFosforo() {
        FonteDeCorrecao fontesDeFosforo[] = new FonteDeCorrecao[12];
        fontesDeFosforo[0] = new FonteDeCorrecao("Superfosfato Simples", 0.0, 18.0);
        fontesDeFosforo[1] = new FonteDeCorrecao("Superfosfato Triplo", 0.0, 41.0);
        fontesDeFosforo[2] = new FonteDeCorrecao("MAP", 0.0, 48.0);
        fontesDeFosforo[3] = new FonteDeCorrecao("DAP", 0.0, 45.0);
        fontesDeFosforo[4] = new FonteDeCorrecao("Yoorin", 0.0, 18.0);
        fontesDeFosforo[5] = new FonteDeCorrecao("Fosfato Arad", 0.0, 33.0);
        fontesDeFosforo[6] = new FonteDeCorrecao("Fosfato Gafsa", 0.0, 29.0);
        fontesDeFosforo[7] = new FonteDeCorrecao("Fosfato Daoui", 0.0, 32.0);
        fontesDeFosforo[8] = new FonteDeCorrecao("Fosf. Patos Minas", 0.0, 24.0);
        fontesDeFosforo[9] = new FonteDeCorrecao("Escória de Thomas", 0.0, 18.5);
        fontesDeFosforo[10] = new FonteDeCorrecao("Ácido Fosfórico", 0.0, 52.0);
        fontesDeFosforo[11] = new FonteDeCorrecao("Multif.Magnesiano", 0.0, 18.0);
        return fontesDeFosforo;
    }

    public static FonteDeCorrecao[] correcaoPottasio() {
        FonteDeCorrecao fontesDePotassio[] = new FonteDeCorrecao[3];
        fontesDePotassio[0] = new FonteDeCorrecao("Cloreto de Potássio", 0.0, 58.0);
        fontesDePotassio[1] = new FonteDeCorrecao("Sulfato de Potássio", 0.0, 52.0);
        fontesDePotassio[2] = new FonteDeCorrecao("Sulf.Potássio/Mag.", 0.0, 22.0);
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

    public double getTeor() {
        return teor;
    }
    
}
