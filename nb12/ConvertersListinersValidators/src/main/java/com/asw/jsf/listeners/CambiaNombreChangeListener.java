/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asw.jsf.listeners;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 *
 * @author ymunoz
 */
public class CambiaNombreChangeListener implements ValueChangeListener{

    private static final Logger LOG = Logger.getLogger(CambiaNombreChangeListener.class.getName());

    
    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        LOG.log(Level.INFO, "Entrando al Listener de {0}", getClass().getName());
        if (event.getNewValue() != null) {
            LOG.log(Level.INFO, "\tNuevo valor:{0}", event.getNewValue());
        }    }
    
}
