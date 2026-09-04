package ImpactarPK;

public interface VoluntarioInterface {
    public String listarVoluntarios();
    public String exibirVoluntario(String email);
    public boolean cadastrarVoluntario(String nome, String email, String matricula);
}
