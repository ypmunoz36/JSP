/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apuntesdejava.jsf.controladores;

import java.util.Calendar;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author ymunoz
 */
@Named("navegacionBean")
@RequestScoped
public class NavegacionBean {
    static final Logger LOGGER = Logger.getLogger(NavegacionBean.class.getName());
    
    public NavegacionBean(){
        LOGGER.info("Iniciando Bean");
    }
    
    public String saludar(){
        int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hora < 12){
            return "Buenos dias"; // este se enlaza en faces-config.xml
        }
        if(hora < 18){
            return "buenas tardes";
        }
        if(hora < 23){
            return "buenas noches";
        }
        return null; // /todo action=null redirecciona  a la misma página de donde fue invocado
    }
}
