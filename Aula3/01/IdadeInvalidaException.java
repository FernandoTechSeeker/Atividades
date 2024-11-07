
public class IdadeInvalidaException extends Exception{

    public IdadeInvalidaException(){
        super("Idade não pode ser negativa. ");
    }
    
    public IdadeInvalidaException(String mensagem){
        super(mensagem);
    }

    public IdadeInvalidaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
