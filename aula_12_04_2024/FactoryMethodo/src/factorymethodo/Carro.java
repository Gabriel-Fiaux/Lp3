/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

/**
 *
 * @author aluno
 */
public class Carro extends Veiculo{

    public Carro(String nome, String tipo, String cor, Motor motor) {
        super(nome, tipo, cor, motor);
    }

    

    
    
    @Override
    public boolean testar() {
        System.out.println(super.toString());
        System.out.println("Testando...");
        System.out.println("Teste ok");
        return true;
    }
    
}
