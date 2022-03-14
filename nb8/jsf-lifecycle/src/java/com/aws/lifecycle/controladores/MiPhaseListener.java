/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aws.lifecycle.controladores;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author ymunoz
 */
public class MiPhaseListener implements PhaseListener{

   static final Logger LOGGER = Logger.getLogger(MiPhaseListener.class.getName());
 
    @Override
    public void afterPhase(PhaseEvent event) {
        LOGGER.log(Level.INFO, "Después:{0}", event.getPhaseId());
    }
 
 
    @Override
    public void beforePhase(PhaseEvent event) {
        LOGGER.log(Level.INFO, "Antes:{0}", event.getPhaseId());
    }
 
    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
