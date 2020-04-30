package challenge;

public class Validador {
    static void validaNull(boolean parametro){
        if (parametro) throw new NullPointerException("Erro nos parametros");
    }

    static void validaEstacionamento(boolean parametro){
        if (parametro) throw new EstacionamentoException("Erro ao informar parametro");
    }

    static void validaNumber(boolean parametro){
        if (parametro) throw new IllegalArgumentException("Erro ao informar parametro");
    }

}
