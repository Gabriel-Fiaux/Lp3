/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacejava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class SwingOla {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());

        frame.setTitle("Cadastro");

        JPanel panelNome = new JPanel(new FlowLayout());
        JLabel labelNome = new JLabel("Nome");
        JTextField tfNome = new JTextField(15);
        panelNome.add(labelNome);
        panelNome.add(tfNome);

        JPanel panelEmail = new JPanel(new FlowLayout());
        JLabel labelEmail = new JLabel("Email:");
        JTextField tfEmail = new JTextField(15);
        panelEmail.add(labelEmail);
        panelEmail.add(tfEmail);

        frame.add(panelNome);
        frame.add(panelEmail);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
