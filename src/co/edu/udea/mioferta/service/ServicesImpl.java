package co.edu.udea.mioferta.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.edu.udea.mioferta.dao.ServicesDao;
import co.edu.udea.mioferta.dao.ServicesDaoImpl;
import co.edu.udea.mioferta.dto.Programa;
import co.edu.udea.mioferta.service.Services;
import co.edu.udea.mioferta.service.ServicesImpl;
import co.edu.udea.mioferta.dto.Grupo;
import co.edu.udea.mioferta.dto.MateriaOfertada;
import co.edu.udea.mioferta.dto.Estudiante;
import co.edu.udea.mioferta.dto.Tanda;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *contiene la implementacion de los servicios rest
 * que se van a exponer
 * @author santiago
 */
@Path("/MiOferta")
public class ServicesImpl implements Services {
	
    private final ServicesDao SERVICIO_DAO = new ServicesDaoImpl();
    
    JSONArray jsonArray;
    JSONObject jsonObject;
    
    @GET
    @Path("/obtenerProgramaYUltimoSemestre/{cedulaEstudiante}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerProgramaYUltimoSemestre(@PathParam("cedulaEstudiante") String cedulaEstudiante) {
        
    	Response respuesta = null;
    	
    	try {
    		
            List<Programa> programas  = SERVICIO_DAO.obtenerProgramaYUltimoSemestre(cedulaEstudiante);
            jsonArray = JSONArray.fromObject(programas);
            respuesta = Response.ok(jsonArray.toString()).build();
            
        } catch (ExceptionInInitializerError ex) {
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
        return respuesta;
    }

    @GET
    @Path("/obtenerMateriasOfertadas/{cedulaEstudiante}/{idPrograma}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerMateriasOfertadas(@PathParam("cedulaEstudiante") String cedulaEstudiante, @PathParam("idPrograma") String idPrograma) {
        Response respuesta = null;
        try {
            List<MateriaOfertada> oferta  = SERVICIO_DAO.obtenerMateriasOfertadas(cedulaEstudiante,idPrograma,"");
            jsonArray = jsonArray.fromObject(oferta);
            respuesta = Response.ok(jsonArray.toString()).build();
            
        } catch (ExceptionInInitializerError ex) {
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
        
    }
    
    @GET
    @Path("/obtenerGrupos/{codigoMateria}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerGrupos(@PathParam("codigoMateria") String codigoMateria) {
        
    	Response respuesta = null;
        try {
            List<Grupo> grupos  = SERVICIO_DAO.obtenerGrupos(codigoMateria);
            jsonArray = jsonArray.fromObject(grupos);
            respuesta = Response.ok(jsonArray.toString()).build();
            
        } catch (ExceptionInInitializerError ex) {
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
        
    }

    @GET
    @Path("/obtenerInfoEstudiante/{cedulaEstudiante}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerInfoEstudiante(@PathParam("cedulaEstudiante") String cedulaEstudiante) {
        Response respuesta = null;
        try {
            Estudiante estudiante = SERVICIO_DAO.obternerInfoEstudiante(cedulaEstudiante);
            jsonObject = JSONObject.fromObject(estudiante);
            respuesta = Response.ok(jsonObject.toString()).build();
            
        } catch (ExceptionInInitializerError ex) {
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @GET
    @Path("/obtenerTanda/{cedulaEstudiante}/{semestre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerTanda(@PathParam("cedulaEstudiante") String cedulaEstudiante,@PathParam("semestre")Long semestre) {
        Response respuesta = null;
        try {
            Tanda tanda  = SERVICIO_DAO.obtenerTanda(cedulaEstudiante,semestre);
            jsonObject = JSONObject.fromObject(tanda);
            respuesta = Response.ok(jsonObject.toString()).build();
            
        } catch (ExceptionInInitializerError ex) {
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

}
