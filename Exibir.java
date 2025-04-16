import java.util.Scanner;

public class Exibir {

    private static final Scanner scanner = new Scanner(System.in);


    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
    public static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        return Double.parseDouble(scanner.nextLine());
    }


    public static Pessoa exibirCadastro() {
        System.out.println("---Cadastro---");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        String dataNasc = lerString("Data de nascimento: ");
        String telefone = lerString("Telefone: ");
        String telefoneFixo = lerString("Telefone fixo: ");
        String sexo = lerString("Sexo: ");
        System.out.println("---Endereço---");
        String rua = lerString("Rua: ");
        String numero = lerString("Número: ");
        String bairro = lerString("Bairro: ");
        String cidade = lerString("Cidade: ");
        String estado = lerString("Estado: ");
        String cep = lerString("CEP: ");

        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
        return new Pessoa(nome, cpf, dataNasc, endereco, telefone, telefoneFixo, sexo);
    }


    public static void exibirExtrato(Conta conta) {
        System.out.println("---Extrato da Conta--");
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Cliente: " + conta.getCliente().getNome());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }

}
