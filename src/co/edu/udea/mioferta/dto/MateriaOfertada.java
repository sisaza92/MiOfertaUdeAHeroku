/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mioferta.dto;

/**
 * Representa una materia que será ofertada a un estudiante.
 * @author Santiago
 */
public class MateriaOfertada {
    
    private String codigoMateria;
    private String nombreMateria;
    private int creditos;
    private String grupo;  // en la pantalla 2 no sale nada de esta informacion
    private String horario; // El horario deberia estár aqui? solo deberia pertenecer a grupo.

    public MateriaOfertada(String codigomateria, String nombreMateria, int creditos) {
        this.codigoMateria = codigomateria;  
        this.nombreMateria = nombreMateria;
        this.creditos = creditos;
    }

    
    
    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
