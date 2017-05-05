package co.edu.udea.mioferta.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


/**
*
* @author santiago
*/
public interface Services {
    
    public Response obtenerProgramaYUltimoSemestre(String cedulaEstudiante);
    
    public Response obtenerMateriasOfertadas(String cedulaEstudiante, String idPrograma);

    public Response obtenerGrupos(String codigoMateria);
    
    public Response obtenerInfoEstudiante(String cedulaEstudiante);    
    
    public Response obtenerTanda(String cedulaEstudiante, Long semestre);
    
}