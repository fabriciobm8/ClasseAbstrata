public class Circulo extends FormaGeometrica {
  private double raio;

  // Construtor
  public Circulo(String nome, String cor, double raio) {
    super(nome, cor);
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * raio * raio;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
}