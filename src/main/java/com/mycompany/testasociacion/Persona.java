/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testasociacion;

/**
 *
 * @author Mariana
 */
public class Persona extends Cuenta{
    private int id;
    private String nombre;
    private String apellido;
    private char tipoCliente;

    public Persona(int id, String nombre, String apellido, char tipoCliente) {
        super(generarCuenta(tipoCliente), 0);
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public static String generarCuenta(char tipoCliente) {
        int numeroBase;
        switch (tipoCliente) {
            case 'B':
                numeroBase = 5000;
                break;
            case 'E':
                numeroBase = 8000;
                break;
            default:
                numeroBase = 1000;
                break;
        }
        return tipoCliente + String.valueOf(numeroBase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", tipoCliente=").append(tipoCliente);
        sb.append('}');
        return sb.toString();
    }
}
    
