/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ComputadorModelo;
import Modelo.TiendaModelo;
import Controlador.ComputadorControlador;
import java.util.List;

/**
 *
 * @author 59397
 */
public class TiendaControlador {
    private TiendaModelo tienda;
    private ComputadorModelo computador;
    private ComputadorControlador controladorComputador;

    public TiendaControlador() {
    }

    public TiendaControlador(TiendaModelo tienda, ComputadorModelo computador, ComputadorControlador controladorComputador) {
        this.tienda = tienda;
        this.computador = computador;
        this.controladorComputador = controladorComputador;
    }
    

   
    
   public void agregarComputadora(ComputadorModelo c) {
       controladorComputador.getComputadorModelo().add(c); 
    }

    public int contarComputadoras() {
        return tienda.getComputadoras().size();
    }

    public ComputadorModelo buscarComputadorPorMarca(String marca) {
        for (ComputadorModelo computadora : tienda.getComputador()) { 
            if (computadora.getMarca().equalsIgnoreCase(marca)) {
                return computadora;
            }
        }
        return null; 
    }

   public List<ComputadorModelo> listarComputadores() {
        return tienda.getComputadoras(); 
    }
}