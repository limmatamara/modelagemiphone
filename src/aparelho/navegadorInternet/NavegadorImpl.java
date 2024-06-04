package aparelho.navegadorInternet;

public class NavegadorImpl implements Navegador {
	  @Override
	  public void exibirPagina() {
	    System.out.println("Exibindo página web.");
	  }

	  @Override
	  public void adicionarNovaAba() {
	    System.out.println("Adicionando nova aba.");
	  }

	  @Override
	  public void atualizarPagina() {
	    System.out.println("Atualizando página web.");
	  }
}
