package list.desafios.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listInt;

    public OrdenacaoNumeros() {
        this.listInt = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listInt.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.listInt);
        if (!listInt.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.listInt);
        if (!listInt.isEmpty()) {
            listInt.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listInt.isEmpty()) {
            System.out.println(this.listInt);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
