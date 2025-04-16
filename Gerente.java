
    public class Gerente extends Pessoa{

        public Gerente(String nome, String cpf, String dataNasc, Endereco endereco, String telefone, String telefoneFixo, String sexo){
            super(nome, cpf, dataNasc, endereco, telefone, telefoneFixo, sexo);
        }
        public Gerente(String nome, String cpf, String dataNasc, Endereco endereco, String telefone, String sexo){
            super(nome, cpf, dataNasc, endereco, telefone, sexo);
        }


    }