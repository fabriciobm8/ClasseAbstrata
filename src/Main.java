public class Main {
  public static void main(String[] args) {
    // Não podemos instanciar FormaGeometrica diretamente
    // FormaGeometrica forma = new FormaGeometrica(); // Erro de compilação

    Circulo circulo = new Circulo("Círculo", "Azul", 5);
    circulo.imprimirInformacoes(); //Veja que não é um metodo abstrato (não precisou ser implement. na classe Circulo)

    //Metodos da classe FormaGeometrica que são obrigatoriamente implementados na classe filha Circulo
    System.out.println("Área: " + circulo.calcularArea());
    System.out.println("Perímetro: " + circulo.calcularPerimetro());

    System.out.println("----------------------------------------------------");

    Quadrado quadrado = new Quadrado("Quadrado","Amarelo",2.50);
    quadrado.imprimirInformacoes();
    System.out.println("Área: " + quadrado.calcularArea());
    System.out.println("Perímetro: "+ quadrado.calcularPerimetro());
  }
}