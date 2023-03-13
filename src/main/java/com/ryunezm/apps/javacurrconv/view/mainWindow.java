package com.ryunezm.apps.javacurrconv.view;

import javax.swing.*;

public class mainWindow {

    private JComboBox listTop_ComboBox;
    private JComboBox listBottom_ComboBox;
    private JTextField nfTop;
    private JTextField nfBottom;
    private JCheckBox showExtendedMeasuresCheckBox;
    private JLabel converter_Label;
    private JLabel lblAuthorRyunezm;
    private JComboBox listMeasures_ComboBox;
    private JPanel mainPanel;

    public static void fillComboBox(String measure){
        switch (measure){
            case ("Human"):
                break;
            default:
                System.out.println("Nothing");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainWindow");
        frame.setContentPane(new mainWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


