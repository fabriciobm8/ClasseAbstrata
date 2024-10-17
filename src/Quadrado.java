public class Quadrado extends FormaGeometrica {

  double lado;

  public Quadrado(String nome, String cor, double lado) {
    super(nome, cor);
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    return lado*lado;
  }

  @Override
  public double calcularPerimetro() {
    return lado+lado+lado+lado;
  }
}
