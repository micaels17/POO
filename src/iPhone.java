public class iPhone {
  private final ReprodutorMusical reprodutor;
  private final AparelhoTelefonico telefone;
  private final NavegadorInternet navegador;

  public iPhone() {
      this.reprodutor = new ReprodutorMusical();
      this.telefone = new AparelhoTelefonico();
      this.navegador = new NavegadorInternet();
  }

  public void tocarMusica() {
      reprodutor.tocar();
  }

  public void fazerLigacao(String numero) {
      telefone.ligar(numero);
  }

  public void exibirPagina(String url) {
      navegador.exibirPagina(url);
  }
}
