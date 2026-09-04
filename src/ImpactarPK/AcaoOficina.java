package ImpactarPK;
public class AcaoOficina extends Acoes {

    private int duracaoHoras;
    private boolean kitMaterial;

    public AcaoOficina(int idAcao, String titulo, String descricao, String data, String time, int maxParticipantes, String local, int duracaoHoras, boolean kitMaterial) {
        super( idAcao, titulo, descricao, data, time, maxParticipantes, local);
        this.duracaoHoras = duracaoHoras;
        this.kitMaterial = kitMaterial;
    }

    public int cadastrarOficina(AcaoOficina oficina) {
        return 0;
    }

    public int getDuracaoHoras() { return duracaoHoras; }
    public void setDuracaoHoras(int duracaoHoras) { this.duracaoHoras = duracaoHoras; }
    public boolean isKitMaterial() { return kitMaterial; }
    public void setKitMaterial(boolean kitMaterial) { this.kitMaterial = kitMaterial; }

    @Override
    public String toString() {
        return super.toString() + "AcaoOficina{duracaoHoras=" + duracaoHoras + ", kitMaterial=" + kitMaterial + '}';
    }
}