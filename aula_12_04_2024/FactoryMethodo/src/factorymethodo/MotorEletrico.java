/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

/**
 *
 * @author aluno
 */
public class MotorEletrico extends Motor {

    public MotorEletrico(String tipo, int potencia, int tamanho) {
        super(tipo, potencia, tamanho);
    }

    @Override
    public boolean testar() {

   System.out.println("Testando Motor a Eletrico" + super.toString());
        return true;
    }
    
}
