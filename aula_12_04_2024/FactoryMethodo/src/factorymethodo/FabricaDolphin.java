/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

/**
 *
 * @author aluno
 */
public class FabricaDolphin extends FabricaVeiculos{

    @Override
    public Veiculo cirarVeiculo() {
        
       Motor motor = new MotorEletrico("Eletrico Ca", 75, 20);
       return new Carro("Dolphin", "ELetrico", "Banco", motor);
        
    }
    
}
