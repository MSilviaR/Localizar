/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localiza;

/**
 *
 * @author Silvia
 */
public class Localiza {
    public int fila;
    public int columna;
    public double maxValor;
    
    
    public Localiza(int fila, int columna,double maxValor){
        this.fila = fila;
        this.columna = columna;
        this.maxValor = maxValor;
    }

    public static Localiza localizaMayor(double[][] a){
        int fila = 0;
        int columna = 0;
        double mayor = 0;
        
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a[i].length; j++){
                if(mayor < a[i][j]){
                    mayor = a[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        return new Localiza(fila,columna,mayor);
        
    }    
    
}


