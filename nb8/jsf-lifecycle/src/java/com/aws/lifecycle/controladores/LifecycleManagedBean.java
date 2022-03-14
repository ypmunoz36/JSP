/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aws.lifecycle.controladores;

import com.aws.lifecycle.bean.PersonaForm;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author ymunoz
 */
@Named("lifecycleBean")
@RequestScoped
public class LifecycleManagedBean {
    private PersonaForm personaForm = new PersonaForm();
 
    public LifecycleManagedBean() {
 
    }
 
    public PersonaForm getPersonaForm() {
        return personaForm;
    }
 
    public void setPersonaForm(PersonaForm personaForm) {
        this.personaForm = personaForm;
    }
}
