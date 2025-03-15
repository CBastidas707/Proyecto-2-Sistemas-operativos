/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;
import GUI.Pantalla;
import GUI.Pantalla2;
import Logica.Clases.Archivo;
import Logica.Estructuras.Lista;

/**
 *
 * @author carlo_7ogoiii
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Pantalla pantalla = new Pantalla();
//        pantalla.setVisible(true);

        // Archivos de prueba
        Archivo archivo1 = new Archivo("archivo1.txt", 1, 10, 0, 0, "Contenido de archivo1");
        Archivo archivo2 = new Archivo("archivo2.txt", 2, 15, 10, 1, "Contenido de archivo2");
        Archivo archivo3 = new Archivo("archivo3.txt", 3, 8, 25, 2, "Contenido de archivo3");
        Archivo archivo4 = new Archivo("archivo4.txt", 4, 20, 33, 3, "Contenido de archivo4");
        Archivo archivo5 = new Archivo("archivo5.txt", 5, 5, 53, 4, "Contenido de archivo5");
        Archivo archivo6 = new Archivo("archivo1.txt", 1, 10, 0, 0, "Contenido duplicado de archivo1"); // Duplicado
        Archivo archivo7 = new Archivo("archivo3.txt", 3, 8, 25, 2, "Contenido duplicado de archivo3"); // Duplicado
        Archivo archivo8 = new Archivo("archivo6.txt", 6, 12, 58, 5, "Contenido de archivo6");
        Archivo archivo9 = new Archivo("archivo7.txt", 7, 18, 70, 6, "Contenido de archivo7");
        Archivo archivo10 = new Archivo("archivo8.txt", 8, 25, 88, 7, "Contenido de archivo8");

        // Agregar archivos a la lista
        Lista<Archivo> listaArchivos = new Lista<>("Archivos");
        listaArchivos.append(archivo1);
        listaArchivos.append(archivo2);
        listaArchivos.append(archivo3);
        listaArchivos.append(archivo4);
        listaArchivos.append(archivo5);
        listaArchivos.append(archivo6); // Duplicado
        listaArchivos.append(archivo7); // Duplicado
        listaArchivos.append(archivo8);
        listaArchivos.append(archivo9);
        listaArchivos.append(archivo10);

        Pantalla2 pantalla = new Pantalla2(listaArchivos);
        pantalla.setVisible(true); 
    }
    
}
