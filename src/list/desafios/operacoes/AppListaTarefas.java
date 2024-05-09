package list.desafios.operacoes;

public class AppListaTarefas {
    public static void main(String[] args) {

        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoestarefas();

        listaTarefa.removerTarefa("Trabalhar");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoestarefas();

        listaTarefa.removerTarefa("Estudar para o exame");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}
