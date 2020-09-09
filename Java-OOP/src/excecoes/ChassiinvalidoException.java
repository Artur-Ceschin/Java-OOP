package excecoes;

public class ChassiinvalidoException extends Exception{

    public ChassiinvalidoException(String chassi){
        super(String.format("Este chassi é inválido [%s]", chassi));
    }

}
