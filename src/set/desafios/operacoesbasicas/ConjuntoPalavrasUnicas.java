package set.desafios.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!conjuntoPalavras.isEmpty()){
            conjuntoPalavras.removeIf(p -> p.equalsIgnoreCase(palavra));
        }else{
            System.out.println("Conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        if(!conjuntoPalavras.isEmpty()){
            return conjuntoPalavras.contains(palavra);
        }else{
            return false;
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavras);
    }
}
