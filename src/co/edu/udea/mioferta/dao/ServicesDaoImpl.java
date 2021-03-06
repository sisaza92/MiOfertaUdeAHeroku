package co.edu.udea.mioferta.dao;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.edu.udea.mioferta.dto.Programa;
import co.edu.udea.mioferta.dto.Tanda;
import co.edu.udea.mioferta.dto.Impedimento;
import co.edu.udea.mioferta.dto.Grupo;
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
    
    public List<Programa> obtenerProgramas(String cedulaEstudiante) {
        
        List<Programa> programas = new ArrayList();
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            programas.add(new Programa((long) 504, "Ingenieria de Sistemas", "Activo"));
            programas.add(new Programa((long) 104, "Administracion de Empresas", "Cancelado"));
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                programas.add(new Programa((long) 533, "Ingenier�a civil", "Activo"));
            }
            // no existe esa cedula en la base de datos
        }
        
        return programas;
    }

    public Estudiante obternerInfoEstudiante(String cedulaEstudiante) {
        
    	Estudiante estudiante = null;
        
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            estudiante = new Estudiante(cedulaEstudiante, "Santiago", "Ramirez", "26/05/1992", "santiago.ramirez@udea.edu.co");
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                estudiante = new Estudiante(cedulaEstudiante, "Cristian", "Isaza", "26/05/1992", "ccamilo.isaza@udea.edu.co");
            }
            // no existe esa cedula en la base de datos
        }
        return estudiante;
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

    public List<Grupo> obtenerGrupos(String codigoMateria) {
        
        List<Grupo> grupos = new ArrayList();
        // hacer una estructura case of codigoMateria
        if ("2508107".equals(codigoMateria)) {//LOGICA Y REPRESENTACION I
        	
        	grupos.add(new Grupo("01",30,15,"19-220","wv 12-2","Roberto FLorez Rueda"));
            grupos.add(new Grupo("02",30,10,"19-310","mj 12-2","Fernando Perez"));
            grupos.add(new Grupo("03",30,20,"21-310","ls 12-2","Efain Oviedo"));
            
		} else if("2508111".equals(codigoMateria)) {//MATEMATICAS DISCRETAS I
			
			grupos.add(new Grupo("01",30,25,"19-220","wv 6-8","Carlos Mario Sierra"));
            grupos.add(new Grupo("02",30,25,"19-220","wv 6-8","Gabriel Uribe"));
		
		} else if("2539100".equals(codigoMateria)) {//LECTOESCRITURA
			
			grupos.add(new Grupo("01",30,30,"19-220","wv 10-12","Maria del Pilar Blandon"));
            grupos.add(new Grupo("02",30,30,"19-222","mj 8-10","Juan Carlos Velez"));
            
		} else if("2536200".equals(codigoMateria)) {//FISICA MECANICA
			
			grupos.add(new Grupo("01",30,20,"19-207","mj 10-12","Bernardo Arenas"));
            grupos.add(new Grupo("02",30,15,"19-310","mw 8-10","Gustavo Otalvaro"));
            
		} else if("2517350".equals(codigoMateria)) {//FORMAC CIUDADANA Y CONST.
			
			grupos.add(new Grupo("01",30,20,"virtual","m 2-4","Laura Yaneth Garcia"));
            grupos.add(new Grupo("02",30,15,"virtual","l 8-10","Angelica Sanchez"));
            grupos.add(new Grupo("02",30,10,"virtual","w 10-12","Juan Fernando Londo�o"));
            
		}
        
        return grupos;
    }

    public Tanda obtenerTanda(String cedulaEstudiante, Long semestre) {
        Tanda tanda = null;
        Date fecha = Date.from(Instant.now());
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
        	tanda=new Tanda((long) 36,"nombre de tanda: juanita","26/07/2017",815,830);
        }else{
            if (cedulaEstudiante.equals(cedulaEstudiante2)) {
                tanda=new Tanda((long) 36,"nombre de tanda: Pepita","25/07/2017",900,915);
            }
            // no existe esa cedula en la base de datos
        }
        return tanda;
    }

    public List<Impedimento> obtenerImpedimentos(String cedulaEstudiante, Long programa) {
        List<Impedimento> impedimentos = new ArrayList<Impedimento>();
        if (cedulaEstudiante.equals(cedulaEstudiante1)) {
            impedimentos.add(new Impedimento((long)20171,"Cartera","No pago de matricula"));
            impedimentos.add(new Impedimento((long)20171,"Biblioteca","No ha devuelto libro"));
        }
        return impedimentos;
    }

}
