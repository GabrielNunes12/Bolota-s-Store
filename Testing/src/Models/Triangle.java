package Models;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double result;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Double getResultArea (double a, double b, double c) {
        return this.result = (a + b + c) / 2;
    }

    public double getResult() {
        return result;
    }
}
