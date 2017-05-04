package co.edu.udea.mioferta.dao;

import java.util.List;

import co.edu.udea.mioferta.dto.Programa;
import co.edu.udea.mioferta.dto.Tanda;
import co.edu.udea.mioferta.dto.Estudiante;

/**
 * 
 * @author Santiago
 */
public interface ServicesDao {
    
    /**
     * retorna los programas del usuario y su ultimo semestre, no está creado,
     * deberá retornar la estructura: programa, nombreprograma, estado, semestre
     * @param cedulaEstudiante
     * @return 
     */
    public List<Programa> obtenerProgramaYUltimoSemestre(String cedulaEstudiante);
    
    /**
     * retorna la tanda en el programa/semestre, no está creado, deberá retornar 
     * la estructura: numerotanda, fecha, hora
     * 
     * @param cedulaEstudiante
     * @return 
     */
    public Tanda obtenerTanda(String cedulaEstudiante,Long Semestre);
    
    /**
     * Retorna la información de un estudiante dada su cédula
     * @param cedulaEstudiante
     * @return 
     */
    public Estudiante obternerInfoEstudiante(String cedulaEstudiante ); 
    
}
