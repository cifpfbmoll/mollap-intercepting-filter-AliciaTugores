import Administrador.ProgramadorTareas;
import Filtros.Autentificacion;
import Filtros.Autorizacion;
import Targets.Vehiculo;
import Clientes.Mollapp;

public final class App {

	public static void main(String[] args) {

		/**
		 * Configuració del programador de tasques
		 * del sistema amb el tipus de target triat:
		 * des de vehicles a qualsevol cosa que admiteix
		 * la recepció d'un missatge.
		 */
		ProgramadorTareas programadorTareas = new ProgramadorTareas(new Vehiculo());

		/**
		 * Afegir al sistema les tasques que volem que el sistema
		 * executi al rebre la petició del client.
		 */
		programadorTareas.setTarea(new Autentificacion());
		programadorTareas.setTarea(new Autorizacion());

		/**
		 * Configuració de l'app client per a que
		 * executi les tasques programades i
		 * enviï el misstage al sistema.
		 */
		Mollapp mollapp = new Mollapp();
		mollapp.setProgramadorTareas(programadorTareas);
		mollapp.enviarPeticion("Francesc");
	}
}

