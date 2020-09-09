package br.com.treinaweb;

import excecoes.ChassiinvalidoException;

import javax.naming.directory.InvalidAttributesException;

public class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private float quantidadeCombustivel;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    //Use para a senha no health Track
    public void setChassi(String chassi) throws Exception {
        if (chassi.length() == 5){
            this.chassi = chassi;
        }else {
            throw new ChassiinvalidoException(chassi);

        }
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }


    public void ligar(){
        System.out.println("O vículo ligou");
    }
    public void desligar(){
        System.out.println("O veículo desligou");
    }

    public void abastecer(float litros){
        quantidadeCombustivel += litros;
    }
}