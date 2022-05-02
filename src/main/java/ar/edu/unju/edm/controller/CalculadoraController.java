package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;
@Controller
public class CalculadoraController {
@GetMapping("/menu")
	public String menuCalculadora() {
	
	return "index";
	}

@GetMapping("/calculoSuma")//METODOS dentro del controler atraves de un get mapping, muchos metodos
public String getSumaPage (@RequestParam (name = "num1")int num1,@RequestParam (name = "num2")int num2, Model model){
   int resultadoS = 0;
	Calculadora nuevaCalculadora = new Calculadora();
   nuevaCalculadora.setN1(num1);
   nuevaCalculadora.setN2(num2);
   resultadoS = nuevaCalculadora.resolverSuma();
   model.addAttribute("resultadoS", resultadoS);
   
return "resultado";
}
 
@GetMapping("/calculoResta")
public String getRestaPage (@RequestParam (name = "num1")int num1,@RequestParam (name = "num2")int num2, Model model){
   int resultadoR = 0;
	Calculadora nuevaCalculadora = new Calculadora();
   nuevaCalculadora.setN1(num1);
   nuevaCalculadora.setN2(num2);
   resultadoR = nuevaCalculadora.resolverResta();
   model.addAttribute("resultadoR", resultadoR);
   
return "resultado";
}

@GetMapping("/calculoProducto")
public String getMultiplicacionPage (@RequestParam (name = "num1")int num1,@RequestParam (name = "num2")int num2, Model model){
   int resultadoM = 0;
	Calculadora nuevaCalculadora = new Calculadora();
   nuevaCalculadora.setN1(num1);
   nuevaCalculadora.setN2(num2);
   resultadoM = nuevaCalculadora.resolverMultiplicacion();
   model.addAttribute("resultadoM", resultadoM);
   
return "resultado";
}

@GetMapping("/calculoCociente")
public String getDivisionPage (@RequestParam (name = "num1")int num1,@RequestParam (name = "num2")int num2, Model model){
   double resultadoD = 0;
	Calculadora nuevaCalculadora = new Calculadora();
   nuevaCalculadora.setN1(num1);
   nuevaCalculadora.setN2(num2);
   resultadoD = nuevaCalculadora.resolverDivision();
   model.addAttribute("resultadoD", resultadoD);
   
return "resultado";
}

@GetMapping("/calculoPotencia")
public String getPotenciaPage (@RequestParam (name = "num1")int num1,@RequestParam (name = "num2")int num2, Model model){
   int resultadoP = 0;
	Calculadora nuevaCalculadora = new Calculadora();
   nuevaCalculadora.setN1(num1);
   nuevaCalculadora.setN2(num2);
   resultadoP = nuevaCalculadora.resolverPotencia();
   model.addAttribute("resultadoP", resultadoP);
   
return "resultado";
}

@GetMapping("/calculoRaiz")
public String getRaizPage (@RequestParam (name = "num1")int num1,@RequestParam (name = "num2")int num2, Model model){
   double resultadoRa = 0;
	Calculadora nuevaCalculadora = new Calculadora();
   nuevaCalculadora.setN1(num1);
   nuevaCalculadora.setN2(num2);
   resultadoRa = nuevaCalculadora.resolverRaiz();
   model.addAttribute("resultadoRa", resultadoRa);
   
return "resultado";
}

}
