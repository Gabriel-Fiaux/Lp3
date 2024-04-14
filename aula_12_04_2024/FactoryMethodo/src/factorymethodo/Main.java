/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Producao p = new Producao("Dolphin",3);
        p.produzir();
        p.testar();
        
         Producao ws120 = new Producao("WS120",3);
        ws120.produzir();
        ws120.testar();
    }
    
}
