package Animais;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    //atributos
    private String id;
    private double peso;
    private int idadeMeses;

    //construtores
    public Animal(String id, double peso, int idadeMeses) {
        this.id = id;
        this.peso = peso;
        this.idadeMeses = idadeMeses;
    }

    //metodos
    //Apesar de parecer meio nada a ver, a gente ja fez o emitirSom() em dos trabalhos de POO anteriormente, entao
    //acho que vale a pena deixar. - Alex
    public abstract String emitirSom();
    public abstract double calcularCustoAlimentacaoDiario();

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public int getIdadeMeses(){
        return idadeMeses;
    }

    public void setIdadeMeses(int idadeMeses){
        this.idadeMeses = idadeMeses;
    }
}