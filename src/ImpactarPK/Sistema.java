package ImpactarPK;

import java.util.Comparator;

//////////////////TRABALHO DO 2 PERIODO 1 TRIMESTRE 2026/////////////////////////
///////////////////////THAYANNE EWELLIN/////////////////////////////
///////////////////////JULIAN VILLAR/////////////////////////////
///////////////////////ANNA JULIA/////////////////////////////


public class Sistema implements VoluntarioInterface {
//    AcaoPlantio plantio; // id = 1
//    AcaoOficina oficina; // id = 2
//    AcaoMutirao mutirao; // id = 3

    public Sistema() {
    }
    ///////////////////MENU///////////////////
    /// CADASTRO
    // VOLUNTARIO
    // PLANTIO
    // OFICINA
    // MUTIRAO
    // INSCRICAO
    /// PONTUACAO
    // PLANTIO
    // OFICINA
    // MUTIRAO
    /// LISTAR VOLUNTARIOS
    /// EXIBIR DETALHES DA ACAO
    /// RANKING

    @Override
    public boolean cadastrarVoluntario(String nome, String email, String matricula) {
        for (Voluntario vo : BancoDeArrays.voluntarios) {
            if (vo.getEmail().equalsIgnoreCase(email)) {
                throw new IllegalArgumentException("Email já cadastrado: " + email);
            }
        }

        Voluntario voluntario = new Voluntario(nome, email, matricula);
        BancoDeArrays.voluntarios.add(voluntario);
        return true;
    }

    public int cadastrarPlantio(AcaoPlantio plantio) {
        BancoDeArrays.acoes.add(plantio);
        return 0;
    }

    public int cadastrarOficina(AcaoOficina oficina) {
        BancoDeArrays.acoes.add(oficina);
        return 0;
    }

    public int cadastrarMutirao(AcaoMutirao mutirao) {
        BancoDeArrays.acoes.add(mutirao);
        return 0;
    }

    public boolean inscreverVoluntario(String emailVoluntario, int idAcao) {
        InscricaoVoluntario inscricao = new InscricaoVoluntario(emailVoluntario, idAcao);
        int count = 0;
        for(InscricaoVoluntario voluntario: BancoDeArrays.inscricoes){
            count++;
            if(voluntario.getEmail().equals(inscricao.getEmail()) && voluntario.getIdAcao() == inscricao.getIdAcao()){
                throw new IllegalArgumentException("Voluntario ja cadastrado nessa ação!");

            }if (count >= 5) {
                throw new ArrayIndexOutOfBoundsException("\nTarefa cheia");
            }
        }
        BancoDeArrays.inscricoes.add(inscricao);
        return true;
    }

    public double pontuacaoPlantio(String email, int id, int mudas) {
        double pontuacao = 5;
        double bonus = 2;
        double produto = mudas *= bonus;
        double total = produto + pontuacao;

        for (Voluntario voluntario1 : BancoDeArrays.voluntarios) {
            if (email.equalsIgnoreCase(voluntario1.getEmail()) && id == 1) {
                System.out.println("Antes: " + voluntario1.getEmail() + " " + voluntario1.getPontuacao() + " " + voluntario1.getQuantidadeDeAcoes());

                int qntAcao = voluntario1.getQuantidadeDeAcoes() + 1;
                double pontos = voluntario1.getPontuacao() + total;
                voluntario1.setQuantidadeDeAcoes(qntAcao);
                voluntario1.setPontuacao(pontos);
                System.out.println("Depois: " + voluntario1.getEmail() + " " + voluntario1.getPontuacao() + " " + voluntario1.getQuantidadeDeAcoes());
                return total;
            }
        }
        return total;
    }

    public double pontuacaoOficina(String email, int id, double duracaoHora, boolean kitMaterial) {
        double pontuacao = 3;
        double produto = pontuacao * duracaoHora;
        double bonus = 10;
        double bonusFinal = 0;

        if (kitMaterial) {
            bonusFinal = bonus;
        }
        double total = produto + bonusFinal;

        for (Voluntario voluntario1 : BancoDeArrays.voluntarios) {
            if (email.equalsIgnoreCase(voluntario1.getEmail()) && id == 2) {
                System.out.println("Antes: " + voluntario1.getEmail() + " " + voluntario1.getPontuacao() + " " + voluntario1.getQuantidadeDeAcoes());

                int qntAcao = voluntario1.getQuantidadeDeAcoes() + 1;

                voluntario1.setQuantidadeDeAcoes(qntAcao);
                double pontos = voluntario1.getPontuacao() + total;

                voluntario1.setPontuacao(pontos);
                System.out.println("Depois: " + voluntario1.getEmail() + " " + voluntario1.getPontuacao() + " " + voluntario1.getQuantidadeDeAcoes());
                return total;
            }
        }
        return total;
    }

    public double pontuacaoMutirao(String email, int id, double duracaoHora) {
        double pontuacao = 4;
        double total = duracaoHora *= pontuacao;

        for (Voluntario voluntario1 : BancoDeArrays.voluntarios) {
            if (email.equalsIgnoreCase(voluntario1.getEmail()) && id == 3) {
                System.out.println("Antes: " + voluntario1.getEmail() + " " + voluntario1.getPontuacao() + " " + voluntario1.getQuantidadeDeAcoes());

                int qntAcao = voluntario1.getQuantidadeDeAcoes() + 1;
                double pontos = voluntario1.getPontuacao() + total;

                voluntario1.setQuantidadeDeAcoes(qntAcao);
                voluntario1.setPontuacao(pontos);
                System.out.println("Depois: " + voluntario1.getEmail() + " " + voluntario1.getPontuacao() + " " + voluntario1.getQuantidadeDeAcoes());
                return total;
            }
        }
        return total;
    }


    @Override
    public String listarVoluntarios() {
        if (BancoDeArrays.voluntarios.isEmpty()) {
            return "Nenhum voluntário cadastrado.";
        }

        StringBuilder sb = new StringBuilder("=== LISTA DE VOLUNTÁRIOS (por pontuação) ===\n");
        for (Voluntario vo : BancoDeArrays.voluntarios) {
            sb.append(vo.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String exibirVoluntario(String email) {
        for (Voluntario vo : BancoDeArrays.voluntarios) {
            if (email.equalsIgnoreCase(vo.getEmail())) {
                System.out.println(vo);
                return email;
            }
        }
        return email;
    }

    public String exibirDetalhesAcao(int idAcao) {
        for(Acoes id: BancoDeArrays.acoes){
            if(idAcao == id.getIdAcao()){
                System.out.println("\nID: "+id.getIdAcao() + " "+ "\nTitulo: "+id.getTitulo() + " "+"\nDescricao: "+ id.getDescricao());
            }
        }
        return "descricao";
    }

    public double ranking() {
        BancoDeArrays.voluntarios.sort(Comparator.comparing(Voluntario::getPontuacao)
                .reversed().thenComparing(Voluntario::getNome));
        for(Voluntario vo:  BancoDeArrays.voluntarios){
            System.out.println(vo);
        }
        return 0;
    }


}
