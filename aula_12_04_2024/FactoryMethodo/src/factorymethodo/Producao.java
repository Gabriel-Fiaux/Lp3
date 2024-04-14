/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author aluno
 */
public class Producao {

    private FabricaVeiculos fabrica;
    private String producaoDia = "Dolphin"; // "ws120
    private int qtde = 10;
    private Veiculo[] veiculosProduzidos = new Veiculo[qtde];

    
    public Producao(String producaoDia, int qtde){
    this.producaoDia = producaoDia;
    this.qtde = qtde;
    
    }
    
    public void produzir() throws InterruptedException {
        if (producaoDia == "Dolphin") {
            fabrica = new FabricaDolphin();
        } else {
            if (producaoDia == "WS120") {
                fabrica = new FabricaMotoWS120();
            }
        }
        System.out.println("Iniciando a produção...");
        // Iniciar a produção
        for (int i = 0; i < qtde; i++) {
            veiculosProduzidos[i] = fabrica.cirarVeiculo();
            System.out.println("Produzindo " + veiculosProduzidos[1]);
            TimeUnit.SECONDS.sleep(1);
        }
    }
    public void testar() throws InterruptedException{
        System.out.println("Iniciando teste...");
        // iniciar testes
        for (int i = 0; i < qtde; i++){
            System.out.println("\nTestando...");
            veiculosProduzidos[i].testar();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
