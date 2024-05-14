package set.desafios.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> conjuntoAluno;

    public GerenciadorAlunos() {
        this.conjuntoAluno = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        conjuntoAluno.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoAux = null;
        if (!conjuntoAluno.isEmpty()) {
            for (Aluno a : conjuntoAluno) {
                if (a.getMatricula() == matricula) {
                    alunoAux = a;
                    break;
                }
            }
            conjuntoAluno.remove(alunoAux);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        if (alunoAux == null) {
            System.out.println("Matricula não encontrada!");
        }
    }


    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(conjuntoAluno);
        if (!conjuntoAluno.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!conjuntoAluno.isEmpty()) {
            alunosPorNota.addAll(conjuntoAluno);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    @Override
    public String toString() {
        return "GerenciadorAlunos{" +
                "conjuntoAluno=" + conjuntoAluno +
                '}';
    }
}
