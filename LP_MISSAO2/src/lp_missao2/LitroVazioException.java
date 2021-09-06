
package lp_missao2;

public class LitroVazioException extends Exception{
    public LitroVazioException(){
        super("Impossível esvaziar!!!Litro já está vazio!");
    }
}
