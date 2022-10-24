package com.checho.guayabita.app;

import com.checho.guayabita.dominio.Player;
import com.checho.guayabita.dominio.Round;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class App {
    private static Round round = new Round();
    private static Image guavaIconSized = new ImageIcon(Objects.requireNonNull(App.class.getResource("./guayabaIcon.png"))).getImage()
            .getScaledInstance(120, 120, Image.SCALE_SMOOTH);

    public static void main(String[] args) {
        float roundBet;
        Object[] initialDialogButtons = {"Sí", "No"};
        Boolean play = false;
        ImageIcon guavaIcon = new ImageIcon(guavaIconSized);
        int responseInitialDialog = JOptionPane.showOptionDialog(null, "Bienvenido al juego de la guayabita \n " +
                        "¿Quieres jugar?", "La guayabita",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, guavaIcon, initialDialogButtons, initialDialogButtons[0]);

        if (responseInitialDialog == 0) {
            while (!play) {
                int responsePlay = openOptionDialog("Quiero Jugar", "Ver instrucciones", "Se que quieres jugar pero no es mejor ver las instrucciones");
                if (responsePlay == 0) {
                    play = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Aquí van las instrucciones ");
                }
            }
            String resNumberOfPlayersDialog = openInputDialog("¿Cuántas perosnas jugarán?");
            if (resNumberOfPlayersDialog != null) {
                int nPlayers = Integer.parseInt(resNumberOfPlayersDialog);
                for (int i = 0; i < nPlayers; i++) {
                    Boolean gotData = getNameAndBetOfEachPlayer(i);
                    if (Boolean.FALSE.equals(gotData)) {
                        break;
                    }
                }
                String roundBetString = openInputDialog("¿Cuál es el pote inicial?");
                if(roundBetString != null){
                    AtomicReference<Boolean> valid = new AtomicReference<>(true);
                    while(!valid.get()){
                        float tempBet = Float.parseFloat(roundBetString);
                        round.getPlayers().forEach(player -> {
                           if(player.getBet() > tempBet){


                            }

                        });
                    }

                }
            }
        }
    }

    public static Boolean getNameAndBetOfEachPlayer(int nPlayer) {
        String nameOfPlayer = openInputDialog("Ingrese el nombre del jugador" + (nPlayer + 1));
        if (nameOfPlayer != null) {
            String moneyToBet = openInputDialog("¿Cuánto dinero tiene el jugador" + (nPlayer + 1) + "?");
            if (moneyToBet != null) {
                round.addPlayer(new Player(nameOfPlayer, Float.parseFloat(moneyToBet)));
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
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

    public static int openOptionDialog(String acceptButton, String cancelButton, String messange) {
        Object[] initialDualogButton = {acceptButton, cancelButton};
        return JOptionPane.showOptionDialog(null, messange, "La guayabita",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(guavaIconSized),
                initialDualogButton, initialDualogButton[0]);
    }

}