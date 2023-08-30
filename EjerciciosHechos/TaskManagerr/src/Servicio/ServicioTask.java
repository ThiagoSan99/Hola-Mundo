/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.TaskManager;

/**
 *
 * @author Hewlett Packard
 */
public class ServicioTask {
    TaskManager tarea = new TaskManager();
    
    public boolean agregarTarea(TaskManager t){
        boolean b;
        
        t.getTareas().add(t);
        
        if(t.getTareas().isEmpty()){
            b=false;
            
        }else{
            b=true;
        }
        
        
        return b;
    }
    public boolean eliminarTarea(TaskManager t){
        boolean b;
        
        if(t.getTareas().isEmpty()){
            b=false;
        }else{
            t.getTareas().remove(t.getTareas().size()-1);
            b=true;
        }
        
        
        return b;
    }
}
