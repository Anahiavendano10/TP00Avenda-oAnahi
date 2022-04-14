package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00AvendanoAnahiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00AvendanoAnahiApplication.class, args);
		String nombre = "Gustavo";
		System.out.println("Hola EDM, dice " + nombre + "  " + darNombre());
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("47241199");
		unEstudiante.setApellido("Avendaño");
		unEstudiante.setGenero('F');
		unEstudiante.setNombre("Anahi");
		System.out.println("El Estudiante " + unEstudiante.getNombre() + " dice Hola");
		//crear un objeto
		Calculadora unCalculadora = new Calculadora();
		unCalculadora.setN1(125);
		unCalculadora.setN2(3);
		System.out.println("El resultado de la suma es: " + unCalculadora.resolverSuma());
		System.out.println("El resultado de la resta es: " + unCalculadora.resolverResta());
		System.out.println("El resultado de la multiplicacion es: " + unCalculadora.resolverMultiplicacion());
		double resolverDivision = unCalculadora.resolverDivision();
		if(resolverDivision==0) {
			System.out.println("el divisor tiene que ser mayor a 0" );
		}
		else {
			System.out.println("la division es: "+resolverDivision);
		}
		System.out.println("la potencia es: "+ unCalculadora.resolverPotencia());
		
		System.out.println("la raiz es: "+ unCalculadora.resolverRaiz());
		
		System.out.println("la raiz n es: "+ unCalculadora.resolverRaizn());
	}
	public static String darNombre()
	{
		String nuevoNombre = "Sebastian"; 
		return nuevoNombre;
	}

}
