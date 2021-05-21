/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlarpboy;

import java.awt.Font;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import org.mvp4j.annotation.Action;
import org.mvp4j.annotation.MVP;
import org.mvp4j.annotation.Model;

/**
 *
 * @author nexo_
 */
@MVP(modelClass = ClientModel.class, presenterClass = ClientPresenter.class)
public class ClientView extends JFrame {

    int WINDOW_WIDTH = 800;
    int WINDOW_HEIGHT = 600;

//    @Action(name = "actionExemple")
//    JButton button;
    @Model(property = "logProperty")
    JTextArea jTFLog;

    //Objetos
//    @Action(name = "actionExemple")
    JLabel jLAlias = new JLabel("Alias: Conde Draco");
    JLabel jLJugador = new JLabel("Jugador: Nexo");
    JLabel jLClan = new JLabel("Clan: Ventrue");
    JLabel jLFisicos = new JLabel("Físicos: ");
    JLabel jLSociales = new JLabel("Sociales: ");
    JLabel jLMentales = new JLabel("Mentales: ");
    JLabel jLVoluntad = new JLabel("Voluntad: ");
    JLabel jLHumanidad = new JLabel("Humanidad: ");
    JLabel jLGeneracion = new JLabel("Generación: ");

//    JLabel jLAliasValor;
//    JLabel jLJugadorValor;
//    JLabel jLClanValor;
    @Model(property = "fisicoProperty")
    JLabel jLFisicosValor;
//    JLabel jLSocialesValor;
//    JLabel jLMentalesValor;
//    JLabel jLVoluntadValor;
//    JLabel jLHumanidadValor;
//    JLabel jLGeneracionValor;
//
    @Action(name = "actionFisicosMas")
    JButton jBFisicosMas;
//    JButton jBSocialesMas;
//    JButton jBMentalesMas;
//
    @Action(name = "actionFisicosMenos")
    JButton jBFisicosMenos;
//    JButton jBSocialesMenos;
//    JButton jBMentalesMenos;
//
//
//    JPanel jPpersonaje;

    public ClientView() {

        setTitle("Client Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new JPanel());
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setLayout(null);
        placeLabels();
        add(getJTFLog());
        add(getJLFisicosValor());
        add(getJBFisicosMas());
        add(getJBFisicosMenos());
    }

    private void placeLabels() {
        Font font = new Font("Monaco", Font.PLAIN, 20);
        jLAlias.setBounds(200, 10, 200, 30);
        jLAlias.setFont(font);
        add(jLAlias);
        jLJugador.setBounds(200, 40, 200, 30);
        jLJugador.setFont(font);
        add(jLJugador);
        jLClan.setBounds(200, 70, 200, 30);
        jLClan.setFont(font);
        add(jLClan);
        jLFisicos.setBounds(200, 100, 200, 30);
        jLFisicos.setFont(font);
        add(jLFisicos);
        jLSociales.setBounds(200, 130, 200, 30);
        jLSociales.setFont(font);
        add(jLSociales);
        jLMentales.setBounds(200, 160, 200, 30);
        jLMentales.setFont(font);
        add(jLMentales);
        jLVoluntad.setBounds(200, 190, 200, 30);
        jLVoluntad.setFont(font);
        add(jLVoluntad);
        jLHumanidad.setBounds(200, 220, 200, 30);
        jLHumanidad.setFont(font);
        add(jLHumanidad);
        jLGeneracion.setBounds(200, 250, 200, 30);
        jLGeneracion.setFont(font);
        add(jLGeneracion);
    }

    public JTextArea getJTFLog() {
        if (jTFLog == null) {
            jTFLog = new JTextArea();
            jTFLog.setBounds(0, WINDOW_HEIGHT - 100, WINDOW_WIDTH, 100);

        }
        return jTFLog;
    }

    public JLabel getJLFisicosValor() {
        if (jLFisicosValor == null) {
            jLFisicosValor = new JLabel();
            jLFisicosValor.setBounds(300, 100, 200, 30);
        }
        return jLFisicosValor;
    }

    public JButton getJBFisicosMas() {
        if (jBFisicosMas == null) {
            jBFisicosMas = new JButton("+");
            jBFisicosMas.setBounds(150, 100, 40, 40);
        }
        return jBFisicosMas;
    }

    public JButton getJBFisicosMenos() {
        if (jBFisicosMenos == null) {
            jBFisicosMenos = new JButton("-");
            jBFisicosMenos.setBounds(380, 100, 40, 40);
        }
        return jBFisicosMenos;
    }

    void update() {
        jLFisicosValor.repaint();
    }
}
