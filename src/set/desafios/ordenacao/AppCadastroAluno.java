package set.desafios.ordenacao;

public class AppCadastroAluno {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.toString());

        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.toString());

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
