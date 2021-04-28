package Filtros;

public class Autentificacion implements Filtro{

    public Autentificacion(){}

    @Override
    public void ejecucion(String dni){
        System.out.println(dni.toString() + " autentificado");
    }
}
