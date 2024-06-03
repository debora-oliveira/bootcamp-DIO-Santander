package collections_course.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos(){
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }else {
            System.out.println("Agenda de contatos vazia");
        }
    }

    public void exibirContatos(){
        if (!agendaContatos.isEmpty()){
            System.out.println(agendaContatos);
        }else {
            System.out.println("Agenda de contatos vazia");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatos.isEmpty()){
            numeroPorNome = agendaContatos.get(nome);
            if(numeroPorNome == null){
                System.out.println("Contato não encontrado");
            }
        }else {
            System.out.println("Agenda de contatos vazia");
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Claudia", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 2222);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();


        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();


        String nomePesquisa = "Claudia";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome(nomePesquisa);
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }

}

