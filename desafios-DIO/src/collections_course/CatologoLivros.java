package collections_course;

import java.util.ArrayList;
import java.util.List;

public class CatologoLivros {
    private List<Livro> catologoLivros;

    public CatologoLivros() {
        this.catologoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catologoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catologoLivros.isEmpty()){
            for (Livro l : catologoLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorPeriodo(int anoInicial, int anoFinal){
        List<Livro> livrosPorPeriodo = new ArrayList<>();
        if(!catologoLivros.isEmpty()){
            for (Livro l: catologoLivros){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorPeriodo.add(l);
                }
            }
        }
        return  livrosPorPeriodo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!catologoLivros.isEmpty()){
            for (Livro l : catologoLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatologoLivros catologoDeLivros = new CatologoLivros();
        catologoDeLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catologoDeLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catologoDeLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catologoDeLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catologoDeLivros.adicionarLivro("Livro 5", "Autor 5", 2024);

        System.out.println(catologoDeLivros.pesquisarPorPeriodo(2020,2022));

        System.out.println(catologoDeLivros.pesquisaPorAutor("Autor 2"));

        System.out.println(catologoDeLivros.pesquisarPorTitulo("Livro 3"));
    }
}
