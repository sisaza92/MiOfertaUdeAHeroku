package co.edu.udea.mioferta.dao;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.edu.udea.mioferta.dto.Programa;
import co.edu.udea.mioferta.dto.Tanda;
import co.edu.udea.mioferta.dto.MateriaOfertada;
import co.edu.udea.mioferta.dto.Estudiante;


/**
 * Implementacion de los servicios para realizar las pruebas de la aplicacion
 * de momento se quemaran los datos y solo se tendra informacion de 2 estudiantes
 * @author Santiago
 */
public class ServicesDaoImpl implements ServicesDao {
    // cedulas quemadas para suponer que estan el la base de datos
    private  String cedulaEstudiante1 = "101700";
    private  String cedulaEstudiante2 = "101701";
    
    //Ojo validar los datos que ingresan 
    
    public List<Programa> obtenerProgramaYUltimoSemestre(String cedulaEstudiante) {
        
        List<Programa> programas = new ArrayList();
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            programas.add(new Programa(504, "Ingeniería de Sistemas", "Activo", "20161"));
            programas.add(new Programa(104, "Administración de Empresas", "Cancelado", "20161"));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                programas.add(new Programa(533, "Ingeniería civil", "Activo", "2016-1"));
            }
            // no existe esa cedula en la base de datos
        }
        
        return programas;
    }

    public List<MateriaOfertada> obtenerMateriasOfertadas(String cedulaEstudiante, String idPrograma, String semestre) {
       //supongamos que esta es la que retorna la oferta por que la otra retorna es lo que esta cursando
       List<MateriaOfertada> materiasOfertadas = new ArrayList();
        
        if (cedulaEstudiante.equals(cedulaEstudiante1) && idPrograma.equals("504")) {
            materiasOfertadas.add(new MateriaOfertada("2508107","LOGICA Y REPRESENTACION I", 4));
            materiasOfertadas.add(new MateriaOfertada("2508111","MATEMATICAS DISCRETAS I", 4));
            materiasOfertadas.add(new MateriaOfertada("2539100","LECTOESCRITURA", 4));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2) && idPrograma.equals("533")) {
                materiasOfertadas.add(new MateriaOfertada("2536200","FISICA MECANICA", 4));
                materiasOfertadas.add(new MateriaOfertada("2539100","LECTOESCRITURA", 4));
                materiasOfertadas.add(new MateriaOfertada("2517350","FORMAC CIUDADANA Y CONST.", 0));
            }
            // no existe esa cedula en la base de datos
        }
        return materiasOfertadas;
    }

    public Tanda obtenerTanda(String cedulaEstudiante, Long semestre) {
        Tanda tanda = null;
        Date fecha = Date.from(Instant.now());
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
        	tanda=new Tanda(15,"Tanda juanita",fecha,fecha,fecha);
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                tanda=new Tanda(22,"Tanda pepita",fecha,fecha,fecha);
            }
            // no existe esa cedula en la base de datos
        }
        return tanda;
    }

    public Estudiante obternerInfoEstudiante(String cedulaEstudiante) {
        
    	Estudiante estudiante = null;
        
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            estudiante = new Estudiante(cedulaEstudiante, "Santiago", "Ramirez", "", "");
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                estudiante = new Estudiante(cedulaEstudiante, "Cristian", "Isaza", "", "");
            }
            // no existe esa cedula en la base de datos
        }
        return estudiante;
    }

}
