package ImpactarTest;

import ImpactarPK.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoluntarioTest {
    Sistema sistema;
    ///////////////////MENU///////////////////
    /// CADASTRO
    // INSCRICAO
    // Verificar Email Duplo
    // Verificar O Total De Participantes NA ACAO
    // Verifica Inscricao Dupla
    /// EXIBIR VOLUNTARIO
    /// LISTA

    @BeforeEach
    public void setUp(){
        this.sistema = new Sistema();

    }
    @Test
    @DisplayName("Deve adicionar")
    public void adicionar(){
        sistema.cadastrarVoluntario("Thay","thay.ewe@gmail","1");

        assertFalse(BancoDeArrays.getVoluntarios().isEmpty());
        assertEquals(1,BancoDeArrays.getVoluntarios().size());
        assertEquals("thay.ewe@gmail",BancoDeArrays.getVoluntarios().get(0).getEmail());
        assertThrows(IllegalArgumentException.class, () ->{
            sistema.cadastrarVoluntario("Thay","thay.ew@gmail","1");
            sistema.cadastrarVoluntario("Thay","thay.ew@gmail","1");
        });
    }
    @Test
    @DisplayName("Deve adiionar uma inscricao")
    public void adicionaInscricao(){
        sistema.inscreverVoluntario("thay.ewe",1);
        sistema.inscreverVoluntario("thay.ewe",2);

        assertFalse(BancoDeArrays.inscricoes.isEmpty());
        assertEquals(2,BancoDeArrays.inscricoes.size());

    }
    @Test
    @DisplayName("Deve Verificar email Duplo")
    public void verificarEmailDuplo(){
        assertThrows(IllegalArgumentException.class, () ->{
            sistema.cadastrarVoluntario("Thay","thay.ew@gmail","1");
            sistema.cadastrarVoluntario("Thay","thay.ew@gmail","1");
        });
    }

    @Test
    @DisplayName("Deve Verificar o total de inscricao NA ACAO")
    public void verificarOTotalDeParticipantes(){
        //se a exception for lançanda vai passar no teste
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> {
            sistema.inscreverVoluntario("thay.ewe",1);
            sistema.inscreverVoluntario("thay.ew",1);
            sistema.inscreverVoluntario("thay",1);
            sistema.inscreverVoluntario("thayS",1);
            sistema.inscreverVoluntario("thayEv",1);
            sistema.inscreverVoluntario("thay.",1);
        });
    }

    @Test
    @DisplayName("Deve Verificar inscricao dupla")
    public void verificaInscricaoDupla(){
        //se a exception for lançanda vai passar no teste
        assertThrows(IllegalArgumentException.class, ()-> {
            sistema.inscreverVoluntario("thay.ewe",1);
            sistema.inscreverVoluntario("thay.ewe",1);
        });
    }

    @Test
    @DisplayName("Deve exibir o nome e email")
    public void exibir(){
        Voluntario voluntario1 = new Voluntario("Thay","thay.ewe@gmail","1");
        Voluntario voluntario2 = new Voluntario("Thay","thay.ew@gmail","1");

        assertTrue(true,sistema.exibirVoluntario( "thay.ewe@gmail"));
        assertEquals("thay.ewe@gmail",voluntario1.getEmail());
        assertFalse(voluntario1.getEmail().equalsIgnoreCase(voluntario2.getEmail()));
    }

    @Test
    @DisplayName("Deve Listar os voluntarios")
    public void listar(){
        sistema.cadastrarVoluntario("Thay","thay.ewe@gmail","1");
        sistema.cadastrarVoluntario("Ewe","thay@gmail","2");

        sistema.listarVoluntarios();
        assertEquals(2,BancoDeArrays.getVoluntarios().size());
        assertFalse(BancoDeArrays.getVoluntarios().isEmpty());
    }
}
