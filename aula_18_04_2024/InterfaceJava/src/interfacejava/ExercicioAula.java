/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacejava;

import java.awt.FlowLayout;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class ExercicioAula {

    public static void main(String[] args) {
        
        //declaração e configuração do frame
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());
        
        //declaração panel nome e seus componentes
        JPanel panelName = new JPanel(new FlowLayout());
        JLabel labelName = new JLabel("Name");
        JTextField tfName = new JTextField(18);
        
        panelName.add(labelName);
        panelName.add(tfName);
        
        //declaração panel gender e seus componentes
        JPanel panelGender = new JPanel(new FlowLayout());
        JLabel labelGender = new JLabel("Gender");
        JRadioButton jrGenderM = new JRadioButton("Male");
        JRadioButton jrGenderF = new JRadioButton("Famale");
        
        panelGender.add(labelGender);
        panelGender.add(jrGenderM);
        panelGender.add(jrGenderF);
        
        //declaração panel interest
        JPanel panelInterest = new JPanel(new FlowLayout());
        JLabel labelInterest = new JLabel("Interest:");
        JCheckBox jcMusic = new JCheckBox("Music");
        JCheckBox jcSwimming = new JCheckBox("Swimming");
        
        panelInterest.add(labelInterest);
        panelInterest.add(jcMusic);
        panelInterest.add(jcSwimming);
        
        //declaração do panel favorite place
       
        JPanel panelFPlace = new JPanel(new FlowLayout());
        JLabel labelFPlace = new JLabel("Favourite Place:");
         String items[] = {"Icaraíma","Bangladesh","Umuarama"};
        JComboBox cboxFPlace = new JComboBox(items);
        panelFPlace.add(labelFPlace);
        panelFPlace.add(cboxFPlace);
        
        
        //declaração do panel details
        JPanel panelDetails = new JPanel(new FlowLayout());
        JLabel labelDetails = new JLabel("Details:");
        JTextArea txtaDetails = new JTextArea(10, 20);
        
        panelDetails.add(labelDetails);
        panelDetails.add(txtaDetails);
        
        //adiciona panels ao frame
        frame.add(panelName);
        frame.add(panelGender);
        frame.add(panelInterest);
        frame.add(panelFPlace);
        frame.add(panelDetails);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
