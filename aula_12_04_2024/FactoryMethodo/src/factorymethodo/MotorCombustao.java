/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

/**
 *
 * @author aluno
 */
public class MotorCombustao extends Motor {

    public MotorCombustao(String tipo, int potencia, int tamanho) {
        super(tipo, potencia, tamanho);
    }

    
    
    @Override
    public boolean testar() {
        System.out.println("Testando Motor a Combustão" + super.toString());
        return true;
    }
    
}
