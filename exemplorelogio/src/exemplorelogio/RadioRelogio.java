/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplorelogio;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gabriel Fiaux
 */
public class RadioRelogio implements Radio, Relogio {

    private boolean ligado;

    @Override
    public void liga() {
        if (ligado == false) {
            System.out.println("Ligando radio");
            ligado = true;
        } else {
            System.out.println("Radio já está ligado");
        }
    }

    @Override
    public void desliga() {
        if (ligado == true) {
            System.out.println("Desligando Radio...");
            ligado = false;
        } else {
            System.out.println("Radio já está ligado");
        }
    }

    @Override
    public void trocaEstacao(int frequencia) {
        if (ligado == false) {
            System.out.println("Radio desligado");
        } else {
            System.out.println("Alterando estações para " + frequencia);
        }

    }

    @Override
    public String getHoras() {
        if (ligado == false) {
            System.out.println("Radio desligado");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            return (sdf.format(new Date()));
        }
        return null;

    }

    public void getHorasSout() {
        System.out.println(getHoras());
    }
}
