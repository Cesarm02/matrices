package org.example;

import java.util.Scanner;

class Matriz{
    int n; //Tamaño de matriz cuadrada
    double m [][];     //Datos

    void capturarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño de la matriz: ");
        n = sc.nextInt();
        m = new double[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print( " Ingrese el elemento de matriz (" + i + " , " + j + "):");
                m[i][j] = sc.nextDouble();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();

        m1.capturarDatos();

    }
}