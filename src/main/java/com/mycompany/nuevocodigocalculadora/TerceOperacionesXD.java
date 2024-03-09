/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevocodigocalculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author 97114
 */

public class TerceOperacionesXD {
    //Atributos


    
    //Metodos
    

    //Metodo de suma
    
    public int sumar(int numero1, int numero2){
        int sumar=numero1+numero2;
        return sumar;
    }
    //Metodo de resta
    
    public int resta(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    //Metodo de multiplicacion
    public int multiplicacion(int numero1, int numero2){
        int multiplicacion= numero1*numero2;
        return multiplicacion;
    }
    //Metodo de Division
    public int Division(int numero1, int numero2){
        int Division=numero1/numero2;
        return Division;
    }
    
    public void mostrarResultado(int sumar, int resta, int multiplicacion, int Division){
        System.out.println("La suma es "+sumar);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es "+multiplicacion);
        System.out.println("La division es "+Division);
    }
            
} 


