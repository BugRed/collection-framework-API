package set.desafios.ordenacao;

import list.desafios.ordenacao.Pessoa;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long cod;
    private String name;
    private double price;
    private int quantity;

    public Produto(long cod, String name, double price, int quantity) {
        this.cod = cod;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCod());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", cod=" + cod +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return name.compareToIgnoreCase(p.getName());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
