/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaolucasguedes.primeiroprojetojunit5;

/**
 *
 * @author lucasguedes
 */
public class MathUtil {

    public static int mdc(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        //Proprieddade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        //Proprieddade 1
        if (b > 0 && a % b == 0) {
            return b;
        }

        //Proprieddade 3
        if (b == 0) {
            return Math.abs(a);
        }

        //Proprieddade 5
        if (a % b != 0) {
            return 1;
        }

        return -1;
    }

}
