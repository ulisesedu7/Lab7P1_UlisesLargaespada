/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_uliseslargaespada;

/**
 *
 * @author ularg
 */
public class Seleccion {
    String nombreGrupo;
    String nombreSeleccion;
    String directorTecnico;
    int jugadoresConvocados;
    boolean ganadoMundial;
    String posicionTabla;
    int cantidadGoles;

    public Seleccion(String nombreGrupo, String nombreSeleccion, String directorTecnico, int jugadoresConvocados, boolean ganadoMundial, String posicionTabla, int cantidadGoles) {
        this.nombreGrupo = nombreGrupo;
        this.nombreSeleccion = nombreSeleccion;
        this.directorTecnico = directorTecnico;
        this.jugadoresConvocados = jugadoresConvocados;
        this.ganadoMundial = ganadoMundial;
        this.posicionTabla = posicionTabla;
        this.cantidadGoles = cantidadGoles;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getNombreSeleccion() {
        return nombreSeleccion;
    }

    public void setNombreSeleccion(String nombreSeleccion) {
        this.nombreSeleccion = nombreSeleccion;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public int getJugadoresConvocados() {
        return jugadoresConvocados;
    }

    public void setJugadoresConvocados(int jugadoresConvocados) {
        this.jugadoresConvocados = jugadoresConvocados;
    }

    public boolean isGanadoMundial() {
        return ganadoMundial;
    }

    public void setGanadoMundial(boolean ganadoMundial) {
        this.ganadoMundial = ganadoMundial;
    }

    public String getPosicionTabla() {
        return posicionTabla;
    }

    public void setPosicionTabla(String posicionTabla) {
        this.posicionTabla = posicionTabla;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }   
    
}
