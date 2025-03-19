package com.proyecto_g08.proyecto_g08.service;

import com.proyecto_g08.proyecto_g08.model.Tiquete;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class CreacionTiquetes {
    public static Tiquete crearTiquete() {
        try {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            if (nombreCliente == null) throw new Exception("Entrada cancelada");

            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente:"));
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));

            String[] opcionesTramite = {
                    "Depósitos",
                    "Retiros",
                    "Cambio de divisas"
            };

            int seleccionTramite = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione el tipo de trámite:",
                    "Tipo de Trámite",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcionesTramite,
                    opcionesTramite[0]
            );

            if (seleccionTramite == -1) throw new Exception("Selección cancelada");
            String tramite = opcionesTramite[seleccionTramite];

            String[] opciones = {
                    "P. Cliente Preferencial",
                    "A. Un solo trámite",
                    "B. Dos o más trámites"
            };

            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione el tipo de cliente:",
                    "Tipo de Cliente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion == -1) throw new Exception("Selección cancelada");

            char tipoCliente = ' ';
            if (seleccion == 0) tipoCliente = 'P';
            else if (seleccion == 1) tipoCliente = 'A';
            else if (seleccion == 2) tipoCliente = 'B';

            return new Tiquete(nombreCliente, id, edad, LocalDateTime.now(), -1, tramite, tipoCliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la entrada de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}





