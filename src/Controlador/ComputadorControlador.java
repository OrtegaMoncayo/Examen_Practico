/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ComputadorModelo;
import Modelo.TiendaModelo;
import Controlador.ComputadorControlador;
import Controlador.TiendaControlador;

/**
 *
 * @author 59397
 */
public class ComputadorControlador {

    private ComputadorModelo ComputadorModelo;
    private TiendaModelo TiendaModelo;

    public ComputadorControlador() {
    }

    public ComputadorControlador(ComputadorModelo ComputadorModelo, TiendaModelo TiendaModelo) {
        this.ComputadorModelo = ComputadorModelo;
        this.TiendaModelo = TiendaModelo;
    }

    public ComputadorModelo getComputadorModelo() {
        return ComputadorModelo;
    }

    public void setComputadorModelo(ComputadorModelo ComputadorModelo) {
        this.ComputadorModelo = ComputadorModelo;
    }

    public TiendaModelo getTiendaModelo() {
        return TiendaModelo;
    }

    public void setTiendaModelo(TiendaModelo TiendaModelo) {
        this.TiendaModelo = TiendaModelo;
    }

}
