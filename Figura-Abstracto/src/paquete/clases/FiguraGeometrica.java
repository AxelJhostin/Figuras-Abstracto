package paquete.clases;

public abstract class FiguraGeometrica {
    public abstract double calcularArea();

    public boolean mayorQue(FiguraGeometrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    @Override
    public String toString() {
        return "Área de la figura: " + String.format("%.2f", calcularArea());
    }
}