/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asw.jsf.component;

import java.util.logging.Logger;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
/**
 *
 * @author ymunoz
 */
@FacesComponent("SelectProduct")
public class SelectProductComponent extends UINamingContainer{
    
    private static final Logger LOG = Logger.getLogger(SelectProductComponent.class.getName());
   
    
    @Inject
    private ProductCodeDao productCodeDao; //manejamos todos los productCode de la base de datos
    @Inject
    private ProductDao productDao; //manejamos todos los product de la base de datos
 
    /**
     * Obtiene todos los productCode de la base de datos
     *
     * @return
     */
    public List<ProductCode> getAllProductCodes() {
        return productCodeDao.getAllProductCodes();
    }
 
    /**
     * Obtiene todos los productos de un productCode seleccionado previamente
     *
     * @return
     */
    public List<Product> getProducts() {
        //así obtenemos el atributo guardado en el atributo del componente
        String productCode = (String) getAttributes().get("productCode");
 
        LOG.log(Level.INFO, "ProductCode seleccionado:{0}", productCode);
        return productDao.getProductsByProductCode(productCode); //obtiene todos los productos segun el productCode selecionado
    }
 
    /**
     * Interpreta el cambio del valor del combo ProductCode
     *
     * @param event
     */
    public void doProductCodeChange(ValueChangeEvent event) {
        String productCode = (String) event.getNewValue(); //obtenemos el valor...
        getAttributes().put("productCode", productCode); //... y lo guardamos en los atributos
    }
}
