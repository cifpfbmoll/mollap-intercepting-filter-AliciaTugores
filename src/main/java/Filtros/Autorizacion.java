package Filtros;

public class Autorizacion implements Filtro{

    public Autorizacion(){}

    @Override
    public void ejecucion(String user){
        System.out.println(user.toString() + " está autorizado");
    }
}
