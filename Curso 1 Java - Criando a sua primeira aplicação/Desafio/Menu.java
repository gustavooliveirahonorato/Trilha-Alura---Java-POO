public class Menu {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("\nBem-vindo ao Menu");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Sair");
        System.out.println("\n**********************");
        while (true) {
            System.out.print("Digite o número da opção desejada: ");
            int opcao = new java.util.Scanner(System.in).nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu consultar saldo.");
                    break;
                case 2:
                    System.out.println("Você escolheu depositar.");
                    break;
                case 3:
                    System.out.println("Você escolheu sacar.");
                    break;
                case 4:
                    System.out.println("Saindo do menu. Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
