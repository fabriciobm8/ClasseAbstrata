public abstract class FormaGeometrica {
  private String nome;
  private String cor;

  // Construtor
  public FormaGeometrica(String nome, String cor) {
    this.nome = nome;
    this.cor = cor;
  }

  // Metodo não abstrato: Imprime informações sobre a forma
  public void imprimirInformacoes() {
    System.out.println("Forma: " + nome);
    System.out.println("Cor: " + cor);
  }

  // Métodos abstratos: Forçam as subclasses a implementarem
  public abstract double calcularArea();
  public abstract double calcularPerimetro();
}