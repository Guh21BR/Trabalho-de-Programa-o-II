
package com.trabalhodeprog;


public class MaquinadeCoxinha {
     private Integer estoque;
    
    
    public MaquinadeCoxinha(){
        estoque = 0;
        }
    
    public void abastecer(int quantidade){
        if (quantidade > 0){
           estoque += quantidade;
        }
    }
    
    public void decrementar(){
        if (estoque <=0){
        }
        else{
            estoque--;
        }
    }
    
    public void vender(int quantidade){
        if (quantidade <= 0){
    }
        else if (quantidade > estoque){
    }
        else{
        estoque -= quantidade;
    }
}

    
    public void zerar(){
        estoque = 0;
    }
         
    public Integer getEstoque(){
        return estoque;
    }
}
