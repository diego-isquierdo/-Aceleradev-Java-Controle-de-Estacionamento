package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Estacionamento {
    private static final int NUMERO_DE_VAGAS = 10;
    private static final int MAX_PONTOS_CNH = 21;
    private static final int IDADE_SENIOR = 55;
    private List<Carro> vagas = new ArrayList<>();


    public void estacionar(Carro carro) {
        if (!(carrosEstacionados()<NUMERO_DE_VAGAS)) trataLotacaoExcedente(carro);

        vagas.add(carro);
    }

    public int carrosEstacionados() {
        return vagas.size();
    }

    public boolean carroEstacionado(Carro carro) {
        return vagas.contains(carro);
    }

    //extra
    private void trataLotacaoExcedente(Carro carro){
        if (vagas.get(0).getMotorista().getIdade()>55) {
                int x=1;
                while (x<carrosEstacionados()){
                    if (vagas.get(x).getMotorista().getIdade()<55){
                        vagas.remove(x);
                        return;
                    }
                    x++;
                }
                throw new EstacionamentoException("Lotado");
        }
        vagas.remove(0);
    }
}
