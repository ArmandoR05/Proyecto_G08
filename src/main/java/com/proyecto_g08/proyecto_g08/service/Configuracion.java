package com.proyecto_g08.proyecto_g08.service;

import java.io.*;
import javax.swing.*;
import com.proyecto_g08.proyecto_g08.model.Banco;

public class Configuracion {
    private static final String archivo = "banco.txt";

    public static void agregar() {
        if (configuracionYaExiste()) {
            JOptionPane.showMessageDialog(null, "La configuración del banco ya ha sido establecida.");
            return;
        }

        try (DataOutputStream archivo = new DataOutputStream(new FileOutputStream(Configuracion.archivo))) {
            Banco banco = new Banco();
            banco.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del banco: "));
            banco.setCantidadCajas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cajas: ")));

            archivo.writeUTF(banco.getNombre());
            archivo.writeInt(banco.getCantidadCajas());

            JOptionPane.showMessageDialog(null, "Configuración guardada exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Ingrese un número válido para las cajas.");
        }
    }

    private static boolean configuracionYaExiste() {
        try (DataInputStream archivo = new DataInputStream(new FileInputStream(Configuracion.archivo))) {
            String nombre = archivo.readUTF();
            int cantidadCajas = archivo.readInt();
            return nombre != null && !nombre.isEmpty() && cantidadCajas > 0;
        } catch (IOException e) {
            return false;
        }
    }
}


