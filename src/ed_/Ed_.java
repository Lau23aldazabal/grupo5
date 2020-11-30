/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_;

import java.util.Scanner;

/**
 *
 * @author numer
 */
public class Ed_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op,n;
        do {
            System.out.println("Introduce una opcion: ");
            System.out.println("1: La suma de dos numeros introducidor por teclado.");
            System.out.println("2: ");
            System.out.println("3: Eleva él número a un número.");
            System.out.println("4: Número par o impar.");
            System.out.println("5: Calcula la raíz cuadrada de un número.");
            System.out.println("6: Salir");
            op = teclado.nextInt();
            switch (op) {
                case 1: //Laura:
                    System.out.println("Introduce el primer numero: ");
                    int a = teclado.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    int b = teclado.nextInt();
                    int suma = a + b;
                    System.out.println("El resultado de: " + a + " + " + b + " es: " + suma);
                    break;
                case 2:  //Sara:
                    break;
                case 3: //Carlos:
                    System.out.println("Escribe el numero ha elevar");
                    n = teclado.nextInt();
                    System.out.println("A que quieres elevar el " + n);
                    int aux = teclado.nextInt();
                    System.out.println("El cuadrado de " + n + " es: " + Math.pow(n, aux));
                    break;
                case 4: //Laura:
                    System.out.println("Escribe el numero, para saber si es par o impar: ");
                    n = teclado.nextInt();
                    if (n % 2 == 0) {
                        System.out.println("El numero es par");
                    } else {
                        System.out.println("El numero es impar");
                    }
                    break;
                case 5: //Carlos:
                    System.out.println("Escribe el numero, para saber su raíz cuadrada:");
                    n = teclado.nextInt();
                    System.out.println("√"+n+" = "+Math.sqrt(n));
                    break;
                case 6:
                    System.out.println("Has salido con exito.");
                    break;
                default:
                    System.out.println("Se ha confundido de opcion. ");

            }
        } while (op != 5);
    }

}
