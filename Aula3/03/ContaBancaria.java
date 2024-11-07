
public class ContaBancaria {
    private static double saldo;
    
        public ContaBancaria(double saldo){
            this.saldo = saldo;
        }
    
        public static void realizarTransacao(double valor) throws TransacaoInvalidaException{
            if (valor <= 0 ) {
                throw new TransacaoInvalidaException("Valor da transação invalido "+valor);
            }
            if (valor > saldo) {
                throw new TransacaoInvalidaException("Saldo insuficente para realizar a transação:", new SaldoInsuficienteException());
                
            }
    
            saldo -= valor;
        System.out.println("Transação de R$: "+valor+ " realizado com sucesso.");
        System.out.println("Saldo atual: R$:"+saldo);
    }
}

