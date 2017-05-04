package co.edu.udea.mioferta.dao;

import java.util.List;

import co.edu.udea.mioferta.dto.Programa;

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
}
