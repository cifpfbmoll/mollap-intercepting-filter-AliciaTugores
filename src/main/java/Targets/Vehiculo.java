package Targets;

public class Vehiculo implements Target{

    @Override
    public void ejecucion(String usuario) {
        System.out.println("Puerta del vehículo abierta " + usuario.toString());
    }
}
