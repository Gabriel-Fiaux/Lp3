/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodo;

/**
 *
 * @author aluno
 */
public abstract class Veiculo {

    private String nome;
    private String tipo;
    private String cor;
    private Motor motor;

    public Veiculo(String nome, String tipo, String cor, Motor motor) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.motor = motor;
    }

    
    
    
    public abstract boolean testar();

    @Override
    public String toString() {
        return "Veiculo{" + "nome=" + nome + ", tipo=" + tipo + ", cor=" + cor + ", motor=" + motor + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
