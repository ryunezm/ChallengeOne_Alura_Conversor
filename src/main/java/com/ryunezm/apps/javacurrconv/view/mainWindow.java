package com.ryunezm.apps.javacurrconv.view;

import com.formdev.flatlaf.*;
import com.ryunezm.apps.javacurrconv.model.*;
import com.ryunezm.apps.javacurrconv.model.enums.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

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
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        initiateComboBox();
        updateComboBox();

        converterButton.addActionListener(e -> calculateConversion());

        showExtendedMeasuresCheckBox.addActionListener(e -> {
            updateComboBoxesMeasures();
            if(showExtendedMeasuresCheckBox.isSelected()){updateComboBoxesMeasures();}
            else {updateComboBoxesMeasures();}
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
            listTop_ComboBox.addItem(currency.getLongName());
            listBottom_ComboBox.addItem(currency.getLongName());
        }
    }

    private void updateComboBoxForLengthMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(Measure.LENGTH.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        for (Length length : Length.values()){
            if (extendedMeasure || length.isCommonness()){
                listTop_ComboBox.addItem(length.getLongName());
                listBottom_ComboBox.addItem(length.getLongName());
            }
        }
    }

    private void updateComboBoxForMassMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(Measure.MASS.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        for (Mass mass : Mass.values()) {
            if (extendedMeasure || mass.isCommonness()){
                listTop_ComboBox.addItem(mass.getLongName());
                listBottom_ComboBox.addItem(mass.getLongName());
            }
        }
    }

    private void updateComboBoxForTemperatureMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(Measure.TEMPERATURE.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        showExtendedMeasuresCheckBox.setEnabled(Measure.TEMPERATURE.isExtended());
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        for (Temperature temperature : Temperature.values()){
            if (extendedMeasure || temperature.isCommonness()){
                listTop_ComboBox.addItem(temperature.getLongName());
                listBottom_ComboBox.addItem(temperature.getLongName());
            }
        }
    }

    private void updateComboBoxForTimeMeasure(Boolean extendedMeasure){
        nfBottom.setText("");
        nfTop.setText("");
        showExtendedMeasuresCheckBox.setEnabled(Measure.TIME.isExtended());
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        for (Time time : Time.values()){
            if (extendedMeasure || time.isCommonness()){
                listTop_ComboBox.addItem(time.getLongName());
                listBottom_ComboBox.addItem(time.getLongName());
            }
        }
    }

    private void calculateConversion(){
        System.out.println("Hi there, I'm converting");
        try{
            double entryValue = Double.parseDouble(nfTop.getText());

            String selMeasure = Objects.requireNonNull(listMeasures_ComboBox.getSelectedItem()).toString();
            String selMeasTop = Objects.requireNonNull(listTop_ComboBox.getSelectedItem()).toString();
            String selMeasBottom = Objects.requireNonNull(listBottom_ComboBox.getSelectedItem()).toString();
            Measure selMeasureEnum = Measure.valueOf(selMeasure.toUpperCase());

            switch (selMeasureEnum){
                case MASS -> {
                    double outValue;
                    UnitMass inUnit = null;
                    UnitMass outUnit = null;

                    for(Mass mass: Mass.values()){
                        String massNameTop = mass.getLongName();
                        String massNameBottom = mass.getLongName();

                        if(selMeasTop.equals(massNameTop)) {inUnit = mass.getUnit();}
                        if(selMeasBottom.equals(massNameBottom)){outUnit = mass.getUnit();}
                    }

                    assert inUnit != null;
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case TIME -> {
                    double outValue;
                    UnitTime inUnit = null;
                    UnitTime outUnit = null;

                    for(Time time: Time.values()){
                        String timeNameTop = time.getLongName();
                        String timeNameBottom = time.getLongName();
                        if(selMeasTop.equals(timeNameTop)) {inUnit = time.getUnit();}
                        if(selMeasBottom.equals(timeNameBottom)){outUnit = time.getUnit();}
                    }
                    assert inUnit != null;
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case LENGTH -> {
                    double outValue;
                    UnitLength inUnit = null;
                    UnitLength outUnit = null;

                    for(Length length: Length.values()){
                        String timeNameTop = length.getLongName();
                        String timeNameBottom = length.getLongName();
                        if(selMeasTop.equals(timeNameTop)) {inUnit = length.getUnit();}
                        if(selMeasBottom.equals(timeNameBottom)){outUnit = length.getUnit();}
                    }
                    assert inUnit != null;
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case CURRENCY -> {
                    double outValue;
                    UnitCurrency inUnit = null;
                    UnitCurrency outUnit = null;

                    for(Currency currency: Currency.values()){
                        String timeNameTop = currency.getLongName();
                        String timeNameBottom = currency.getLongName();
                        if(selMeasTop.equals(timeNameTop)) {inUnit = currency.getUnit();}
                        if(selMeasBottom.equals(timeNameBottom)){outUnit = currency.getUnit();}
                    }

                    assert inUnit != null;
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case TEMPERATURE -> {
                    double outValue;
                    UnitTemperature inUnit = null;
                    UnitTemperature outUnit = null;

                    for(Temperature temperature: Temperature.values()){
                        String timeNameTop = temperature.getLongName();
                        String timeNameBottom = temperature.getLongName();
                        if(selMeasTop.equals(timeNameTop)) {inUnit = temperature.getUnit();}
                        if(selMeasBottom.equals(timeNameBottom)){outUnit = temperature.getUnit();}
                    }

                    assert inUnit != null;
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case SELECT_A_MEASURE -> System.out.println(" * fuck this * ");
                default -> {}
            }

        } catch (NumberFormatException ex){
            System.out.println("Invalid number!!!");
            JOptionPane.showMessageDialog(null, "Invalid number!!!");
            nfBottom.setText("");
        }

    }

    //Main method
    public static void main(String[] args) {
        FlatLightLaf.setup();
        var mw = new mainWindow();
    }
}