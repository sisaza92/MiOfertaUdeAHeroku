package co.edu.udea.mioferta.dao;

import java.util.ArrayList;
import java.util.List;

import co.edu.udea.mioferta.dto.Programa;


/**
 * Implementacion de los servicios para realizar las pruebas de la aplicacion
 * de momento se quemaran los datos y solo se tendra informacion de 2 estudiantes
 * @author Santiago
 */
public class ServiciosDao implements ServicesDao {
    // cedulas quemadas para suponer que estan el la base de datos
    private  String cedulaEstudiante1 = "101700";
    private  String cedulaEstudiante2 = "101701";
    
    //Ojo validar los datos que ingresan 
    
    public List<Programa> obtenerProgramaYUltimoSemestre(String cedulaEstudiante) {
        
        List<Programa> programas = new ArrayList();
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            programas.add(new Programa(504, "Ingeniería de Sistemas", "Activo", "2016-1"));
            programas.add(new Programa(104, "Administración de Empresas", "Cancelado", "2016-1"));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                programas.add(new Programa(533, "Ingeniería civil", "Activo", "2016-1"));
            }
            // no existe esa cedula en la base de datos
        }
        
        return programas;
    }

}
