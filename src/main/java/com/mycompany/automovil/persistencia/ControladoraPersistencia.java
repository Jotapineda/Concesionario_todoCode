
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.Logica.Automovil;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa= new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        
        //con este método realizamos el alta de los datos en la DB
        
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        
        //este método lo que realiza es tarer todos los registros de la base 
        //de datos
        
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
