package set.desafios.pesquisa;

public class Tarefa {
    private String descricao;
    private boolean conclusao;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.conclusao = false;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", conclusao=" + conclusao +
                '}';
    }
}
