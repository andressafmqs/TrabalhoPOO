package Animais;

public class Suino extends Animal {

    public Suino(String id, double peso, int idadeMeses) {
        super(id, peso, idadeMeses);
    }

    @Override
    public String emitirSom() {
        return "Oinc!";
    }

    @Override
    public double calcularCustoAlimentacaoDiario() {
        return 3.80;
    }
}