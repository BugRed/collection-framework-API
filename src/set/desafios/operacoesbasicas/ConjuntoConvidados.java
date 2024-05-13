package set.desafios.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        this.conjuntoConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String name, int codigo) {
        conjuntoConvidados.add(new Convidado(name, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidado = null;
        for (Convidado c : conjuntoConvidados) {
            if (c.getCodigo() == codigoConvite) {
                convidado = c;
                break;
            }
        }
        conjuntoConvidados.remove(convidado);
    }

    public int contarConvidados() {
        return conjuntoConvidados.size();
    }


    public void exibirConvidados() {
        System.out.println(conjuntoConvidados);

    }
}


