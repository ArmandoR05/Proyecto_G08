package com.proyecto_g08.proyecto_g08.view;

import javax.swing.JOptionPane;
import com.proyecto_g08.proyecto_g08.service.Configuracion;
import com.proyecto_g08.proyecto_g08.service.CreacionTiquetes;
import com.proyecto_g08.proyecto_g08.service.AtencionTiquetes;
import com.proyecto_g08.proyecto_g08.service.LlenadoColas;
import com.proyecto_g08.proyecto_g08.service.Reporte;


public class Menu {

    public static void mostrarMenu() {
        String[] opciones = {
                "1. Crear tiquete",
                "2. Atender Cliente",
                "3. Llenado de colas",
                "3. Generar Reportes",
                "4. Salir"
        };

        boolean salir = false;

        while (!salir) {
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 1: // Crear Tiquete

                    break;
                case 2: // Atender Cliente
                    JOptionPane.showMessageDialog(null, "Función para atender cliente aún no implementada.");
                    break;
                case 3: // Llenado de colas
                    JOptionPane.showMessageDialog(null, "Función para generar reportes aún no implementada.");
                    break;
                case 4: // Generar Reportes
                    JOptionPane.showMessageDialog(null, "Función para generar reportes aún no implementada.");
                    break;
                case 5: // Salir
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
