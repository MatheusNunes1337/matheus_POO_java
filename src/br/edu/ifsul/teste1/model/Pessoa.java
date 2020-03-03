package br.edu.ifsul.teste1.model;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {

    }

    public void aniversario() {
        this.idade++;
    }

    //construtor padrão ou vazio

    //sobrecarga de métodos. Pois já existe o método pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
