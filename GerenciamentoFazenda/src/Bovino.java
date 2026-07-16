package model;

public class Bovino extends Animal implements ProdutorLeite {

    private double producaoDiariaLeite;

    public Bovino(String id, double peso, int idadeMeses, double producaoDiariaLeite) {
        super(id, peso, idadeMeses);
        this.producaoDiariaLeite = producaoDiariaLeite;
    }

    @Override
    public String emitirSom() {
        return "Muuu!";
    }

    @Override
    public double calcularCustoAlimentacao() {
        if (getPeso() > 300) {
            return 12.00;
        } else {
            return 7.00;
        }
    }

    @Override
    public double coletarLeite() {
        return this.producaoDiariaLeite;
    }

    public double getProducaoDiariaLeite() {
        return producaoDiariaLeite;
    }

    public void setProducaoDiariaLeite(double producaoDiariaLeite) {
        this.producaoDiariaLeite = producaoDiariaLeite;
    }
}