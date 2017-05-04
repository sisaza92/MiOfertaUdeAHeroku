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
    
    private int nroTanda;
    private String nombre;
    private Date fecha;
    private Date horaIncial;
    private Date horafinal;
    
    
    public Tanda(int nroTanda, String nombre, Date fecha, Date horaIncial, Date horafinal) {
		super();
		this.nroTanda = nroTanda;
		this.nombre = nombre;
		this.fecha = fecha;
		this.horaIncial = horaIncial;
		this.horafinal = horafinal;
	}

	public int getNroTanda() {
        return nroTanda;
    }

    public void setNroTanda(int nroTanda) {
        this.nroTanda = nroTanda;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

	public Date getHoraIncial() {
		return horaIncial;
	}

	public void setHoraIncial(Date horaIncial) {
		this.horaIncial = horaIncial;
	}

	public Date getHorafinal() {
		return horafinal;
	}

	public void setHorafinal(Date horafinal) {
		this.horafinal = horafinal;
	}
    
}
