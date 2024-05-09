package list.desafios.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String name, int idade, double altura){
        listPessoas.add(new Pessoa(name, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listPorIdade = new ArrayList<>(listPessoas);
        if(!listPessoas.isEmpty()){
            Collections.sort(listPorIdade);
            return listPorIdade;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listPorAltura = new ArrayList<>(listPessoas);
        if(!listPessoas.isEmpty()){
            Collections.sort(listPorAltura, new ComparadorPorAltura());
            return listPorAltura;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "listPessoas=" + listPessoas +
                '}';
    }
}
