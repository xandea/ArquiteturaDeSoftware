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
        assertEquals(7.54, amostra.somaCmol(),0.0);//testar Scmol
        assertEquals(12.89, amostra.ctc(),0.0);//testar CTC cmol
        assertEquals(58.494957331264544, amostra.satBaseV(),0.0);//testar V%atual
        assertEquals(3.07, amostra.moCento(),0.0);//testar M.O.%
        assertEquals(17.848837209302324, amostra.carbono(),0.0);//Testar carbono
        
    }
}
