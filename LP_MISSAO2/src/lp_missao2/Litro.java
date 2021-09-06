
package lp_missao2;

public class Litro{
    
    private boolean cheio;
    private final int capacidade;
    private int litros;
            
    public Litro(int capacidade){
        this.capacidade = capacidade;
        cheio = false;
        litros = 0;
    }
    
    public void encher(int qtdLitros) throws LitroCheioException{
        try{
            if(litros < capacidade){
                if(qtdLitros + litros <= capacidade){
                    litros += qtdLitros;
                }else{
                    litros = capacidade;
                }
            }else{
                throw new LitroCheioException();
            }
        }catch(LitroCheioException ex){
            System.out.println(ex.getMessage());
        }
        
        if(litros == capacidade){
            cheio = true;
        }
    }
    
    public void esvaziar(int esvaziar) throws LitroVazioException{
        try{
            if(litros > 0){
                if(litros - esvaziar > 0){
                    litros -= esvaziar;
                }else{
                    litros = 0;
                }
            }else{
                throw new LitroVazioException();
            }
        }catch(LitroVazioException ex){
            System.out.println(ex.getMessage());
        }
  
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    public boolean getCheio(){
        return cheio;
    }
    public void setCheio(boolean cheio){
        this.cheio = cheio; 
    }
    public int getLitros(){
        return litros;
    }
    public void setLitros(int litros){
        this.litros = litros;
    }
    
}
