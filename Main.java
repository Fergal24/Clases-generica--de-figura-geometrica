import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(5.0));
        figuras.add(new Rectangulo(3.0, 4.0));
        figuras.add(new Circulo(2.0));
        figuras.add(new Rectangulo(6.0, 7.0));

        // Ordenar figuras por área
        Collections.sort(figuras, new Comparator<FiguraGeometrica>() {
            @Override
            public int compare(FiguraGeometrica figura1, FiguraGeometrica figura2) {
                double area1 = figura1.calcularArea();
                double area2 = figura2.calcularArea();
                return Double.compare(area1, area2);
            }
        });

        // Mostrar características de las figuras usando iteradores
        System.out.println("Figuras ordenadas por área:");
        Iterator<FiguraGeometrica> iterador = figuras.iterator();
        while (iterador.hasNext()) {
            FiguraGeometrica figura = iterador.next();
            figura.imprimirCaracteristicas();
        }
    }
}