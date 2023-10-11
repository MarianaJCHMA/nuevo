/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testasociacion;

public class TestAsociacion {
    public static void main(String[] args) {
        Banco banco = new Banco("BCP", 5);

        Persona persona1 = new Persona(1, "Maria", "Perez", 'C');
        Persona persona2 = new Persona(2, "Alice", "Dias", 'B');
        Persona persona3 = new Persona(3, "Jorge", "Maritnez", 'E');

        banco.agregarCliente(persona1);
        banco.agregarCliente(persona2);
        banco.agregarCliente(persona3);

        System.out.println("Lista de Clientes del Banco:");
        System.out.println(banco);

        System.out.println("\nEliminando a Alice Dias del Banco:");
        Persona clienteEliminado = banco.darBajaCliente(persona3);
        if (clienteEliminado != null) {
            System.out.println("Cliente eliminado: " + clienteEliminado);
        }

        System.out.println("\nLista de Clientes después de dar de baja a un cliente:");
        System.out.println(banco);

        System.out.println("\nClientes de tipo C:");
        banco.clienteTipo('C'); // Lista clientes de tipo C

        System.out.println("\nClientes de tipo B:");
        banco.clienteTipo('B'); // Lista clientes de tipo B

        System.out.println("\nClientes de tipo E:");
        banco.clienteTipo('E'); // Lista clientes de tipo E
    }
}
