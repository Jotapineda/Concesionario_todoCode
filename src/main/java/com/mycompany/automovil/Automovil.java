
//este es mi main
package com.mycompany.automovil;

import com.mycompany.automovil.IGU.Principal;


public class Automovil {

    public static void main(String[] args) {
        
        //aqui instanciamos la interfaz gráfica con mi lógica, y la hacemos visible
        Principal prince= new Principal();
        prince.setVisible(true);
        prince.setLocationRelativeTo(null);               
    }
}
