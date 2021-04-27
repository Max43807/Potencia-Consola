package potenciaconsola.obj;

public class Potencia {

    //Atributos
    private double b;
    private int e;
    private double val;

    public Potencia(double base, int exp) {
        this.b = base;
        this.e = exp;
        this.val = 1;

        if (exp == 0) {
            return;
        }

        for (; exp > 0; exp--) {
            this.val = this.val * base;
        }

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
    
    public double obtenerPotencia(){
        return this.val;
    }
}
