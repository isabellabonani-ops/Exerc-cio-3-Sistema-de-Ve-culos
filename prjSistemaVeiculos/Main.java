package prjSistemaVeiculos;

public class Main {
	    public static void main(String[] args) {

	        Carro carro = new Carro("Toyota", "Corolla", 2024, 4);

	        Moto moto = new Moto("Honda", "CB 500", 2023, 500);

	        System.out.println("=== INFORMAÇÕES DO CARRO ===");
	        carro.exibirInfo();

	        System.out.println();

	        System.out.println("INFORMAÇÕES DA MOTO ");
	        moto.exibirInfo();
	    }
	}

