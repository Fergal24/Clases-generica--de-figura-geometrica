public class Circulo extends FiguraGeometrica implements Imprimible {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Círculo - Radio: " + radio + ", Área: " + calcularArea());
    }
}