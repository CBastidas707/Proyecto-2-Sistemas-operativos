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
        Archivo archivo1 = new Archivo("archivo1.txt", 1, 2, 0, 0, "Contenido de archivo1", "rojo");
        Archivo archivo2 = new Archivo("archivo2.txt", 2, 15, 3, 1, "Contenido de archivo2", "azul");
        Archivo archivo3 = new Archivo("archivo3.txt", 3, 8, 4, 2, "Contenido de archivo3", "azulOscuro");
        Archivo archivo4 = new Archivo("archivo4.txt", 4, 20, 0, 2, "Contenido de archivo4", "naranja");
        Archivo archivo5 = new Archivo("archivo5.txt", 5, 5, 0, 4, "Contenido de archivo5", "naranjaoscuro");
        Archivo archivo6 = new Archivo("archivo1.txt", 1, 2, 0, 1, "Contenido duplicado de archivo1", "rojo"); // Duplicado
        Archivo archivo7 = new Archivo("archivo3.txt", 3, 8, 4, 3, "Contenido duplicado de archivo3", "azuloscuro"); // Duplicado
        Archivo archivo8 = new Archivo("archivo6.txt", 6, 12, 0, 5, "Contenido de archivo6", "rosa");
        Archivo archivo9 = new Archivo("archivo7.txt", 7, 18, 1, 6, "Contenido de archivo7", "verde");
        Archivo archivo10 = new Archivo("archivo8.txt", 8, 25, 0, 7, "Contenido de archivo8", "rosaoscuro");

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
        
        Pantalla pantalla1 = new Pantalla(listaArchivos);
        pantalla1.setVisible(true);
    }
    
}
