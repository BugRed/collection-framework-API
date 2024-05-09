package list.desafios.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livros> listLivros;
    private Livros livro;

    public CatalogoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        listLivros.add(new Livros(titulo, autor, anoDePublicacao));
    }

    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livros l : listLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> auxList = new ArrayList<>();
        if(!listLivros.isEmpty()){
            for (Livros l : listLivros) {
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
                    auxList.add(l);
                }
            }
            return auxList;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livros pesquisarPorTitulo(String titulo){
        Livros livrosPorTitulo = null;
        if (!listLivros.isEmpty()) {
            for (Livros l : listLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                }
            }
            return livrosPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
