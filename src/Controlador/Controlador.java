/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.modelo;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener{
    private Principal view;
    private modelo model;
    
    public  Controlador(Principal view, modelo model) {
        this.view =view;
        this.model=model;
        this.view.btnSuma.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("MVC Operaciones ff");
        view.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        model.setNumerouno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumerodos(Integer.parseInt(view.txtNumeroDos.getText()));
        if(e.getSource() == this.view.btnSuma){
            model.suma();
        }
        if(e.getSource()== this.view.btnRestar){
            model.resta();
        }
        if(e.getSource()== this.view.btnMultiplicar){
            model.multiplicacion();
        }
        if(e.getSource()== this.view.btnDividir){
            model.division();
        }
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
    
}

    
    
       

