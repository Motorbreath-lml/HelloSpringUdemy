/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author j3r4ck
 */
//Anotacion para indicarle a Spring como funciona la clase
@RestController
//Notacion de Lombbock para mandar Logs de lo que sucede
@Slf4j
public class ControladorInicio {

    //Anotacion para indicar que la ruta del metodo
    //Es una peticion del tipo Get
    @GetMapping("/")
    public String Inicio() {
        //Mensaje para el log, gracias al lombock y @Slf4j
        //Este mensaje se muestra en consola
        log.info("Ejecutando el controlador REST");
        //Mas detalles para el debu, despues de modificar las propiedades de la aplicaion
        log.debug("Mas detalles del controlador");
        return "Hola mundo desde Spring 2";
    }
}
