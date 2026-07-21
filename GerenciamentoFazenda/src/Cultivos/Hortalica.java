package Cultivos;

public class Hortalica extends Cultivo {

    private boolean cultivoOrganico;

    public Hortalica(String id, double areaPlantada, String dataPlantio, boolean cultivoOrganico) {
        super(id, areaPlantada, dataPlantio);
        this.cultivoOrganico = cultivoOrganico;
    }

    @Override
    public double calcularRendimento() {
        return getAreaPlantada() * 8000; // kg por hectare, maior densidade
    }

    @Override
    public int getTempoColheitaDias() {
        return 60;
    }

    public boolean isCultivoOrganico() {
        return cultivoOrganico;
    }

    public void setCultivoOrganico(boolean cultivoOrganico) {
        this.cultivoOrganico = cultivoOrganico;
    }
}