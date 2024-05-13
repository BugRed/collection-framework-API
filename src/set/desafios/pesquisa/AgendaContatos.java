package set.desafios.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int fone){
        agendaContatos.add(new Contato(nome, fone));
    }

    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisaPorNome(String name){
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!agendaContatos.isEmpty()){
            for (Contato c : agendaContatos){
                if(c.getNome().startsWith(name)){
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarContato(String name, int fone){
        Contato contatoAtualizado = null;
        if(!agendaContatos.isEmpty()){
            for (Contato c : agendaContatos){
                if(c.getNome().equalsIgnoreCase(name)){
                    c.setFone(fone);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}
