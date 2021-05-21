/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlarpboy;

import org.mvp4j.impl.reflect.AppControllerReflect;
import org.mvp4j.impl.reflect.AppControllerReflectFactory;

/**
 *
 * @author nexo_
 */
public class JLarpBoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientView view = new ClientView();
        ClientModel model = new ClientModel();
        ClientPresenter presenter = new ClientPresenter(view, model);

        view.setVisible(true);

        AppControllerReflect appController = AppControllerReflectFactory
                .getAppControllerInstance();
        appController.bind(view, model, presenter);
    }

}
