/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xande
 */
public class TestandoAplicacao {
    
    public TestandoAplicacao() {
    }
    
    @Test
    public void TesteQuadranteTeoresdosolo() {
        AmostraDoSolo amostra = new AmostraDoSolo(8.59,0.15,5.76,1.63,3.67,0.0,5.35,30.7);
        assertEquals(9.0, TexturaSolo.ARGILOSO.getQTDIdealFosforo(), 0.0);
        assertEquals(0.35,TexturaSolo.ARGILOSO.getQTDIdealPotassio() , 0.0);
        assertEquals(6.0, TexturaSolo.ARGILOSO.getQTDIdealCalcio(), 0.0);
        assertEquals(1.5, TexturaSolo.ARGILOSO.getQTDIdealMagnesio(), 0.0);
        assertEquals(9.0, TexturaSolo.ARGILOSO.getQTDIdealEnxofre(), 0.0);
        assertEquals(0.0, TexturaSolo.ARGILOSO.getQTDIdealAluminio(), 0.0);
        assertEquals(7.54, amostra.somaCmol(),0.0);//testar Scmol
        assertEquals(12.89, amostra.ctc(),0.0);//testar CTC cmol
        assertEquals(58.494957331264544, amostra.satBaseV(),0.0);//testar V%atual
        assertEquals(3.07, amostra.moCento(),0.0);//testar M.O.%
        assertEquals(17.848837209302324, amostra.carbono(),0.0);//Testar carbono
    }
    
    @Test
    public void TesteQuadranteCorrecaoRecuperacaoDeFosforo() {
        CorrecaoDeFosforo c = new CorrecaoDeFosforo(8.59,12.0,0,70.0,1260.0);
        assertEquals(123.95079365079366, c.getquantidadeAAplicarKaHa(),0.0);//Testar quantidade a aplicar em kgHa
        assertEquals(156.178, c.getCustoRsHa(),0.0);//Testar quantidade a aplicar em kgHa
        assertEquals("Superfosfato Simples",FonteDeCorrecao.correcaoFosforo()[0].getNome());//Testando o nome da fonte de fosforo a utilizar
        assertEquals("Enxofre",c.getnomeNutrienteExtra1());//Testando o nome do nutriente Extra 1
        assertEquals(12.395079365079365, c.getnutrienteExtra1(),0.0);//Testar quantidade do nutriente Extra 1
        assertEquals("Calcio",c.getnomeNutrienteExtra2());//Testando o nome do nutriente Extra 2
        assertEquals(34.70622222222223, c.getnutrienteExtra2(),0.0);//Testar quantidade do nutriente Extra 2   
    }
    
    @Test
    public void TesteQuadranteCorrecaoRecuperacaoDePotassio() {
        AmostraDoSolo amostra = new AmostraDoSolo(8.59,0.15,5.76,1.63,3.67,0.0,5.35,30.7);
        CorrecaoDePotassio cp = new CorrecaoDePotassio(3.0,0.15,3.0,0,amostra,2500.00);
        assertEquals(450.5462068965517, cp.getQuantidadeAaplicarParaRecuperacaoDoPotassio(),0.0);//Testando a quantidade a aplicar de recuperação de potassio
        assertEquals(1126.3655172413792, cp.getCustoDeRecuperacaoDoPotassio(),0.0);//Testando do custo a aplicar sobre a recuperação do potassio
    }
}
