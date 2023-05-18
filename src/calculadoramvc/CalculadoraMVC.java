/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramvc;

import Controlador.Controlador;
import Modelo.modelo;
import Vista.Principal;

public class CalculadoraMVC {

    public static void main(String[] args) {
      modelo mod = new modelo();
      Principal view = new Principal();
      
      Controlador ctrl = new Controlador(view,mod);
      ctrl.iniciar();
      view.setVisible(true);
      
    }
    
}
