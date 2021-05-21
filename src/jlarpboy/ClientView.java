/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlarpboy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.mvp4j.annotation.Action;
import org.mvp4j.annotation.MVP;
import org.mvp4j.annotation.Model;

/**
 *
 * @author nexo_
 */
@MVP(modelClass = ClientModel.class, presenterClass = ClientPresenter.class)
public class ClientView extends JFrame {

    @Action(name = "actionExemple")
    JButton button;

    @Model(property = "modelProperty")
    JTextField textField;

    public ClientView() {

        setTitle("Client Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new JPanel());
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        add(getTextField());
        add(getButton());
    }

    public JButton getButton() {
        if (button == null) {
            button = new JButton("OK");
            button.setBounds(10, 10, 70, 40);

        }
        return button;
    }

    public JTextField getTextField() {
        if (textField == null) {
            textField = new JTextField();
            textField.setBounds(70, 150, 150, 30);

        }
        return textField;
    }
}
