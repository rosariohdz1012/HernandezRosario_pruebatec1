package com.mycompany.gestionempleados.presentacion.validacion;

public class Validar {
    
    public static boolean esVacio(String dato){
        return dato.isEmpty();
            }
    public static boolean esVacio(String dato,String dato2,String dato3){
        return esVacio(dato)|| esVacio(dato2)|| esVacio(dato3) ;
    }
    public static boolean esNumero(String dato){
        return dato.chars().anyMatch(Character::isDigit);
    }
    public static boolean esNumeros(String dato, String dato2, String dato3){
        return esNumero(dato)||esNumero(dato2)||esNumero(dato3);
    }
}
