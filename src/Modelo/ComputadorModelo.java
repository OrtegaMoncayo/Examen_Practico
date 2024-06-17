/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 59397
 */
public class ComputadorModelo {

    private String Marca;
    private int Memoria;
    private String CaracteristicasProcesador;
    private String SistemaOperativo;
    private double Precio;

    public ComputadorModelo() {
    }

    public ComputadorModelo(String Marca, int Memoria, String CaracteristicasProcesador, String SistemaOperativo, double Precio) {
        this.Marca = Marca;
        this.Memoria = Memoria;
        this.CaracteristicasProcesador = CaracteristicasProcesador;
        this.SistemaOperativo = SistemaOperativo;
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public String getCaracteristicasProcesador() {
        return CaracteristicasProcesador;
    }

    public void setCaracteristicasProcesador(String CaracteristicasProcesador) {
        this.CaracteristicasProcesador = CaracteristicasProcesador;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String SistemaOperativo) {
        this.SistemaOperativo = SistemaOperativo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void imprimirComputador() {
        System.out.println("Datos del Computador" + "\n"
                + "Marca:" + getMarca() + "\n"
                + "Memoria:" + getMemoria() + "\n"
                + "Caractrristicas del Procesador:" + getCaracteristicasProcesador() + "\n"
                + "Sistema Operativo:" + getSistemaOperativo() + "\n"
                + "Precio:" + getPrecio() + "\n");

    }

}
