/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jettraempaquetador;

/**
 *
 * @author avbravo
 */
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Application;

@Path("/hello")
public class MiAplicacion extends Application {

    @GET
    public String sayHello() {
        return "Hola, mundo!";
    }

    public static void main(String[] args) {
        System.out.println("Iniciando la aplicación...");
        // Aquí podrías iniciar un servidor HTTP o realizar otras tareas de inicialización
    }
    
}
