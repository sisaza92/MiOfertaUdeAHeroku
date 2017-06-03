/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mioferta.dto;

import java.util.Date;

/**
 * Representa la tanda asignada a un estudiante para su respectiva Matricula.
 * @author CristianCamilo
 */
public class Tanda {
    
    private Long numero;
    private String nombre;
    private String fecha;
    private Integer horaIncial;
    private Integer horafinal;
    
    
    public Tanda(Long nroTanda, String nombre, String fecha, Integer horaIncial, Integer horafinal) {
		super();
		this.numero = nroTanda;
		this.nombre = nombre;
		this.fecha = fecha;
		this.horaIncial = horaIncial;
		this.horafinal = horafinal;
	}

	public Long getNroTanda() {
        return numero;
    }

    public void setNroTanda(Long nroTanda) {
        this.numero = nroTanda;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

	public Integer getHoraIncial() {
		return horaIncial;
	}

	public void setHoraIncial(Integer horaIncial) {
		this.horaIncial = horaIncial;
	}

	public Integer getHorafinal() {
		return horafinal;
	}

	public void setHorafinal(Integer horafinal) {
		this.horafinal = horafinal;
	}
    
}
