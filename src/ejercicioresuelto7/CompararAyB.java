/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioresuelto7;

/**
 *
 * @author ajlon
 */
public class CompararAyB {
    
    public static String comparar(double A, double B){
        String mensaje;
        
        if (A > B){
            mensaje = "A es mayor que B";
            return mensaje;
        }
        else if (B == A){
            mensaje = "A es igual B";
            return mensaje;
        }
        else{
            mensaje = "B es mayor que A";
            return mensaje;
        }
    }
}
