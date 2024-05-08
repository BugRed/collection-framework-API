package list.desafios.operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if (!listaDeTarefas.isEmpty()){
            listaDeTarefas.removeIf(t -> Objects.equals(t.getDescricao(), descricao));
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoestarefas(){
        if(!listaDeTarefas.isEmpty()){
            System.out.println(listaDeTarefas);
        }else{
            System.out.println("A lista está vazia!");
        }

    }
}
