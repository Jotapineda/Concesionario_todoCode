
package com.mycompany.automovil.Logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import com.mysql.cj.conf.PropertyKey;
import java.util.List;

public class Controladora {

    //aqui generamos la instancia entre la controladora de la lógica con
    //la controladora de la persistencia
    
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    
    
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantidadPuertas) {
        
        Automovil auto= new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        
       controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        
       controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
       
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor,
            String color, String patente, int cantidadPuertas) {
        
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        auto.setMarca(marca);
        
        //le pido a la persisi que realice la persistencia
        controlPersis.modificarAuto(auto);
    }
    
}
