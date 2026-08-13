package prjSistemaVeiculos;

public class Carro extends Veiculos {

	
	    private int quantidadePortas;

	    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
	        super();
	        this.quantidadePortas = quantidadePortas;
	    }

	    public int getQuantidadePortas() {
	        return quantidadePortas;
	    }

	    public void setQuantidadePortas(int quantidadePortas) {
	        this.quantidadePortas = quantidadePortas;
	    }

	   
	    public void exibirInfo() {
	        super.exibirInfo();
	        System.out.println("Quantidade de portas: " + quantidadePortas);
	    }
	}

