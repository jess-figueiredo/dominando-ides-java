package model;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    //criar construtor


    public Gato() {}

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }
    //getters
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
