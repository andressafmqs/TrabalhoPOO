package model;

public class Suino extends Animal {

    public Suino(String id, double peso, int idadeMeses) {
        super(id, peso, idadeMeses);
    }

    @Override
    public String emitirSom() {
        return "Oinc!";
    }

    @Override
    public double calcularCustoAlimentacao() {
        return 3.80;
    }
}