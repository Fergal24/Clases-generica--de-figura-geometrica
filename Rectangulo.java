public class Rectangulo extends FiguraGeometrica implements Imprimible {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Rectángulo - Ancho: " + ancho + ", Alto: " + alto + ", Área: " + calcularArea());
    }
}