package com.ryunezm.apps.javacurrconv.view;

import com.formdev.flatlaf.*;
import com.ryunezm.apps.javacurrconv.model.*;
import com.ryunezm.apps.javacurrconv.model.enums.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
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
        converter_Label.setText("   CONVERTER   ");
        converter_Label.setBorder(BorderFactory.createBevelBorder(
                BevelBorder.RAISED,
                Color.LIGHT_GRAY,
                Color.LIGHT_GRAY));
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

        for (_Measure_ measure : _Measure_.values()) {
            listMeasures_ComboBox.addItem(measure.getName());
        }
    }

    public void updateComboBox(){
        listMeasures_ComboBox.addActionListener(e -> {
            String selectedMeasure = (String) listMeasures_ComboBox.getItemAt(listMeasures_ComboBox.getSelectedIndex());

            if (selectedMeasure!=null){
                if (listMeasures_ComboBox.getItemCount()== _Measure_.values().length){
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
            _Measure_ selMeasure = _Measure_.valueOf(selectedMeasure.toUpperCase());

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
        showExtendedMeasuresCheckBox.setEnabled(_Measure_.CURRENCY.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        listBottom_ComboBox.removeAllItems();
        listTop_ComboBox.removeAllItems();

        for (Currency currency : Currency.values()) {
            if(extendedMeasure || currency.isCommonness()){
                listTop_ComboBox.addItem(currency.getLongName());
                listBottom_ComboBox.addItem(currency.getLongName());
            }
        }
    }

    private void updateComboBoxForLengthMeasure(Boolean extendedMeasure){
        showExtendedMeasuresCheckBox.setEnabled(_Measure_.LENGTH.isExtended());
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
        showExtendedMeasuresCheckBox.setEnabled(_Measure_.MASS.isExtended());
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
        showExtendedMeasuresCheckBox.setEnabled(_Measure_.TEMPERATURE.isExtended());
        nfBottom.setText("");
        nfTop.setText("");
        showExtendedMeasuresCheckBox.setEnabled(_Measure_.TEMPERATURE.isExtended());
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
        showExtendedMeasuresCheckBox.setEnabled(_Measure_.TIME.isExtended());
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
        try{
            double entryValue = Double.parseDouble(nfTop.getText());

            String selMeasure = Objects.requireNonNull(listMeasures_ComboBox.getSelectedItem()).toString();
            String selMeasTop = Objects.requireNonNull(listTop_ComboBox.getSelectedItem()).toString();
            String selMeasBottom = Objects.requireNonNull(listBottom_ComboBox.getSelectedItem()).toString();
            _Measure_ selMeasureEnum = _Measure_.valueOf(selMeasure.toUpperCase());

            switch (selMeasureEnum){
                case MASS -> {
                    double outValue;
                    UnitMass inUnit = Mass.getByLongName(selMeasTop, Mass.values()).getUnit();
                    UnitMass outUnit = Mass.getByLongName(selMeasBottom, Mass.values()).getUnit();
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case TIME -> {
                    double outValue;
                    UnitTime inUnit = Time.getByLongName(selMeasTop, Time.values()).getUnit();
                    UnitTime outUnit = Time.getByLongName(selMeasBottom, Time.values()).getUnit();
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case LENGTH -> {
                    double outValue;
                    UnitLength inUnit = Length.getByLongName(selMeasTop, Length.values()).getUnit();
                    UnitLength outUnit = Length.getByLongName(selMeasBottom, Length.values()).getUnit();
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case CURRENCY -> {
                    double outValue;
                    UnitCurrency inUnit = Currency.getByLongName(selMeasTop, Currency.values()).getUnit();
                    UnitCurrency outUnit = Currency.getByLongName(selMeasBottom, Currency.values()).getUnit();
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case TEMPERATURE -> {
                    double outValue;
                    UnitTemperature inUnit = Temperature.getByLongName(selMeasTop, Temperature.values()).getUnit();
                    UnitTemperature outUnit = Temperature.getByLongName(selMeasBottom, Temperature.values()).getUnit();
                    outValue = inUnit.Convert(entryValue, outUnit);
                    nfBottom.setText(String.valueOf(outValue));
                }
                case SELECT_A_MEASURE -> System.out.println(" * nothing here * ");
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
        new mainWindow();
    }
}