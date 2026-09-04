package ImpactarPK;
public class Acoes{
    private int idAcao;
    private String titulo;
    private String descricao;
    private String data;
    private String time;
    private String local;
    private int maxParticipantes;

    public Acoes(int idAcao, String titulo, String descricao, String data, String time, int maxParticipantes, String local) {
        this.idAcao = idAcao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.time = time;
        this.maxParticipantes = maxParticipantes;
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(int idAcao) {
        this.idAcao = idAcao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

}