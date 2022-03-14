/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apuntesdejava.jsf.controladores;

import com.apuntesdejava.jsf.util.ResourcesUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ymunoz
 */
@Named(value = "contactoFormBean")
@RequestScoped
public class ContactoFormBean {

    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Creates a new instance of ContactoFormBean
     */
    public ContactoFormBean() {
    }
   
    public String getSaludo(){
    return ResourcesUtil.getString("#{msg['app.saludo']}")  +nombre;
}
}
