package org.example;

import java.util.Scanner;

class Matriz{
    int n; //Tamaño de matriz cuadrada
    double m [][];     //Datos

    void capturarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño de la matriz: ");
        n = sc.nextInt();
        m = new double[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print( "Ingrese el elemento de matriz (" + i + " , " + j + "):");
                m[i][j] = sc.nextDouble();
            }
        }
    }

    void mostrarMatriz(){
        System.out.println("Matriz:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    void sumarMatrices(Matriz matrizA, Matriz matrizB ){
        // Ejercicio para matrices cuadradas
        if (matrizA.n == matrizB.n){
            n = matrizA.n;
            m = new double[n][n];

            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    m[i][j] = matrizA.m[i][j] + matrizB.m[i][j];
                }
            }
            System.out.print("\n Resultado de la suma: ");
        }else {
            System.out.print("\n Las matrices no tienen la misma dimensión");

        }
    }

    void restarMatrices(Matriz matrizA, Matriz matrizB ){
        // Ejercicio para matrices cuadradas
        if (matrizA.n == matrizB.n){
            n = matrizA.n;
            m = new double[n][n];

            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    m[i][j] = matrizA.m[i][j] - matrizB.m[i][j];
                }
            }
            System.out.print("\n Resultado de la resta: ");
        }else {
            System.out.print("\n Las matrices no tienen la misma dimensión");

        }
    }

    void multiplicarMatrices(Matriz matrizA, Matriz matrizB){
        if(matrizA.n == matrizB.n){
            n = matrizA.n;
            m = new double[n][n];
            double elemento = 0;

            for(int i = 0; i < n ; i++){
                for (int j = 0; j < n ; j++){
                    for(int k = 0; k < n; k++){
                        elemento += matrizA.m[i][k] * matrizB.m[k][j];
                    }
                    m[i][j] = elemento;
                    elemento = 0;
                }
            }

        }else{
            System.out.print("\n Las matrices no tienen la misma dimensión");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        Matriz m2 = new Matriz();

        m1.capturarDatos();
        m2.capturarDatos();

        m1.mostrarMatriz();
        m2.mostrarMatriz();

        Matriz m3 = new Matriz();
        m3.sumarMatrices(m1, m2);
        m3.mostrarMatriz();
        m3.restarMatrices(m1, m2);
        m3.mostrarMatriz();
        m3.multiplicarMatrices(m1,m2);
        m3.mostrarMatriz();

    }
}