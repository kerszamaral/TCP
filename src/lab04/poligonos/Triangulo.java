package lab04.poligonos;
/*
 * 27/06/2023
 * Laboratório 4 -  Herança e Polimorfismo em Java
 * Ian Kersz Amaral
 * Modulo da Classe Abstrata Triangulo
*/

public abstract class Triangulo implements Poligono {

    private float base;

    private float altura;

    private float[] lados;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lados = new float[3];
        this.lados[0] = lado1;
        this.lados[1] = lado2;
        this.lados[2] = lado3;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the lados
     */
    public float[] getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(float lado1, float lado2, float lado3) {
        if (this.lados == null) {
            this.lados = new float[3];
        }
        this.lados[0] = lado1;
        this.lados[1] = lado2;
        this.lados[2] = lado3;
    }

    public static float calculaArea(float base, float altura) {
        return (base * altura) / 2;
    }

    @Override
    public float calculaArea() {
        return (base * altura) / 2;
    }

    public abstract void imprimeTipoPoligono();
}
