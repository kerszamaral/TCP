package lab02.posicoes;
/*
 * 25/05/2023
 * Laboratório 1 - POO
 * Ian Kersz Amaral
 * Modulo da classe PosicaoMapa4x4
*/

public class PosicaoMapa4x4{
    private int x;
    private int y;
    private static int numPosicoesOcupadas;


    public PosicaoMapa4x4() {
        this.reset();
        numPosicoesOcupadas++;
    }

    public PosicaoMapa4x4(int x, int y)
    {
        if (x < 0 || x > 3 || y < 0 || y > 3)
            throw new IllegalArgumentException("Posicao invalida");

        this.x = x;
        this.y = y;
        numPosicoesOcupadas++;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public boolean setX(int x) {
        if (x < 0 || x > 3)
            return false;

        this.x = x;
        return true;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public boolean setY(int y) {
        if (y < 0 || y > 3)
            return false;

        this.y = y;
        return true;
    }

    /**
     * @return the numPosicoesOcupadas
     */
    public static int getNumPosicoesOcupadas() {
        return numPosicoesOcupadas;
    }

    public PosicaoMapa4x4 copy()
    {
        PosicaoMapa4x4 pos = new PosicaoMapa4x4(this.x, this.y);
        return pos;
    }

    public void imprime()
    {
        System.out.println("Posicao: (" + (this.x + 1) + ", " + (this.y + 1) + ")");
    }

    public int distancia(PosicaoMapa4x4 p)
    {
        return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
    }

    private void reset(){
        this.x = 0;
        this.y = 0;
    }

    public static boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2)
    {
        return p1.x == p2.x && p1.y == p2.y;
    }
}
