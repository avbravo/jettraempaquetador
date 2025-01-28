package com.avbravo.jettraempaquetador.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.jettraserver.view.JettraView;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author avbravo
 */
@Path("/view/chartjs")
public class ChartJSView implements JettraView{

   
   

    @Override
    public Response draw() {
        return generate("com/web/pages/chartjs.html");
    }

}
