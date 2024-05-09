package list.desafios.operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String name, double price, int quantity) {
        carrinhoDeCompras.add(new Item(name, price, quantity));
    }

    public void removerItem(String name) {
        if (!carrinhoDeCompras.isEmpty()) {
            carrinhoDeCompras.removeIf(i -> Objects.equals(i.getName(), name));
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double sum = 0;
        double aux;
        for (Item item : carrinhoDeCompras) {
            aux = item.getPrice() * item.getQuantity();
            sum += aux;
        }
        return sum;
    }

    public void exibirItens() {
        if (!carrinhoDeCompras.isEmpty()) {
            System.out.println(carrinhoDeCompras);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
