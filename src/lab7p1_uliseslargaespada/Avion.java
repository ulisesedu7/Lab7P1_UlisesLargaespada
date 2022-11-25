/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_uliseslargaespada;

/**
 *
 * @author ularg
 */
public class Avion {
    String modeloAvion;
    String codigoAvion;
    int yearFabricacion;
    int capacidadMax;
    int pesoAvion;
    String nombreAerolinia;
    String estadoAvion;

    public Avion(String modeloAvion, String codigoAvion, int yearFabricacion, int capacidadMax, int pesoAvion, String nombreAerolinia, String estadoAvion) {
        this.modeloAvion = modeloAvion;
        this.codigoAvion = codigoAvion;
        this.yearFabricacion = yearFabricacion;
        this.capacidadMax = capacidadMax;
        this.pesoAvion = pesoAvion;
        this.nombreAerolinia = nombreAerolinia;
        this.estadoAvion = estadoAvion;
    }

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getPesoAvion() {
        return pesoAvion;
    }

    public void setPesoAvion(int pesoAvion) {
        this.pesoAvion = pesoAvion;
    }

    public String getNombreAerolinia() {
        return nombreAerolinia;
    }

    public void setNombreAerolinia(String nombreAerolinia) {
        this.nombreAerolinia = nombreAerolinia;
    }

    public String getEstadoAvion() {
        return estadoAvion;
    }

    public void setEstadoAvion(String estadoAvion) {
        this.estadoAvion = estadoAvion;
    }
    
    
    
}
