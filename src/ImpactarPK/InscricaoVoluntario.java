package ImpactarPK;

public class InscricaoVoluntario {
    private String emailVoluntario;
    private int idAcao;

    public InscricaoVoluntario(String emailVoluntario, int idAcao) {
        this.emailVoluntario = emailVoluntario;
        this.idAcao = idAcao;
    }
    public int getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(int idAcao) {
        this.idAcao = idAcao;
    }

    public String getEmail() {
        return emailVoluntario;
    }

    public void setEmail(String email) {
        this.emailVoluntario = email;
    }

    @Override
    public String toString() {
        return "InscricaoVoluntario{" +
                "email=" + emailVoluntario +
                ", idAcao=" + idAcao +
                '}';
    }
}
