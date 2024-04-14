/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplorelogio;

/**
 *
 * @author Gabriel Fiaux
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio rr = new RadioRelogio();
        rr.liga();
        rr.desliga();
        rr.liga();
        RadioRelogio rr2d2 = new RadioRelogio();
        rr2d2.liga();
        rr2d2.desliga();
        rr2d2.getHorasSout();

    }

}
