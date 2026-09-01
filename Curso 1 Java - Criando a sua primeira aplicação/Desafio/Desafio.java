import java.util.Scanner;

public class Desafio {
    public static void main(String [] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo =  1000.00;
          int opcao = 0;

        System.out.println("**********************");
        System.out.println("\nNome do cliente : " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo); 
        System.out.println("\n**********************");

        String menu = """
                ** Digite sua opçao **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair do Menu
                """;
                
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor a ser transferido?: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada com sucesso. Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor a ser recebido?: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Valor recebido com sucesso. Saldo disponivel: " + saldo);
            } else if (opcao == 4) {
                System.out.println("Opção inválida.");
            }
        }
    }
 }