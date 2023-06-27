package lab04.poligonos;
/*
 * 27/06/2023
 * Laboratório 4 -  Herança e Polimorfismo em Java
 * Ian Kersz Amaral
 * Modulo da Classe TrianguloIsosceles
*/

public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }

    private float calculaAltura() {
        float meiaBase = getLados()[0] / 2; // a
        float meiaBaseAoQuadrado = (float) Math.pow(meiaBase, 2); // a^2
        float ladoAoQuadrado = (float) Math.pow(getLados()[1], 2); // b^2
        float alturaAoQuadrado = ladoAoQuadrado - meiaBaseAoQuadrado; // b^2 - a^2
        return (float) Math.sqrt(alturaAoQuadrado); // sqrt(b^2 - a^2)
    }

    @Override
    public float calculaArea() {
        float base = getLados()[0];
        float altura = calculaAltura();
        return Triangulo.calculaArea(base, altura);
    }

    @Override
    public void imprimeTipoPoligono() {
        System.out.println("Triangulo Isosceles");
    }
}
