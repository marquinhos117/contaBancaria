import java.util.Scanner;
import java.util.ArrayList;
    public class Main {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

            while (true) {
                System.out.println("1 - Cadastrar conta\n2 - Exibir extrato\n3 - Sacar\n4 - Depositar\n5 - Transferir");


                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                         Pessoa cliente = Exibir.exibirCadastro();
                         Conta novaConta = Exibir.exibirConta(cliente);
                         contas.add(novaConta);
                         System.out.println("Cadastrado");
                    break;
                        break;
                    case 2:
                        // Cadastrar Gerente
                        break;
                    case 3:
                        // Cadastrar Conta
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

                scanner.close();
            }

        }
    }