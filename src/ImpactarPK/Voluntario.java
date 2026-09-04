package ImpactarPK;
import java.util.Comparator;

public class Voluntario {
    private String nome;
    private String email;
    private String matricula;
    private double pontuacao;
    private int quantidadeDeAcoes;

    public Voluntario(String nome, String email, String matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.pontuacao = 0;
        this.quantidadeDeAcoes = 0;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getPontuacao() {

        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getQuantidadeDeAcoes() {
        return quantidadeDeAcoes;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nVoluntario:" +
                "\nNome: " + nome +
                "\nMatricula: " + matricula +
                "\nEmail: " + email +
                "\nQuantidadeDeAcoes: " + quantidadeDeAcoes +
                "\nPontuacao: " + pontuacao+"\n";
    }
}