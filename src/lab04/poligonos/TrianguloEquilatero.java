package lab04.poligonos;
/*
 * 27/06/2023
 * Laboratório 4 -  Herança e Polimorfismo em Java
 * Ian Kersz Amaral
 * Modulo da Classe TrianguloEquilatero
*/

public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public float calculaArea() {
        float multiplicador = (float) (Math.sqrt(3) / 4);
        float ladoAoQuadrado = (float) Math.pow(getLados()[0], 2);
        return multiplicador * ladoAoQuadrado;
    }

    @Override
    public void imprimeTipoPoligono() {
        System.out.println("Triangulo Equilatero");
    }
}
