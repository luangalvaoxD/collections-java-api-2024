package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Criando um atributo
    private List<Tarefa> tarefaList;

    // Criando uma instância da Lista de Tarefa
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Adicionando uma tarefa a lista
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Removendo uma ou todas as tarefas iguais da lista
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Obtendo o numero total da lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Obtendo as descricoes da lista
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

      //  System.out.println("O numero total de elementos na lista é : " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 5");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de elementos na lista é : " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O numero total de elementos na lista é : " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}