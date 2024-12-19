package paquete.clases;

public class Circulo extends FiguraGeometrica {

    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    @Override
    public double calcularArea() {
        double radio = diametro / 2;
        return Math.PI * Math.pow(radio, 2); 
    }
}