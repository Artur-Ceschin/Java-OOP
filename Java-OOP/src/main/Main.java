package main;

import br.com.treinaweb.Carro;
import br.com.treinaweb.Veiculo;

public class Main {
    public static void main(String[] args) {
        try{
//            Carro volvo = new Carro(); //Volvo é Instancia de Veiculo, Invocar o constutor serve para alocar o volvo na mémoria
//            volvo.setMarca("Volvo");
//            volvo.setNome("Volvo");
            Carro volvo = new Carro("Volvo","Sweden");
            volvo.abastecer(10);
            volvo.setChassi("ABCDE");
            System.out.println(volvo.getQuantidadeCombustivel());
            System.out.println(volvo.getNome());
            System.out.println(volvo.getQuantidadeRodas());
            volvo.ligar();
        }catch (Exception e){
            System.out.println("** Ocorreu um erro: " + e.getMessage());
        }
    }
}
