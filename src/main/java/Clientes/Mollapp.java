package Clientes;

import Administrador.ProgramadorTareas;

public class Mollapp implements Cliente{

    private ProgramadorTareas programador = null;

    public Mollapp(){}

    @Override
    public void setProgramadorTareas(ProgramadorTareas programador) {
        this.programador = programador;
    }

    @Override
    public void enviarPeticion(String message) {
        programador.ejecutarTareas(message);
    }
}
