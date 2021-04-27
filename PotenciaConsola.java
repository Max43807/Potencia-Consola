/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenciaconsola;

import potenciaconsola.obj.Potencia;

/**
 *
 * @author Maxi
 */
public class PotenciaConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calcular varios valores para testing
        //Instancias
        Potencia x = new Potencia(4.0, 2);
        Potencia y = new Potencia(2.5, 1);
        Potencia z = new Potencia(5.7, 0);

        System.out.println(x.getB() + "elevado a la " + x.getE() + " potencia es " + x.obtenerPotencia());
        System.out.println(y.getB() + "elevado a la " + y.getE() + " potencia es " + y.obtenerPotencia());
        System.out.println(z.getB() + "elevado a la " + z.getE() + " potencia es " + z.obtenerPotencia());
    }

}
