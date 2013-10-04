/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;


public class JavaApplication1 {
    private static final long MILLISEC_PER_YEAR = (long) (1000*3600*24*365.25);
    private String nombre;
    private Date fecha = new Date();
            
    public JavaApplication1 (String nombre, Date fecha){
        this.nombre = nombre;
        this.fecha = fecha;
    }
    
    public String getName (){
        return this.nombre;
    }
     
    public int getDate (){
        Date Today = new Date();
        return (int)((Today.getTime() - fecha.getTime())/MILLISEC_PER_YEAR);
    }
    
    public static void main(String[] args) {
        JavaApplication1 prueba = new JavaApplication1("AlumnoDePrueba", new Date(93,7,8));
        System.out.println("Nombre " + prueba.getName());
        System.out.println("Edad " + prueba.getDate());
    }

}
