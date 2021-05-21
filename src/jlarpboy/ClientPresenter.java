/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlarpboy;

/**
 *
 * @author nexo_
 */
public class ClientPresenter {

    ClientView view;
    ClientModel model;

    public ClientPresenter(ClientView view, ClientModel model) {
        this.view = view;
        this.model = model;
    }

    public void actionExemple() {
        System.out.println("Hello world, this action event work just fine");
    }
}
