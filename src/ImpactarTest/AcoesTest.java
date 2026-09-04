package ImpactarTest;

import ImpactarPK.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcoesTest {
    Sistema sistema;
    ///////////////////MENU///////////////////
    /// CADASTRO
    // PLANTIO
    // OFICINA
    /// PONTUACAO
    // PLANTIO
    // OFICINA
    // MUTIRAO
    // VOLUNTARIO
    /// RANKING
    /// EXIBIR DETALHES DA ACAO

    @BeforeEach
    public void setUp(){
        this.sistema = new Sistema();
    }

    @Test
    @DisplayName("Deve adiionar uma atividade")
    public void adicionarPlantio(){
        AcaoPlantio planta = new AcaoPlantio(1, "PlantioDe", "Mudas de Pera",
                "Para plantar mais mudas de Pera", "22/10/2026",5, "Praça",50);
        sistema.cadastrarPlantio(planta);

        assertFalse(BancoDeArrays.acoes.isEmpty());
        assertEquals(1,BancoDeArrays.acoes.size());
        assertTrue(BancoDeArrays.acoes.contains(planta));
    }

    @Test
    @DisplayName("Deve adicionar uma atividade")
    public void adicionarOficina(){
        AcaoOficina oficina1= new AcaoOficina(2,"Oficina","Oficina de Artes","E bom d+","11/12/2026",5,"praça",5,true);

        sistema.cadastrarOficina(oficina1);

        assertFalse(BancoDeArrays.acoes.isEmpty());
        assertEquals(1,BancoDeArrays.acoes.size());
        assertTrue(BancoDeArrays.acoes.contains(oficina1));
    }

    @Test
    @DisplayName("Deve adiionar uma atividade")
    public void adicionarMutirao(){
        AcaoMutirao mutirao1 = new AcaoMutirao(3, "PlantioDe", "Mudas de Pera",
                "E uma acao boa", "22/10/2026", 5,"Praça",50);
        sistema.cadastrarMutirao(mutirao1);

        assertFalse(BancoDeArrays.acoes.isEmpty());
        assertEquals(1,BancoDeArrays.acoes.size());
        assertTrue(BancoDeArrays.acoes.contains(mutirao1));
    }

    @Test
    @DisplayName("Deve calcular os Pontos de Plantio")
    public void calcularPlantio(){
        sistema.cadastrarVoluntario("Thay","thay.ewe","1");

        assertEquals(13,sistema.pontuacaoPlantio("thay.ewe",1,4));
        assertEquals("thay.ewe",sistema.exibirVoluntario("thay.ewe"));
        sistema.exibirVoluntario("thay.ewe");
    }

    @Test
    @DisplayName("Deve calcular os Pontos de Oficina")
    public void calcularOficina(){
        sistema.cadastrarVoluntario("Thay","thay.ewe","1");
        sistema.cadastrarVoluntario("Thay","ewe","1");

        assertEquals(12,sistema.pontuacaoOficina("thay.ewe",2,4,false));
        assertEquals(22,sistema.pontuacaoOficina("ewe",2,4,true));
        assertEquals("thay.ewe",sistema.exibirVoluntario("thay.ewe"));
        assertEquals("ewe",sistema.exibirVoluntario("ewe"));
    }

    @Test
    @DisplayName("Deve calcular os Pontos de Mutirao")
    public void calcularMutirao(){

        sistema.cadastrarVoluntario("Thay","thay.ewe","1");
        assertEquals(16,sistema.pontuacaoMutirao("thay.ewe",3,4));
        assertEquals("thay.ewe",sistema.exibirVoluntario("thay.ewe"));
    }

    @Test
    @DisplayName("Deve mostrar a Pontuaçao anterior + a nova")
    public void pontuacaoVoluntarios(){
        sistema.cadastrarVoluntario("Thay","thay.ewe","1");
        assertEquals(12,sistema.pontuacaoOficina("thay.ewe",2,4,false));

        assertEquals(16,sistema.pontuacaoMutirao("thay.ewe",3,4));
        assertEquals("thay.ewe",sistema.exibirVoluntario("thay.ewe"));
    }

    @Test
    @DisplayName("Deve listar o ranking")
    public void listarRanking(){
        sistema.cadastrarVoluntario("ABC","ewe1","1");
        sistema.cadastrarVoluntario("ACB","ewe2","2");
        sistema.cadastrarVoluntario("Thay3","ewe3","3");
        sistema.cadastrarVoluntario("Thay4","ewe4","4");
        sistema.cadastrarVoluntario("Thay5","ewe5","5");

        assertEquals(12,sistema.pontuacaoOficina("ewe1",2,4,false));
        assertEquals(12,sistema.pontuacaoOficina("ewe2",2,4,false));
        assertEquals(13,sistema.pontuacaoPlantio("ewe3",1,4));
        assertEquals(16,sistema.pontuacaoMutirao("ewe4",3,4));
        assertEquals(15,sistema.pontuacaoPlantio("ewe5",1,5));

        sistema.ranking();
    }

    @Test
    @DisplayName("Deve exibir detalhes de  uma atividade")
    public void exibirDetalhes(){
        AcaoPlantio plantio1 =  new AcaoPlantio(1, "Plantio", "Mudas de algodao",
                "Para plantar mais mudas de algodao", "22/10/2026", 5,"Praça",50);
        sistema.cadastrarPlantio(plantio1);

        AcaoOficina oficina1= new AcaoOficina(2,"Oficina","Oficina de Artes",
                "E bom d+","11/12/2026",5,"praça",5,true);

        AcaoMutirao mutirao1 = new AcaoMutirao(3,"Mutirao", "Mutirao de Reciclagem",
                "E uma acao boa","20/01/20271",5,"Rua",12);
        sistema.cadastrarMutirao(mutirao1);
        sistema.cadastrarOficina(oficina1);

        sistema.exibirDetalhesAcao(1);
        sistema.exibirDetalhesAcao(2);
        sistema.exibirDetalhesAcao(3);

        assertFalse(BancoDeArrays.acoes.isEmpty());
        assertEquals(3,BancoDeArrays.acoes.size());
        assertEquals(3,BancoDeArrays.acoes.size());
        assertEquals(3,BancoDeArrays.acoes.size());
    }
}