package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSuma(){
        Float resultado = Calculadora.suma((float)1,(float)2);
        assertEquals((float)3,resultado);
    }
    @Test
    public void testResta(){
        Float resultado = Calculadora.resta((float)2,(float)1);
        assertEquals((float)1,resultado);
    }
    @Test
    public void testMulti(){
        Float resultado = Calculadora.multi((float)1,(float)2);
        assertEquals((float)2,resultado);
    }
    @Test
    public void testDivi(){
        Float resultado = Calculadora.divi((float)2,(float)1);
        assertEquals((float)2,resultado);
    }
}
