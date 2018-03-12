/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubica;

import java.util.Scanner;
import localiza.Localiza;
/**
 *
 * @author Silvia
 */
public class Ubicacion {
    public static void main(String[] args){
        Scanner leer_fila_columna = new Scanner(System.in);
        Scanner leer_array = new Scanner(System.in);
        int fila, columna;
        
        
        System.out.print("Introducir el número de filas y columnas en el array: ");
        fila = leer_fila_columna.nextInt();
        columna = leer_fila_columna.nextInt();
        double[][] matriz = new double[fila][columna];

        System.out.println("Introducir el array: ");
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = leer_array.nextDouble();
            }
        }
        
        Localiza localizacion = Localiza.localizaMayor(matriz);
        fila = localizacion.fila;
        columna = localizacion.columna;
        System.out.println("La localizacion del mayor elemento esta en " + "(" +(fila+1)+ "," +(columna+1)+ ") y es " +localizacion.maxValor);
    }
   
}

