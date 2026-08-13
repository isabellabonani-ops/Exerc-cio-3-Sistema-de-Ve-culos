package prjSistemaVeiculos;

public class Moto extends Veiculos {

	
	    private int cilindradas;

	    public Moto(String marca, String modelo, int ano, int cilindradas) {
	        super();
	        this.cilindradas = cilindradas;
	    }

	    public int getCilindradas() {
	        return cilindradas;
	    }

	    public void setCilindradas(int cilindradas) {
	        this.cilindradas = cilindradas;
	    }

	    
	    public void exibirInfo() {
	        super.exibirInfo();
	        System.out.println("Cilindradas: " + cilindradas + " cc");
	    }
	}

