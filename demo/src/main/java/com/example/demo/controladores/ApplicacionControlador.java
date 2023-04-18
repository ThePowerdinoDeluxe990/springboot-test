package com.example.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
@Controller
public class ApplicacionControlador {
    
    //http://localhost:8080/bienvenida
    @GetMapping("/bienvenida")
    public String mostrarBievenido(Model model){
        System.out.println("Ejecutando bienvenida");

        String nombreUsuario = "Homer Barsa";
        model.addAttribute("nombreUsuario",nombreUsuario);

        return "inicio";
    }

    @GetMapping("/calculadora")
    public String muestraCalculadora(){
        return "calculadora";
    }
    
    @GetMapping("/imc")
    public String calculaIMC(double peso, double altura, Model modelo){
        double imc= peso/(altura*altura);

        modelo.addAttribute("imc", imc);

        return "resultado";
    }

}
