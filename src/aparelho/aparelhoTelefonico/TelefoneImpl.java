package aparelho.aparelhoTelefonico;

public class TelefoneImpl implements Telefone {

	@Override
	  public void ligar(int numero) {
	    System.out.println("Ligando para " + numero);
	  }

	  @Override
	  public void atender() {
	    System.out.println("Atendendo a uma ligação.");
	  }

	  @Override
	  public void iniciarCorreioVoz() {
	    System.out.println("Ligando para Correio de Voz.");
	  }

}
