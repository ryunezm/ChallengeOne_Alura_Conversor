package com.ryunezm.apps.javacurrconv.view;

import com.formdev.flatlaf.*;
import com.ryunezm.apps.javacurrconv.model.enums.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainWindow extends JFrame {

    private JComboBox<Object> listMeasures_ComboBox;
    private JComboBox<Object> listTop_ComboBox;
    private JComboBox<Object> listBottom_ComboBox;
    private JTextField nfTop;
    private JTextField nfBottom;
    private JCheckBox showExtendedMeasuresCheckBox;
    private JLabel converter_Label;
    private JPanel mainPanel;
    private JButton converterButton;

    public mainWindow(){
        setTitle("Converter");
        setSize(600, 250);
        setResizable(false);
        setMaximumSize(new Dimension(600, 250));
        setMinimumSize(new Dimension(600, 250));
        setPreferredSize(new Dimension(600, 250));
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        initiateComboBox();
        updateComboBox();

        converterButton.addActionListener(e -> {
            try{
                double entryValue = Double.parseDouble(nfTop.getText());
                double outValue = entryValue/100;
                //System.out.println(listMeasures_ComboBox.getSelectedItem().getClass());
                nfBottom.setText(String.valueOf(outValue));

            } catch (NumberFormatException ex){
                System.out.println("Invalid number!!!");
                JOptionPane.showMessageDialog(null, "Invalid number!!!");
                nfBottom.setText("");
            }
        });

        showExtendedMeasuresCheckBox.addActionListener(e -> {

            updateComboBoxesMeasures();
            if(showExtendedMeasuresCheckBox.isSelected()){
                System.out.println("AAA!!!");
                updateComboBoxesMeasures();
            }

            else {
                System.out.println("BBB!!!");
                updateComboBoxesMeasures();
            }
        });

    }

    //Initializers for ComboBoxes
    public void initiateComboBox(){
        showExtendedMeasuresCheckBox.setEnabled(false);
        listBottom_ComboBox.setEnabled(false);
        listTop_ComboBox.setEnabled(false);
        nfBottom.setEnabled(false);
        nfTop.setEnabled(false);
        converterButton.setEnabled(false);

        listMeasures_ComboBox.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus gained");
            }
        });

        for (Measure measure : Measure.values()) {
            listMeasures_ComboBox.addItem(measure.getName());
        }
    }

    public void updateComboBox(){

        listMeasures_ComboBox.addActionListener(e -> {
            String selectedMeasure = (String) listMeasures_ComboBox.getItemAt(listMeasures_ComboBox.getSelectedIndex());

            if (selectedMeasure!=null){
                if (listMeasures_ComboBox.getItemCount()== Measure.values().length){
                    listMeasures_ComboBox.removeItemAt(0);
                    listMeasures_ComboBox.setFocusable(true);
                    listBottom_ComboBox.setEnabled(true);
                    listTop_ComboBox.setEnabled(true);
                    nfTop.setEnabled(true);
                    converterButton.setEnabled(true);
                }
            }

            listBottom_ComboBox.removeAllItems();
            listTop_ComboBox.removeAllItems();
            showExtendedMeasuresCheckBox.setSelected(false);
            updateComboBoxesMeasures();
        });

    }

    //Updaters for ComboBoxes
    private void updateComboBoxesMeasures(){
        try{
            String selectedMeasure = (String) listMeasures_ComboBox.getItemAt(listMeasures_ComboBox.getSelectedIndex());
            Measure selMeasure = Measure.valueOf(selectedMeasure.toUpperCase());

            switch (selMeasure) {
                case SELECT_A_MEASURE -> {}
                case CURRENCY -> updateComboBoxForCurrencyMeasure(showExtendedMeasuresCheckBox.isSelected());
                case LENGTH -> updateComboBoxForLengthMeasure(showExtendedMeasuresCheckBox.isSelected());
                case MASS -> updateComboBoxForMassMeasure(showExtendedMeasuresCheckBox.isSelected());
                case TEMPERATURE -> updateComboBoxForTemperatureMeasure(showExtendedMeasuresCheckBox.isSelected());
                case TIME -> updateComboBoxForTimeMeasure(showExtendedMeasuresCheckBox.isSelected());
                default -> System.out.println("default");
            }
        } catch (Exception ex){
            System.out.println("Exception, dear Lord");
        }
    }

    private void updateComboBoxForCurrencyMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(Measure.CURRENCY.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        for (Currency currency : Currency.values()) {
            listTop_ComboBox.addItem(currency.getName() + " (" + currency.getSymbol() + ")");
            listBottom_ComboBox.addItem(currency.getName() + " (" + currency.getSymbol() + ")");
        }
    }

    private void updateComboBoxForLengthMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(Measure.LENGTH.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        if (extendedMeasure){
            for (Length length : Length.values()) {
                listTop_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
                listBottom_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
            }
        }
        if (!extendedMeasure)
        {
            for (Length length : Length.values()) {
                if (length.isCommonness()){
                    listTop_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
                    listBottom_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
                }
            }
        }
    }

    private void updateComboBoxForMassMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(Measure.MASS.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        if (extendedMeasure){
            for (Mass mass : Mass.values()) {
                listTop_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
                listBottom_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
            }
        }
        if (!extendedMeasure)
        {
            for (Mass mass : Mass.values()) {
                if (mass.isCommonness()){
                    listTop_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
                    listBottom_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
                }
            }
        }
    }

    private void updateComboBoxForTemperatureMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(Measure.TEMPERATURE.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        for (Temperature temperature : Temperature.values()) {
            listTop_ComboBox.addItem(temperature.getName() + " (" + temperature.getSymbol() + ")");
            listBottom_ComboBox.addItem(temperature.getName() + " (" + temperature.getSymbol() + ")");
        }
    }

    private void updateComboBoxForTimeMeasure(Boolean extendedMeasure){
        nfBottom.setText("");
        nfTop.setText("");
        showExtendedMeasuresCheckBox.setEnabled(Measure.TIME.isExtended());
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        if (extendedMeasure){
            for (Time time : Time.values()) {
                listTop_ComboBox.addItem(time.getName() + " (" + time.getSymbol() + ")");
                listBottom_ComboBox.addItem(time.getName() + " (" + time.getSymbol() + ")");
            }
        }
        if (!extendedMeasure)
        {
            for (Time time : Time.values()) {
                if (time.isCommonness()){
                    listTop_ComboBox.addItem(time.getName() + " (" + time.getSymbol() + ")");
                    listBottom_ComboBox.addItem(time.getName() + " (" + time.getSymbol() + ")");
                }
            }
        }
    }

    //Main method
    public static void main(String[] args) {
        FlatLightLaf.setup();
        var mw = new mainWindow();
    }
}