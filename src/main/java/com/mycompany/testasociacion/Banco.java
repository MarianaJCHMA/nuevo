/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testasociacion;

/**
 *
 * @author Mariana
 */
public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numcli) {
        this.nombre = nombre;
        this.clientes = new Persona[numcli];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(Persona persona) {
        if (buscarCliente(persona)) {
            System.out.println("La persona ya está registrada como cliente...");
        } else {
            int i;
            for (i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] == null) {
                    break;
                }
            }
            if (i >= this.clientes.length)
                System.out.println("No hay capacidad para más clientes...");
            else
                this.clientes[i] = persona;
        }
    }

    public Persona darBajaCliente(Persona persona) {
        if (buscarCliente(persona)) {
            for (int i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] != null) {
                    if (this.clientes[i].equals(persona)) {
                        Persona clienteEliminado = this.clientes[i];
                        this.clientes[i] = null;

                        // Mover el último cliente ocupado a la posición vacía
                        int lastIndex = this.clientes.length - 1;
                        while (lastIndex >= 0 && this.clientes[lastIndex] == null) {
                            lastIndex--;
                        }

                        if (lastIndex >= 0) {
                            this.clientes[i] = this.clientes[lastIndex];
                            this.clientes[lastIndex] = null;
                        }

                        System.out.println("Se eliminó a la persona " + persona + " de la lista");
                        return clienteEliminado;
                    }
                }
            }
        }
        System.out.println("No se encontró a la persona " + persona + " en la lista");
        return null;
    }

    public void clienteTipo(char tipoCliente) {
        System.out.println("Clientes de tipo " + tipoCliente + ":");
        for (Persona persona : this.clientes) {
            if (persona != null && persona.getTipoCliente() == tipoCliente) {
                System.out.println(persona);
            }
        }
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i] != null) {
                if (this.clientes[i].equals(persona)) {
                    System.out.println("Se encontró la persona " + persona + " en la posición " + i + " de la lista");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Banco: ").append(nombre).append("\n");
        for (Persona persona : this.clientes) {
            if (persona != null) {
                s.append(persona).append("\n");
            }
        }
        return s.toString();
    }
}

