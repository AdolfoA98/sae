/**
* Programa:    SAE
* Nombre:      Adolfo Ángel de la Cruz Díaz,
*              Primitivo Cruz Hernández.
* Fecha:       06/03/2018
* Versión:     0.1
* Descripción: Descripción de lo que hace la clase.
*/
package sae;

import sae.conector.Conector;
import sae.ui.RegistroClienteGUI;

public class SAE {
    
    static Conector conector;

    public static void main(String[] args) {
       new RegistroClienteGUI();
       return;
    }
    
}
