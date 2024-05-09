package list.desafios.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listNumber;


    public SomaNumeros() {
        this.listNumber = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumber.add(numero);
    }

    public int calcularSoma(){
        int sum = 0;
        for (Integer i: listNumber){
            sum+=i;
        }
        return sum;
    }

    public int encontrarMaiorNumero(){
        listNumber.sort(Integer::compareTo);
        return listNumber.getLast();
    }

    public int encontrarMenorNumero(){
        listNumber.sort(Integer::compareTo);
        return listNumber.getFirst();
    }

    public void exibirNumeros(){
        System.out.println(listNumber);
    }


    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listNumber=" + listNumber +
                '}';
    }
}
