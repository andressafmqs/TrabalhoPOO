package Animais;

public class Ave extends Animal {

    public Ave(String id, double peso, int idadeMeses) {
        super(id, peso, idadeMeses);
    }

    @Override
    public String emitirSom() {
        return "Cócó!";
    }

    @Override
    public double calcularCustoAlimentacao() {
        return 0.90;
    }
}