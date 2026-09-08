package ImpactarPK;

public class Voluntario {
    private String nome;
    private String emailVoluntario;
    private String matricula;
    private double pontuacao;
    private int quantidadeDeAcoes;

    public Voluntario(String nome, String emailVoluntario, String matricula) {
        this.nome = nome;
        this.emailVoluntario = emailVoluntario;
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

    public String getEmailVoluntario() {
        return emailVoluntario;
    }

    public void setEmailVoluntario(String email) {
        this.emailVoluntario = email;
    }

    @Override
    public String toString() {
        return "\nVoluntario:" +
                "\nNome: " + nome +
                "\nMatricula: " + matricula +
                "\nEmail: " + emailVoluntario +
                "\nQuantidadeDeAcoes: " + quantidadeDeAcoes +
                "\nPontuacao: " + pontuacao+"\n";
    }
}