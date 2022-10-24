package com.checho.guayabita.dominio;
import com.checho.guayabita.app.App;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Round {
    private static Image guavaIconSized = new ImageIcon(Objects.requireNonNull(App.class.getResource("./guayabaIcon.png"))).getImage()
            .getScaledInstance(120, 120, Image.SCALE_SMOOTH);
    private float totalBet;
    private List<Player> players;

    public Round() {
        this.totalBet = 0;
        this.players = new ArrayList<>();
    }

    public float getTotalBet() {
        return totalBet;
    }

    public void setTotalBet(float totalBet) {
        this.totalBet = totalBet;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player players) {
        this.players.add(players);
    }
    public static String openInputDialog(String message) {
        Object[] buttons = {"Continuar", "Salir"};
        JPanel panel = new JPanel();
        panel.add(new JLabel(message));
        JTextField textField = new JTextField(2);
        textField.setMaximumSize(new Dimension(300, 30));
        GridLayout layout = new GridLayout();
        layout.setColumns(1);
        layout.setRows(2);
        panel.setLayout(layout);
        panel.add(textField);
        int dialogResponse = JOptionPane.showOptionDialog(null, panel, "La guayabita"
                , JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, new ImageIcon(guavaIconSized), buttons
                , buttons[0]);
        if (dialogResponse == 0) {
            return textField.getText();
        }
        return null;
    }

    public static int openOptionDialog(String acceptButton, String cancelButton, String messange, ImageIcon icon) {
        Object[] initialDualogButton = {acceptButton, cancelButton};
        return JOptionPane.showOptionDialog(null, messange, "La guayabita",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon,
                initialDualogButton, initialDualogButton[0]);
    }
}