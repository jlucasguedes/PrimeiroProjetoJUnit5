/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaolucasguedes.primeiroprojetojunit5;

import java.util.Objects;

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

        return mdc(a - b, b);
    }
    
    public static int mdc(int ...valores) {
        
        Objects.requireNonNull(valores, "O parâmetro valores não pode ser nulo para calcular o MDC");
        
        if(valores.length == 0) {
            throw new IllegalArgumentException("É preciso indicar ao menos um valor para calcular o MDC");
        }
        int a= valores[0];
        for(int b : valores) {
          a =   mdc(a, b);
        }
        return a;
    }
}
