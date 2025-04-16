

    public class Pessoa {
        private String nome;
        private String cpf;
        private String dataNasc;
        private Endereco endereco;
        private String telefone;
        private String telefoneFixo;
        private String sexo;


        public Pessoa(String nome, String cpf, String dataNasc, Endereco endereco, String telefone, String telefoneFixo, String sexo){
            this.nome = nome;
            this.cpf = cpf;
            this.dataNasc = dataNasc;
            this.endereco = endereco;
            this.telefone = telefone;
            this.telefone = telefoneFixo;
            this.sexo = sexo;
        }


        public Pessoa(String nome, String cpf, String dataNasc, Endereco endereco, String telefone, String sexo){
            this.nome = nome;
            this.cpf = cpf;
            this.dataNasc = dataNasc;
            this.endereco = endereco;
            this.telefone = telefone;
            this.telefone = "";
            this.sexo = sexo;
        }


        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

        public String getCpf(){
            return cpf;
        }
        public void setCpf(String cpf){
            this.cpf = cpf;
        }

        public String getDataNasc(){
            return dataNasc;
        }
        public void setDataNasc(String dataNasc){
            this.dataNasc = dataNasc;
        }

        public Endereco getEndereco(){
            return endereco;
        }
        public void setEndereco(Endereco endereco){
            this.endereco = endereco;
        }

        public String getTelefone(){
            return telefone;
        }
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }

        public String getTelefoneFixo(){
            return telefoneFixo;
        }
        public void setTelefoneFixo(String telefoneFixo){
            this.telefoneFixo = telefoneFixo;
        }

        public String getSexo(){
            return sexo;
        }
        public void setSexo(String sexo){
            this.sexo = sexo;
        }
    }