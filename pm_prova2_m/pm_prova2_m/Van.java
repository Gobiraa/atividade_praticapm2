package pm_prova2_m;

import java.util.List;

public class Van extends Veiculo implements Avaliavel {
    private int maxPassageiros;
    private List<Integer> avaliacoes;
    private boolean inspeçao;

    

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
            StatusVeiculo status, int maxPassageiros, List<Integer> avaliacoes, boolean inspeçao) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.maxPassageiros = maxPassageiros;
        this.avaliacoes = avaliacoes;
        this.inspeçao = inspeçao;
    }

    @Override
    public void avaliar(int nota) {
        if (nota < 1 || nota > 5){
            System.out.println("Nota invalida");
        }
        avaliacoes.add(nota);


    }

    public double mediaNotas(int nota) {
        int soma = 0;
        for(Integer nota : avaliacoes){
            soma += nota;
        }
        return media;
    } 

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    public List<Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Integer> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public boolean isInspeçao() {
        return inspeçao;
    }

    public void setInspeçao(boolean inspeçao) {
        this.inspeçao = inspeçao;
    }

    @Override
    public void realizarInspecao(){
        this.realizarInspecao();
    }
    
    public String getTipo() {
        return "Van";
    }

    
    
}
