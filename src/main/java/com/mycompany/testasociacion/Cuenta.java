/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testasociacion;

/**
 *
 * @author Mariana
 */
public class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        setSaldo(saldo);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 50.0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser menor a 50.");
        }
    }

    public Cuenta(String numero) {
        this(numero, 0);
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (saldo - cantidad >= 50) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar la cantidad especificada debido al saldo mínimo requerido.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero='" + numero + '\'' + ", saldo=" + saldo + '}';
    }
}

