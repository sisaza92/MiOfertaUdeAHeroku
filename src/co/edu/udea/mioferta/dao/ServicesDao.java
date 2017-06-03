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
    public List<Programa> obtenerProgramas(String cedulaEstudiante);

    /**
     * Retorna la información de un estudiante dada su cédula
     * @param cedulaEstudiante
     * @return 
     */
    public Estudiante obternerInfoEstudiante(String cedulaEstudiante ); 
    
    /**
     * retorna la lista de materias ofertadas al estudiante
     * @param cedulaEstudiante
     * @param programa
     * @param semestre
     * @return 
     */
    public List obtenerMateriasOfertadas(String cedulaEstudiante, String programa, String semestre);

    /**
     * retorna los grupos disponibles de la materia el programa/semestre, no está creado,
     * deberá retornar la estructura: grupo, cupomaximo, cupodisponible, aula, horario, nombreprofesor
     * @param codigoMateria
     * @return 
     */
    public List obtenerGrupos(String codigoMateria);
    
    /**
     * retorna la tanda en el programa/semestre, no está creado, deberá retornar 
     * la estructura: numerotanda, fecha, hora
     * 
     * @param cedulaEstudiante
     * @return 
     */
    public Tanda obtenerTanda(String cedulaEstudiante,Long Semestre);
    
    /**
     * retorna los impedimientos el programa, no está creado, deberá retornar la 
     * estructura: semestre, impedimiento
     * @param cedulaEstudiante
     * @return 
     */
    public List obtenerImpedimentos(String cedulaEstudiante);
    
}
