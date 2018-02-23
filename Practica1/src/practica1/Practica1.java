/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import practica1.potenciaCuadrado;


/**
 *
 * @author tosh
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //potenciaCuadrado pc = new potenciaCuadrado();
        //double resultado = pc.potenciaCuadrado(5);

        //System.out.println("El resultado es: " + Double.toString(resultado));

        /*
        double radicando = 8;
        System.out.println("La raiz cuadrada de " + radicando + " es: " + Practica1.raizCubica(radicando));
        */

        double base = 2;
        System.out.println("" + base + " al cubo es: " + Practica1.potenciaCubo(base));


    }

    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return (n*factorial(n-1));
    }

    /**
     * Funcion que calcula la raiz cubica del numero envidado por parametro
     * @param radicando Valor a calcular la raiz cuadrada
     * @return raiz cuadra del numero enviado por parametro
     */
    public static double raizCubica(double radicando){
        return Math.pow(radicando, (double)1/3);
    }

    /**
     * Funcion que calcula la potencia al cubo del numero enviado por parametro
     * @param base Valor a elevar al cubo
     * @return retorna el numero enviado como base a la potencia 3
     */
    public static double potenciaCubo(double base){
        return Math.pow(base, (double)3);
    }

    /**
     * Funcion que multiplica 2 numeros 
     * @param val1,val2 numeros a multiplicar
     * @return retorna la multiplicacion de los 2 numeros
     */
    public static double Multiplicar(double val1,double val2) ){
        return val1*val2;
    }

    /**
     * Funcion que divide 2 numeros o
     * @param val1,val2 numeros a dividir
     * @return retorna la division de los 2 numeros
     */
    public static double Dividir(double val1,double val2) ){
        if(val2==0){
            System.out.println("Error... El divisor no puede ser cero");
            return 0.0;
        }else{
            return val1/val2;
        }
    }

}
