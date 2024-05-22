package collections_course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoasList);
        if(!pessoasList.isEmpty()){
            Collections.sort(pessoaPorIdade);
            return pessoaPorIdade;
        }else {
            throw  new RuntimeException("Lista vazia");
        }
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoasList);
        if(!pessoasList.isEmpty()){
            Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
            return pessoaPorAltura;
        }else {
            throw new RuntimeException("Lista vazia");
        }
    }



    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Lisa", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Joao", 32, 1.80);
        ordenacaoPessoas.adicionarPessoa("Maria", 28, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 70, 1.56);

        System.out.println(ordenacaoPessoas.pessoasList);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}