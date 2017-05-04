package co.edu.udea.mioferta.service;

import javax.ws.rs.core.Response;


/**
*
* @author santiago
*/
public interface Services {
    
    public Response obtenerProgramaYUltimoSemestre(String cedulaEstudiante);
    
}