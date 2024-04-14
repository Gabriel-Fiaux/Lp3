/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

/**
 *
 * @author aluno
 */
public abstract class Motor {
    private String tipo;
    private int potencia;
    private int tamanho;

    public Motor(String tipo, int potencia, int tamanho) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.tamanho = tamanho;
    }
    
    public abstract boolean testar();

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", potencia=" + potencia + ", tamanho=" + tamanho + '}';
    }
    
    
}
