/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59397
 */
public class TiendaModelo {

    private String Nombre;
    private String Propietario;
    private String IdentificadorTributario;
    private List<ComputadorModelo> computadoras;

    public TiendaModelo() {
    }

    public TiendaModelo(String Nombre, String Propietario, String IdentificadorTributario, List<ComputadorModelo> computadoras) {
        this.Nombre = Nombre;
        this.Propietario = Propietario;
        this.IdentificadorTributario = IdentificadorTributario;
        this.computadoras = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public String getIdentificadorTributario() {
        return IdentificadorTributario;
    }

    public void setIdentificadorTributario(String IdentificadorTributario) {
        this.IdentificadorTributario = IdentificadorTributario;
    }

    public void imprimirComputador() {
        System.out.println("Datos del tienda" + "\n"
                + "Nombre de la tienda:" + getNombre() + "\n"
                + "Proprietario:" + getPropietario() + "\n"
                + "Identificador de Tributario:" + getIdentificadorTributario() + "\n");

    }

}
