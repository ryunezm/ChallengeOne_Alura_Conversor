package com.ryunezm.apps.javacurrconv.view;

import com.formdev.flatlaf.*;
import com.ryunezm.apps.javacurrconv.model.enums.*;
import javax.swing.*;

public class MainWindow extends JFrame {

    private JComboBox<Object> listTop_ComboBox;
    private JComboBox<Object> listBottom_ComboBox;
    private JTextField nfTop;
    private JTextField nfBottom;
    private JCheckBox showExtendedMeasuresCheckBox;
    private JLabel converter_Label;
    private JLabel lblAuthorRyunezm;
    private JComboBox listMeasures_ComboBox;
    private JPanel mainPanel;

    public MainWindow(){
        setTitle("Converter");
        setSize(600, 250);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        initiateComboBox();
        updateComboBox();

    }

    public void initiateComboBox(){
        showExtendedMeasuresCheckBox.setEnabled(false);
        listBottom_ComboBox.setEnabled(false);
        listTop_ComboBox.setEnabled(false);
        nfBottom.setEnabled(false);
        nfTop.setEnabled(false);

        for (Measure measure : Measure.values()) {
            listMeasures_ComboBox.addItem(measure.getName());
        }
    }

    public void cleanListComboBox(){
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();
    }

    public void updateComboBox(){

        listMeasures_ComboBox.addActionListener(e -> {
            String selectedMeasure = (String) listMeasures_ComboBox.getItemAt(listMeasures_ComboBox.getSelectedIndex());
            if (selectedMeasure!=null){
                if (listMeasures_ComboBox.getItemCount()== Measure.values().length){
                    listMeasures_ComboBox.removeItemAt(0);
                    listBottom_ComboBox.setEnabled(true);
                    listTop_ComboBox.setEnabled(true);
                    nfBottom.setEnabled(true);
                    nfTop.setEnabled(true);
                }
            }

            cleanListComboBox();
            showExtendedMeasuresCheckBox.setSelected(false);
            showExtendedMeasuresCheckBox.setEnabled(true);

            Measure selMeasure = Measure.valueOf(selectedMeasure.toUpperCase());

            switch (selMeasure) {

                case CURRENCY -> {
                    showExtendedMeasuresCheckBox.setEnabled(Measure.CURRENCY.isExtended());
                    for (Currency currency : Currency.values()) {
                        listTop_ComboBox.addItem(currency.getName() + " (" + currency.getSymbol() + ")");
                        listBottom_ComboBox.addItem(currency.getName() + " (" + currency.getSymbol() + ")");
                    }
                }
                case LENGTH -> {
                    showExtendedMeasuresCheckBox.setEnabled(Measure.LENGTH.isExtended());
                    for (Length length : Length.values()) {
                        listTop_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
                        listBottom_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
                    }
                }
                case MASS -> {
                    showExtendedMeasuresCheckBox.setEnabled(Measure.MASS.isExtended());
                    for (Mass mass : Mass.values()) {
                        listTop_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
                        listBottom_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
                    }
                }
                case TEMPERATURE -> {
                    showExtendedMeasuresCheckBox.setEnabled(Measure.TEMPERATURE.isExtended());
                    for (Temperature temperature : Temperature.values()) {
                        listTop_ComboBox.addItem(temperature.getName() + " (" + temperature.getSymbol() + ")");
                        listBottom_ComboBox.addItem(temperature.getName() + " (" + temperature.getSymbol() + ")");
                    }
                }
                case TIME -> {
                    showExtendedMeasuresCheckBox.setEnabled(Measure.TIME.isExtended());
                    for (Time time : Time.values()) {
                        listTop_ComboBox.addItem(time.getName() + " (" + time.getSymbol() + ")");
                        listBottom_ComboBox.addItem(time.getName() + " (" + time.getSymbol() + ")");
                    }
                }
                default -> {}
            }
        });

    }



    public static void main(String[] args) {
        FlatLightLaf.setup();
        MainWindow mw = new MainWindow();
    }
}