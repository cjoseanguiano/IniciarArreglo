package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arreglo;
        arreglo = new int[10];
        System.out.printf("%s%8s\n", "Indice", "Valor");
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%5d%8d\n", contador, arreglo[contador]);
        }
    }
}
