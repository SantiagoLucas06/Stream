import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", 'F'));
        pessoas.add(new Pessoa("João", 'M'));
        pessoas.add(new Pessoa("Ana", 'F'));
        pessoas.add(new Pessoa("Pedro", 'M'));


        List<Pessoa> mulheres = new ArrayList<>();
        pessoas.forEach(pessoa -> {
            if (pessoa.getSexo() == 'F') {
                mulheres.add(pessoa);
            }
        });


        System.out.println("Mulheres:");
        mulheres.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}

class Pessoa {
    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }
}