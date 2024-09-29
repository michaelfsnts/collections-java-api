package set.Pesquisa;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean tarefaFeita;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.tarefaFeita = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return tarefaFeita;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTarefaFeita(boolean tarefaFeita) {
        this.tarefaFeita = tarefaFeita;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + tarefaFeita +
                '}';
    }
}
