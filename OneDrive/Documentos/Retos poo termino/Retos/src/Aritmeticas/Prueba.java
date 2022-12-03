package Aritmeticas;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int num1,num2;
        Calculadora resultados = new Calculadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número ");
        resultados.num1 = sc.nextInt();
        System.out.println("Digite el segundo número ");
        resultados.num2 = sc.nextInt();

        resultados.sumaNum();

        resultados.restaNum();
        System.out.println("El resultado de la operacón resta es de " + resultados.restaNum());

        resultados.numMayor();

        resultados.potencia1();
        resultados.potencia2();

    }

}