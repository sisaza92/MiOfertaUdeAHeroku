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
    private Integer horaInicial;
    private Integer horaFinal;
    
    
    public Tanda(Long numero, String nombre, String fecha, Integer horaInicial, Integer horaFinal) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.fecha = fecha;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
	}


	public Long getNumero() {
		return numero;
	}


	public void setNumero(Long numero) {
		this.numero = numero;
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


	public Integer getHoraInicial() {
		return horaInicial;
	}


	public void setHoraInicial(Integer horaInicial) {
		this.horaInicial = horaInicial;
	}


	public Integer getHoraFinal() {
		return horaFinal;
	}


	public void setHoraFinal(Integer horaFinal) {
		this.horaFinal = horaFinal;
	}
    
}
