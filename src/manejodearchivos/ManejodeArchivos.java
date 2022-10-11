/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejodearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 * nuestra clase manejodearchivos va a contener los siguientes metodos
 * CrearArchivo(),GuardarinfoEnArchivo(),EliminarInfoArchivo(),EliminarArchivo()
 * 
 */
public class ManejodeArchivos {

   

    
    public static void crearArchivo(String nombre){
        
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out); 
        }
    }
    
}
