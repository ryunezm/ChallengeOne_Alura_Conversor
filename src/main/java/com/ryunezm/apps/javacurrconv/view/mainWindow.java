package com.ryunezm.apps.javacurrconv.view;

import com.formdev.flatlaf.*;
import com.ryunezm.apps.javacurrconv.model.enums.Currency;
import com.ryunezm.apps.javacurrconv.model.enums.Length;
import com.ryunezm.apps.javacurrconv.model.enums.Measure;
import com.ryunezm.apps.javacurrconv.model.enums.Mass;
import com.ryunezm.apps.javacurrconv.model.enums.Temperature;
import com.ryunezm.apps.javacurrconv.model.enums.Time;
import javax.swing.*;
import java.util.Objects;

public class mainWindow extends JFrame {

    private JComboBox<Object> listTop_ComboBox;
    private JComboBox<Object> listBottom_ComboBox;
    private JTextField nfTop;
    private JTextField nfBottom;
    private JCheckBox showExtendedMeasuresCheckBox;
    private JLabel converter_Label;
    private JLabel lblAuthorRyunezm;
    private JComboBox<Measure> listMeasures_ComboBox;
    private JPanel mainPanel;

    public mainWindow(){
        setTitle("Converter");
        setSize(600, 250);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //listMeasures_ComboBox.addItem("Select a measure");
        for (Measure measure : Measure.values()) {
            listMeasures_ComboBox.addItem(measure);
        }

        listMeasures_ComboBox.addActionListener(e -> {
            if (listMeasures_ComboBox.getSelectedIndex()!=0 && listMeasures_ComboBox.getItemCount()==Measure.values().length){
                listMeasures_ComboBox.removeItemAt(0);
            }

            switch ((Measure) Objects.requireNonNull(listMeasures_ComboBox.getSelectedItem())) {
                case Currency -> {
                    listBottom_ComboBox.removeAllItems();
                    listTop_ComboBox.removeAllItems();
                    for (Currency currency : Currency.values()) {
                        listTop_ComboBox.addItem(currency.getName() + " (" + currency.getSymbol() + ")");
                        listBottom_ComboBox.addItem(currency.getName() + " (" + currency.getSymbol() + ")");
                    }
                }
                case Length -> {
                    listBottom_ComboBox.removeAllItems();
                    listTop_ComboBox.removeAllItems();
                    for (Length length : Length.values()) {
                        listTop_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
                        listBottom_ComboBox.addItem(length.getName() + " (" + length.getSymbol() + ")");
                    }
                }
                case Mass -> {
                    listBottom_ComboBox.removeAllItems();
                    listTop_ComboBox.removeAllItems();
                    for (Mass mass : Mass.values()) {
                        listTop_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
                        listBottom_ComboBox.addItem(mass.getName() + " (" + mass.getSymbol() + ")");
                    }
                }
                case Temperature -> {
                    listBottom_ComboBox.removeAllItems();
                    listTop_ComboBox.removeAllItems();
                    for (Temperature temperature : Temperature.values()) {
                        listTop_ComboBox.addItem(temperature.getName() + " (" + temperature.getSymbol() + ")");
                        listBottom_ComboBox.addItem(temperature.getName() + " (" + temperature.getSymbol() + ")");
                    }
                }
                case Time -> {
                    listBottom_ComboBox.removeAllItems();
                    listTop_ComboBox.removeAllItems();
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
        mainWindow mw = new mainWindow();
    }
}


