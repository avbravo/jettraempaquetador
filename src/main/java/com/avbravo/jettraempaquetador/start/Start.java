/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.avbravo.jettraempaquetador.start;

import com.avbravo.jettraempaquetador.configuration.JakartaRestConfiguration;
import com.avbravo.jettraempaquetador.controller.CountryController;
import com.avbravo.jettraempaquetador.controller.EmployeeController;
import com.avbravo.jettraempaquetador.controller.HelloController;
import com.avbravo.jettraempaquetador.view.BlankView;
import com.avbravo.jettraempaquetador.view.CalendarView;
import com.avbravo.jettraempaquetador.view.ChartJSView;
import com.avbravo.jettraempaquetador.view.CountryView;
import com.avbravo.jettraempaquetador.view.DarkModeView;
import com.avbravo.jettraempaquetador.view.DashboardView;
import com.avbravo.jettraempaquetador.view.EmpleadoView;
import com.avbravo.jettraempaquetador.view.FormsView;
import com.avbravo.jettraempaquetador.view.GraficaView;
import com.avbravo.jettraempaquetador.view.HomeView;
import com.avbravo.jettraempaquetador.view.J2htmlView;
import com.avbravo.jettraempaquetador.view.JmoordbJ2htmlView;
import com.avbravo.jettraempaquetador.view.LoginView;
import com.avbravo.jettraempaquetador.view.MapaView;
import com.avbravo.jettraempaquetador.view.RegistrarseView;
import com.avbravo.jettraempaquetador.view.TableView;
import com.avbravo.jettraempaquetador.view.TabsView;
import com.avbravo.jettraempaquetador.view.TailwindView;
import com.avbravo.jettraempaquetador.view.template.AboutView;
import com.avbravo.jettraempaquetador.view.template.TemplateView;
import com.jettraserver.JettraServer;
import com.jettraserver.enumerations.Protocol;
import com.jettraserver.health.JettraHealthController;
import jakarta.ws.rs.SeBootstrap.Configuration.SSLClientAuthentication;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author avbravo
 */
public class Start {

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
      
        
//         Car car = new CarBuilder()
//                 .setMarca("Toyota")
//                 .setModelo("Corolla")
//                 .build();
//
//        System.out.println("--->Toyota[]= "+car.marca);
////      assertEquals("toyota", car.marca);
              /**
         * Con RootPath
         */
  //String host="localhost";
  String host="192.168.60.243";
   //      String host="192.168.50.116";
        JettraServer local = new JettraServer.Builder()
                .protocol(Protocol.HTTP)
                .host(host)
                .port(8080)
                .runInternalTest(Boolean.FALSE)
                .sslClientAuthentication(SSLClientAuthentication.NONE)
                .rootPath("api")
                .logo(Boolean.TRUE)
                .application(new JakartaRestConfiguration() {
                    @Override
                    public Set<Class<?>> getClasses() {
                        Set<Class<?>> classes = new HashSet<>();
                        classes.add(EmployeeController.class);
                        classes.add(HelloController.class);
                        classes.add(CountryController.class);
                        classes.add(JettraHealthController.class);

                        classes.add(ChartJSView.class);
                        classes.add(GraficaView.class);
                        classes.add(TailwindView.class);
                        classes.add(TemplateView.class);
                        classes.add(MapaView.class);
                        classes.add(HomeView.class);
                        classes.add(AboutView.class);
                        classes.add(EmpleadoView.class);
                        classes.add(LoginView.class);
                        classes.add(J2htmlView.class);
                        classes.add(JmoordbJ2htmlView.class);
                        classes.add(TableView.class);
                        classes.add(TabsView.class);
                        classes.add(CalendarView.class);
                        classes.add(FormsView.class);
                        classes.add(BlankView.class);
                        classes.add(DashboardView.class);
                        classes.add(RegistrarseView.class);
                        classes.add(DarkModeView.class);
                        classes.add(CountryView.class);
                        return classes;
                    }
                }
                )
                .start();
        
        
        
      
        
        
        
        
        
//SeBootstrap.start(JakartaRestConfiguration.class)
//        .thenApply(instance -> {
//            instance.stopOnShutdown((stopResult -> System.out.println("Container has stopped.")));
//            try (Client client = ClientBuilder.newClient()) {
//                final Response response = client.target(instance.configuration()
//                        .baseUriBuilder()
//                        .path("rest")).request().get();
//                System.out.println(response.readEntity(String.class));
//            }
//            return instance;
//        }).toCompletableFuture().get();
        /**
         * Con RootPath
         */
//        JettraServer local = new JettraServer.Builder()
//                .protocol("HTTP")
//                .host("localhost")
//                .port(8080)
//                .rootPath("api")
//                .logo(Boolean.TRUE)
//                .application(
//                        new JakartaRestConfiguration() {
//                    @Override
//                    public Set<Class<?>> getClasses() {
//                        Set<Class<?>> classes = new HashSet<>();
//                        classes.add(EmployeeController.class);
//                        classes.add(HelloController.class);
//                        classes.add(JettraHealthController.class);
//                        return classes;
//                    }
//                }
//                )
//                .jaxRun();

  
// http://localhost:8080/api/jettrahello       

        /**
         * Sin RootPath
         *
         */
//        JettraServer sinRootPath = new JettraServer.Builder()
//                .protocol("HTTP")
//                .host("localhost")
//                .port(8081)
//                 .rootPath("")
//.logo(Boolean.FALSEº)
//                .application(
//                        new JakartaRestConfiguration(){
//                    @Override
//                    public Set<Class<?>> getClasses() {
//                        Set<Class<?>> classes = new HashSet<>();
//                        classes.add(EmployeeController.class);
//                        classes.add(HelloController.class);
//                        classes.add(JettraHealthController.class);
//                        return classes;
//                    }
//                }
//                )
//                .start();
        // http://localhost:8081/jettrahello
//        //HTTPS/TLS
//        // Se necesita certificado
//        JettraServer local = new JettraServer.Builder()
//                .protocol("HTTPS")
//                .host("localhost")
//                .rootPath("api")
//                .tls("TLSv1.2")
//                .port(8080)
//                .application(
//                        new JakartaRestConfiguration(){
//                    @Override
//                    public Set<Class<?>> getClasses() {
//                        Set<Class<?>> classes = new HashSet<>();
//                        classes.add(EmployeeController.class);
//                        classes.add(HelloController.class);
//                        classes.add(JettraHealthController.class);
//                        return classes;
//                    }
//                }
//                )
//                .start();
    }
}
