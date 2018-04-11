/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author MPCS
 */
@Named(value = "citaController")
@RequestScoped
public class citaController {

    private  List<String> compradores ;
    private  List<String> productores;
    private  List<String> citas;
    private Random randomico;
    
    @PostConstruct     
    public void citaControllerinit() { 
        
        compradores=new ArrayList<String>();
        compradores.add("c1");
        compradores.add("c2");
        compradores.add("c3");
        compradores.add("c4");
        compradores.add("c5");
        productores=new ArrayList<String>();
        productores.add("p1");
        productores.add("p2");
        productores.add("p3");
        productores.add("p4");
        productores.add("p5");
        productores.add("p6");
        citas=new ArrayList<String>();
         citas=new ArrayList<String>();
           System.out.println("Ingreso a generar cita");
        for(String comprador: compradores){
            
            int numero=(int) (Math.random()*(compradores.size()-1)+1);
            this.citas.add(comprador);
            this.citas.add(String.valueOf(productores.get(numero)));

        }
    }
    
       public void verCitas() throws IOException{
   
        FacesContext contex = FacesContext.getCurrentInstance();
            contex.getExternalContext().redirect( "/citasCompradorProductor/faces/citas.xhtml" );
//        return "/mavenproject1/faces/citas?faces-redirect=true";
    }

    public List<String> getCompradores() {
        return compradores;
    }

    public void setCompradores(List<String> compradores) {
        this.compradores = compradores;
    }

    public List<String> getProductores() {
        return productores;
    }

    public void setProductores(List<String> productores) {
        this.productores = productores;
    }

    public List<String> getCitas() {
        return citas;
    }

    public void setCitas(List<String> citas) {
        this.citas = citas;
    }

   
    
   
   
    
    
}
