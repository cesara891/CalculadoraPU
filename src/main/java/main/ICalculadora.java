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
public interface ICalculadora {
    int suma(int a, int b);

    int resta(int a, int b);

    int multiplicacion(int a, int b);

    int division(int a, int b) throws Exception;

    boolean iguales(int a, int b);
}
