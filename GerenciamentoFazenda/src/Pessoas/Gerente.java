package Pessoas;

import java.io.Serializable;

public class Gerente extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nivelAcesso;

    public Gerente(String nome, String cpf, String dataNascimento, String telefone, double salario, String nivelAcesso) {
        super(nome, cpf, dataNascimento, telefone, salario);
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String desempenharFuncao() {
        return "Gerenciando operações administrativas e equipe. Nível de acesso: " + nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}