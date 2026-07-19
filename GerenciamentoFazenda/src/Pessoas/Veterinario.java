package Pessoas;

import java.io.Serializable;

public class Veterinario extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private String crmv; //registro do conselho reginonal de medicina veterinaria

    public Veterinario (String nome, String cpf, String dataNascimento, String telefone, double salario, String crmv) {
        super(nome, cpf, dataNascimento, telefone, salario);
        this.crmv = crmv;
    }

    public String getCRMV() {
        return crmv;
    }
    public void setRegistro(String crmv) {
        this.crmv = crmv;
    }
    public String desempenharFuncao () {
        return "Realizando exames clínicos, vacinação e diagnóstico animal. Registro CRMV: " +crmv;

    }

}
