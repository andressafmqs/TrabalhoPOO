import model.Animal;
import model.Bovino;
import model.Ovino;
import model.Suino;
import model.Ave;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> fazendaAnimais = new ArrayList<>();

        fazendaAnimais.add(new Bovino("BOV-01", 350.0, 24, 15.5));
        fazendaAnimais.add(new Ovino("OV-01", 55.0, 12, 3.2));
        fazendaAnimais.add(new Suino("SUI-01", 110.0, 8));
        fazendaAnimais.add(new Ave("AVE-01", 2.5, 4));

        System.out.println("=== ROTINA DIÁRIA DA FAZENDA ===");

        for (Animal animal : fazendaAnimais) {
            System.out.println("\n[Animal ID: " + animal.getId() + "]");
            System.out.println("Som: " + animal.emitirSom());
            System.out.println("Custo diário de alimentação: R$ " + animal.calcularCustoAlimentacao());

            if (animal instanceof model.ProdutorLeite) {
                model.ProdutorLeite produtor = (model.ProdutorLeite) animal;
                System.out.println("Produção de leite coletada: " + produtor.coletarLeite() + " litros");
            }

            if (animal instanceof model.ProdutorLa) {
                model.ProdutorLa produtor = (model.ProdutorLa) animal;
                System.out.println("Lã extraída na tosa: " + produtor.tosarLa() + " kg");
            }
        }
    }
}