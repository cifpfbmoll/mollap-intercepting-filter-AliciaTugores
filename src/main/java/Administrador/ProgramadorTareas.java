package Administrador;

import Filtros.Filtro;
import Targets.Target;

public class ProgramadorTareas {

    private Tareas tarea = null;

    public ProgramadorTareas(Target target){
        tarea = new Tareas();
        tarea.setTarget(target);
    }

    public Tareas getTareas(){
        return this.tarea;
    }

    public void setTarea(Filtro tarea){
        getTareas().addTarea(tarea);
    }

    public void ejecutarTareas(String message){
        tarea.ejecucion(message);
    }
}