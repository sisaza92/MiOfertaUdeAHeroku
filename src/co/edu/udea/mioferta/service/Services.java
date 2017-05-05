package co.edu.udea.mioferta.service;

import javax.ws.rs.core.Response;


/**
*
* @author santiago
*/
public interface Services {
    
    public Response obtenerProgramaYUltimoSemestre(String cedulaEstudiante);
    
    public Response obtenerInfoEstudiante(String cedulaEstudiante);
    
    public Response obtenerMateriasOfertadas(String cedulaEstudiante, String idPrograma);

    public Response obtenerGrupos(String codigoMateria);  
    
    public Response obtenerTanda(String cedulaEstudiante, Long semestre);
    
    public Response obtenerImpedimentos(String cedulaEstudiante);
    
}