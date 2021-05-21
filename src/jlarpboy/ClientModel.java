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

    private String modelProperty = "hola";
    private int fisicoProperty = 2;
    private String logProperty = "";

    public String getModelProperty() {
        return modelProperty;
    }

    public void setModelProperty(String modelProperty) {
        this.modelProperty = modelProperty;
    }

    public int getFisicoProperty() {
        return fisicoProperty;
    }

    public void setFisicoProperty(int fisicoProperty) {
        this.fisicoProperty = fisicoProperty;
        setLogProperty(getLogProperty() + "\n" + "Los atributos físicos ahora valen: " + fisicoProperty);

    }

    public String getLogProperty() {
        return logProperty;
    }

    public void setLogProperty(String logProperty) {
        this.logProperty = logProperty;
    }

}
