package br.edu.ifsul.teste1.control;

import br.edu.ifsul.teste1.model.Carro;
import br.edu.ifsul.teste1.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.setAno(2020);
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(22);
        pessoa.setNome("Matheus");
        pessoa.aniversario();
        System.out.println(car);
        System.out.println(pessoa);
        Pessoa pessoa1 = new Pessoa("Nunes");
        System.out.println(pessoa1);
    }
}
