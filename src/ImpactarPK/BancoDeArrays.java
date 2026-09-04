package ImpactarPK;

import java.util.ArrayList;

public class BancoDeArrays {
    public static ArrayList<Voluntario> voluntarios = new ArrayList<>();
    public static ArrayList<Acoes> acoes = new ArrayList<>();
    public static  ArrayList<InscricaoVoluntario> inscricoes = new ArrayList<>();

    public static ArrayList<InscricaoVoluntario> getInscricoes() {
        return inscricoes;
    }

    public static void setInscricoes(ArrayList<InscricaoVoluntario> inscricoes) {
        BancoDeArrays.inscricoes = inscricoes;
    }

    public static ArrayList<Acoes> getAcoes() {
        return acoes;
    }

    public static void setAcoes(ArrayList<Acoes> acoes) {
        BancoDeArrays.acoes = acoes;
    }

    public static ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public static void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        BancoDeArrays.voluntarios = voluntarios;
    }
}
