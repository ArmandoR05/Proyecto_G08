package com.proyecto_g08.proyecto_g08.service;

import java.io.*;
import javax.swing.*;
import com.proyecto_g08.proyecto_g08.model.Banco;

public class Configuracion {
    private static final String ARCHIVO_CONFIG = "banco.txt";

    public static void configurarBanco() {
        if (!configuracionYaExiste()) {
            guardarConfiguracion();
        }
        Banco banco = cargarBancoDesdeArchivo();
        if (banco != null) {
            JOptionPane.showMessageDialog(null, "Banco configurado: " + banco.getNombre() + "\nCajas: " + banco.getCantidadCajas());
        }
    }

    private static void guardarConfiguracion() {
        try (DataOutputStream archivo = new DataOutputStream(new FileOutputStream(ARCHIVO_CONFIG))) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del banco: ");
            int cantidadCajas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cajas: "));

            archivo.writeUTF(nombre);
            archivo.writeInt(cantidadCajas);

            JOptionPane.showMessageDialog(null, "Configuración guardada exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Ingrese un número válido para las cajas.");
        }
    }

    private static Banco cargarBancoDesdeArchivo() {
        try (DataInputStream archivo = new DataInputStream(new FileInputStream(ARCHIVO_CONFIG))) {
            String nombre = archivo.readUTF();
            int cantidadCajas = archivo.readInt();

            Banco banco = new Banco();
            banco.setNombre(nombre);
            banco.setCantidadCajas(cantidadCajas);
            return banco;
        } catch (IOException e) {
            System.err.println("Error al leer la configuración: " + e.getMessage());
            return null;
        }
    }

    public static boolean configuracionYaExiste() {
        File archivo = new File(ARCHIVO_CONFIG);
        return archivo.exists() && archivo.length() > 0;
    }
}
