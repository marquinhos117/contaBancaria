
    public class Endereco{
        private String rua;
        private String numero;
        private String bairro;
        private String cidade;
        private String estado;
        private String cep;
        private String complemento;


        public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep){
            this.rua = rua;
            this.numero = numero;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
            this.complemento = "";

        }
        public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep, String complemento){
            this.rua = rua;
            this.numero = numero;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
            this.complemento = complemento;

        }

        public String getRua(){
            return rua;
        }
        public void setRua(String rua){
            this.rua = rua;
        }

        public String getNumero(){
            return numero;
        }
        public void setNumero(String numero){
            this.numero = numero;
        }

        public String getBairro(){
            return bairro;
        }
        public void setBairro(String bairro){
            this.bairro = bairro;
        }

        public String getCidade(){
            return cidade;
        }
        public void setCidade(String cidade){
            this.cidade = cidade;
        }

        public String getEstado(){
            return estado;
        }
        public void setEstado(String estado){
            this.estado = estado;
        }

        public String getCep(){
            return cep;
        }
        public void setCep(String cep){
            this.cep = cep;
        }

        public String getComplemento(){
            return complemento;
        }
        public void setComplemento(String complemento){
            this.complemento = complemento;
        }

        public String toString() {
            return "Rua: " + rua + ", Numero: " + numero + ", Bairro: " + bairro + ", Cidade: " + cidade + ", Estado: " + estado + ", CEP: " + cep + ", Complemento: " + complemento;
        }


    }