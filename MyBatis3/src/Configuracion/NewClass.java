/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

/**
 *
 * @author Oliverco
 */
public class NewClass {
    public static void main(String[] args) {
        int numero = 20;
        String resultado="";
        int i = 0;
        if (numero>0) {
            while (numero>0) {
                if (numero%2 == 0 ) {
                    resultado = "0"+resultado;
                }else{
                    resultado="1"+resultado;
                }
                numero = numero/2;
            }
        } else if(numero==0){
            resultado="0";
        }
        System.out.println(resultado);
    }
}