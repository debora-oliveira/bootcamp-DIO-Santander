package collections_course;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qtd){
        carrinho.add(new Item(nome, preco, qtd));
    }

    public void removerItem(String nome){
        List<Item>  carrinhoRemove = new ArrayList<>();
        if(!carrinho.isEmpty()){
            for(Item c : carrinho){
                if(c.getNome().equals(nome)){
                    carrinhoRemove.add(c);
                }
            }
            carrinho.removeAll(carrinhoRemove);
        }else {
            System.out.println("Carrinho está vazio!");
        }

    }

    public int obterTotalItens(){
        return carrinho.size();
    }

    public void obterDescricaoItens(){
        if(!carrinho.isEmpty()){
            System.out.println(carrinho);
        }else {
            System.out.println("Carrinho está vazio!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Leite", 5.50, 2);
        carrinho.adicionarItem("Arroz", 22, 1);
        carrinho.adicionarItem("Feijão", 6.75, 3);
        carrinho.adicionarItem("Café", 18, 2);

        System.out.println("Total de itens adicionados no carrinho "+ carrinho.obterTotalItens());

        carrinho.obterDescricaoItens();

    }

}

