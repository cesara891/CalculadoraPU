/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author arangocg
 */
public class Calculadora implements ICalculadora{

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("No se puede dividir por cero");
        }
        return a / b;
    }

    public boolean iguales(int a, int b) {
        boolean result = false;
        if (a == b) {
                result = true;
        }
        return result;
    }
    
}
