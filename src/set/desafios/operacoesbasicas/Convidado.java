package set.desafios.operacoesbasicas;

import java.util.Objects;

public class Convidado {
    private String name;
    private int codigo;

    public Convidado(String name, int codigo) {
        this.name = name;
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }


    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
