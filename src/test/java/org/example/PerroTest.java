package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerroTest {
    @Test
    public void testRaza(){
        Perro toby = new Perro ();
        toby.raza = "Terrier";
        assertEquals("Terrier",toby.raza);
    }
}
