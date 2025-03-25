import javax.swing.*;

public class ContaCorrente {

    String banco;
    String titular;
    int agencia;
    //conta string devido ao traço que separa o digito
    String conta;
    double saldo;

    public ContaCorrente(String banco, String titular, int agencia, String conta, double saldo) {
        this.banco = banco;
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso! Seu saldo atual é: R$" + this.saldo);
        } else {
            JOptionPane.showMessageDialog(null, "O valor deve ser maior que Zero!");
        }
    }

    public void sacar (double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso no valor de " + valor + ". Seu saldo atual é: R$" + this.saldo);
           ;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido!");
            ;
        }
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso no valor de R$" + valor + ". Seu saldo atual é: R$" + this.saldo);
            ;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido!");
           ;
        }
    }







}
