package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Perro toby = new Perro ();
        toby.raza = "Terrier";
        Perro otto = new Perro();
        otto.raza = "Pastor Aleman";
        System.out.println("La raza de Toby es:"+toby.raza+".");
        System.out.println("La raza de Otto es:"+otto.raza+".");

        //Probamos que se inicializa bien
        Perro perro = new Perro();
        System.out.println("La raza es:"+perro.raza);

        //Creamos con el nuevo constructor
        Perro fluky = new Perro("Pastor de aguas");
        System.out.println("La raza de fluky es:"+fluky.getRaza());
        fluky.setRaza("Pastor de AGUAS");
        System.out.println("La raza de fluky es:"+fluky.getRaza());


        //Pruebas de calculadora
        Float resultado = Calculadora.suma((float)1,(float)2);
        System.out.println(resultado);
        Float resultado2 = Calculadora.resta((float)2,(float)1);
        System.out.println(resultado2);
        Float resultado3 = Calculadora.multi((float)2,(float)1);
        System.out.println(resultado3);
        Float resultado4 = Calculadora.divi((float)2,(float)2);
        System.out.println(resultado4);
    }
}
