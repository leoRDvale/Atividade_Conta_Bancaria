import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Você está trabalhando para um banco e precisa implementar uma conta corrente. Para isso é
        //necessário criar uma classe Conta Corrente que possui as informações básicas de uma conta e do
        //seu titular (defina pelo menos 5 atributos). Esta classe também deve conter três métodos básicos:
        //sacar, depositar e transferir.
        //Em todas operações realizadas na conta, o atributo saldo da conta não pode ser negativo! Sempre
        //valide essa informação.

        ContaCorrente minhaConta = new ContaCorrente("Nubank", "Leo", 0001, "20563883-1", 1000);

        ContaCorrente contaDestino = new ContaCorrente("Nubank", "Maria", 0001, "20563883-2", 300);


        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "****** Ben-vindo ao banco Nubank ****** \n\n Digite a opção desejada:\n 1 - Depositar \n 2 - Sacar \n 3 - Transferir \n 4 - Saldo \n 5 - Sair"));

            switch (opcao) {

                case 1:
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: "));
                    minhaConta.depositar(valorDeposito);
                    break;

                case 2:
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: "));
                    minhaConta.sacar(valorSaque);
                    break;

                case 3:
                    double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da transferência: "));
                    minhaConta.transferir(contaDestino, valorTransferencia);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Seu saldo: R$" + minhaConta.saldo + "\nSaldo da conta de destino: R$" + contaDestino.saldo);
                    break;

                case 5:
                    int confirm = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?");
                    if (confirm == JOptionPane.YES_OPTION) {
                        return;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;


            }

        }
    }
}
