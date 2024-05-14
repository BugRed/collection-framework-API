package set.desafios.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno  implements Comparable<Aluno>{
    private String name;
    private long matricula;
    private double media;

    public Aluno(String name, long matricula, double media) {
        this.name = name;
        this.matricula = matricula;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", matricula=" + matricula +
                ", nota=" + media +
                '}';
    }

    @Override
    public int compareTo(Aluno o) {
        return name.compareToIgnoreCase(o.getName());
    }
}

class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
