package br.com.treinaweb;

public class Carro extends Veiculo{

    public Carro(){
        this.quantidadeRodas =4;
    }

    public Carro(String nome, String marca){
        this.setNome(nome);
        this.setMarca(marca);
    }

}
