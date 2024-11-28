import java.util.Scanner;

class CarteiraDigital {
    private double saldo;
    public CarteiraDigital() {
        saldo = 0.0;
    }
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }
}

public class Main {
    public static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Realizar Pagamento");
        System.out.println("3 - Verificar Saldo");
        System.out.println("4 - Sair");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarteiraDigital carteira = new CarteiraDigital();

        while (true) {
            menu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar ao saldo: ");
                    double valorAdicionar = scanner.nextDouble();
                    scanner.nextLine();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;

                case 2:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    scanner.nextLine();
                    carteira.realizarPagamento(valorPagamento);
                    break;

                case 3:
                    System.out.println("Seu saldo atual é: R$ " + carteira.verificarSaldo());
                    break;

                case 4:
                    System.out.println("Obrigado por usar a sua Carteira Digital!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}