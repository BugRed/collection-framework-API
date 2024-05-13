package set.desafios.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        conjuntoTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!conjuntoTarefas.isEmpty()) {
            conjuntoTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirTarefas() {
        if(!conjuntoTarefas.isEmpty()) {
            System.out.println(conjuntoTarefas);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefas() {
        return conjuntoTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> conjuntoAux = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if (t.isConclusao()) {
                conjuntoAux.add(t);
            }
        }
        return conjuntoAux;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> conjuntoAux = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if (!t.isConclusao()) {
                conjuntoAux.add(t);
            }
        }
        return conjuntoAux;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : conjuntoTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isConclusao()) {
                t.setConclusao(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : conjuntoTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.isConclusao()) {
                tarefaParaMarcarComoPendente.setConclusao(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if (conjuntoTarefas.isEmpty()) {
            System.out.println("O conjunto está vazio!");
        } else {
            conjuntoTarefas.clear();
        }
    }
}
