package Clientes;

import Administrador.ProgramadorTareas;

public interface Cliente {

    void setProgramadorTareas(ProgramadorTareas hola);
    void enviarPeticion(String message);
}
