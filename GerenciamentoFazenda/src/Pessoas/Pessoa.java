package Pessoas;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private double salario;

    public Pessoa(String nome, String cpf, String dataNascimento, String telefone, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.salario = salario;
    }

    public abstract String desempenharFuncao();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

}