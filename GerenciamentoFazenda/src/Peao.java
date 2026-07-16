public class Peao extends Pessoa {

    private String setor;

    public Peao(String nome, String cpf, String dataNascimento, String telefone, double salario, String setor) {

        super(nome, cpf, dataNascimento, telefone, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String desempenharFuncao() {
        return "Realizando tarefas de campo no setor: " + setor;
    }
}