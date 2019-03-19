/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activos.logic;

import Domain.Solicitud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Anthony
 */
public class Model {
    
    static Map<String, Solicitud> contenedorSolicitudes=new HashMap<>();
    
    public static void agregar(Solicitud nuevaSolicitudEntrante) throws Exception{
//hacer este if a corde con la consulta a la base de datos       
//if(personas.containsKey(p.getNombre())) throw new Exception("Persona ya existe");    
//personas.put(p.getNombre(), p);
//hacer el codigo para introducir gente aqui.    
    }
    
    public static List<Solicitud> listar(){    
//Codigo necesario para la consulta de toda la base de datos
        return new ArrayList(contenedorSolicitudes.values());
    }
    
    
//aqui entre parametros va el key a buscar
//public static Solicitud consultar( Parametro )throws Exception{
    public static Solicitud consultar()throws Exception{

        Solicitud result = new Solicitud();
//aqui va el parametro de la busqueda        
//result = contenedorSolicitudes.get(parametro);


// if como este para la consulta en la base de datos        
//if (result==null) throw new Exception("Persona no existe");
        return result;

    
    }    
    
//public static void borrar(Parametro){
    public static void borrar(){        
//codigo para borrar de la base de datos la solicitud
    }

}
