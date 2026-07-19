import Animais.*;
import Pessoas.Peao;
import Pessoas.Pessoa;
import Pessoas.Veterinario;
import model.CentroDeProducao;
import model.ProdutorLa;
import model.ProdutorLeite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> funcionarios = new ArrayList<>();
        funcionarios.add(new Peao("João", "123.456.789-00", "01/01/1980", "(99) 99999-9999", 2000.0, "Setor A"));
        funcionarios.add(new Veterinario("Dra. Ana", "987.654.321-00", "10/05/1975", "(88) 88888-8888", 5000.0, "CRMV-123"));


        List<Animal> fazendaAnimais = new ArrayList<>();
        CentroDeProducao centro = new CentroDeProducao();

        fazendaAnimais.add(new Bovino("BOV-01", 350.0, 24, 15.5));
        fazendaAnimais.add(new Bovino("BOV-02", 328.0, 21, 18.5));
        fazendaAnimais.add(new Ovino("OV-01", 55.0, 12, 3.2));
        fazendaAnimais.add(new Ovino("OV-02", 75.0, 13, 2.9));
        fazendaAnimais.add(new Suino("SUI-01", 110.0, 8));
        fazendaAnimais.add(new Ave("AVE-01", 2.5, 4));

        System.out.println("=== ROTINA DIÁRIA DA FAZENDA ===");

        Pessoa responsavel = funcionarios.get(0);

        System.out.println("\nFuncionário em serviço: " + responsavel.getNome());
        System.out.println("Função: " + responsavel.desempenharFuncao());

        for (Animal animal : fazendaAnimais) {
            System.out.println("\n[ID: " + animal.getId() + "]");
            System.out.println("Som: " + animal.emitirSom());
            System.out.println("Custo diário de alimentação: R$ " + animal.calcularCustoAlimentacao());

            if (animal instanceof model.ProdutorLeite) {
                model.ProdutorLeite produtor = (model.ProdutorLeite) animal;
                double leite = produtor.coletarLeite();
                System.out.println("Produção de leite coletada: " + leite + " litros");
                centro.adicionarLeiteTotal(leite);
            }

            if (animal instanceof model.ProdutorLa) {
                model.ProdutorLa produtor = (model.ProdutorLa) animal;
                double la = produtor.tosarLa();
                System.out.println("Lã extraída na tosa: " + la + " kg");
                centro.adicionarLaTotal(la);
            }
        }
        System.out.println("\n=== RESUMO FINAL DA PRODUÇÃO ===");
        System.out.println("Total de leite na fazenda: " + centro.getTotalLeiteAcumulado() + " litros");
        System.out.println("Total de lã na fazenda: " + centro.getTotalLaAcumulado() + " kg");
    }
}