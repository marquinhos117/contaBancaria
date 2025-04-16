    public class Conta{
        private String numero;
        private String agencia;
        private double saldo;
        private String dataAbertura;
        private Pessoa cliente;
        private Pessoa gerente;


        public Conta(String numero, String agencia, double saldo, String dataAbertura, Pessoa cliente){
            this.numero = numero;
            this.agencia = agencia;
            this.saldo = 0.0;
            this.dataAbertura = dataAbertura;
            this.cliente = cliente;

        }



        public boolean sacar(double valor){
            if(valor > 0 && valor <= saldo){
                saldo = saldo - valor;
                return true;
            }else{
                return false;
            }
        }

        public boolean depositar(double valor){
            if(valor > 0){
                saldo = saldo + valor;
                 return true;
             }else{
                 return false;
             }
         }


        public boolean transferir(double valor, Conta contaDestino){
            if(valor > 0 && valor <= saldo){
                saldo = saldo - valor;
                contaDestino.depositar(valor);
                return true;
            }else{
                return false;
            }
        }































        public String getNumero(){
            return numero;
        }
        public void setNumero(String numero){
            this.numero = numero;
        }

        public String getAgencia(){
            return agencia;
        }
        public void setAgencia(String agencia){
            this.agencia = agencia;
        }

        public double getSaldo(){
            return saldo;
        }
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }

        public String getDataAbertura(){
            return dataAbertura;
        }
        public void setDataAbertura(String dataAbertura){
            this.dataAbertura = dataAbertura;
        }

        public Pessoa getCliente(){
            return cliente;
        }
        public void setCliente(Pessoa cliente){
            this.cliente = cliente;
        }

        public Pessoa getGerente(){
            return gerente;
        }
        public void setGerente(Pessoa gerente){
            this.gerente = gerente;
        }






    }