package ImpactarPK;

public class AcaoMutirao extends Acoes {

    private int duracaoHoras;


    public AcaoMutirao( int idAcao, String titulo, String descricao, String data, String time, int maxParticipantes, String local, int duracaoHoras) {
        super( idAcao, titulo, descricao, data, time, maxParticipantes, local);
        this.duracaoHoras = duracaoHoras;
    }


    public int cadastrarMutirao(AcaoMutirao mutirao) {
        return 0;
    }

    public int getDuracaoHoras() { return duracaoHoras; }
    public void setDuracaoHoras(int duracaoHoras) { this.duracaoHoras = duracaoHoras; }

    @Override
    public String toString() {
        return super.toString() + "AcaoMutirao{duracaoHoras=" + duracaoHoras + '}';
    }
}