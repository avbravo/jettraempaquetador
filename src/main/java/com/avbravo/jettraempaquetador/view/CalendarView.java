/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jettraempaquetador.view;

import com.jettraserver.view.JettraView;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author avbravo
 */
@Path("/view/calendar")
public class CalendarView implements JettraView{

    @Override
    public Response draw() {
        return generate("com/web/pages/calendar.html");
    }
    
}
