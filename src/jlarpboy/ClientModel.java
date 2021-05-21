/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlarpboy;

import java.io.Serializable;

/**
 *
 * @author nexo_
 */
public class ClientModel implements Serializable {

    private String modelProperty;

    public String getModelProperty() {
        return modelProperty;
    }

    public void setModelProperty(String modelProperty) {
        this.modelProperty = modelProperty;
    }
}
