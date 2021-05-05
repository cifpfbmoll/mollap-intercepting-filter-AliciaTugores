package Administrador;

import Filtros.Filtro;
import Targets.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tareas {

    private List<Filtro> tareas = new ArrayList<>();
    private Optional<Target> target;

    public Tareas(){}

    public List<Filtro> getTareas() {
        return this.tareas;
    }

    public Optional <Target> getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void addTarea(Filtro filtro) {
        getTareas().add(filtro);
    }

    public void ejecucion(String message) {
        for (Filtro item : tareas) {
            if (getTarget().isPresent()) {
                item.ejecucion(message);
            }
        }
    }
}
