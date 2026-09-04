package ImpactarPK;
public class AcaoPlantio extends Acoes {

    private int qtdMudas;

    public AcaoPlantio(int idAcao, String titulo, String descricao, String data, String time, int maxParticipantes, String local, int qtdMudas) {
        super( idAcao, titulo, descricao, data, time, maxParticipantes, local);
        this.qtdMudas = qtdMudas;
    }

    public int cadastrarPlantio(AcaoPlantio plantio) {
        return 0;
    }

    public int getQtdMudas() { return qtdMudas; }
    public void setQtdMudas(int qtdMudas) { this.qtdMudas = qtdMudas; }

    @Override
    public String toString() {
        return super.toString() + "AcaoPlantio{qtdMudas=" + qtdMudas + '}';
    }
}