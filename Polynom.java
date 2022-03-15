package gorbunov.polynom;

public class Polynom {
    
    private double[] koef;
    
    private Polynom(double[] koef) {
        this.koef = koef;
    }
    
    public static Polynom getInstance(double... a) {
        //double[] pole = new double[a.length];
        if (a == null) return null;
        double[] p = new double[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            if (i != 0) {
                for (int j = 0; j <= i; j++) {
                    p[j] = a[j];
                }
                return new Polynom(p);
            } else { ... }
        } 
       
        //a je pole double[]
        //kontrola parametru a
        //zjistit posledni nenulovy prvek
        //vytvorit kopii pole a, respektive jeho casti
        //Arrays.copy();
        //System.arraycopy();
    }
    
    public int getStupen() {
        return koef.length -1;
    }
    
    public double getKoef(int index) {
        if (index < 0 || index >= koef.length) return 0.;
        return koef[index];
    }
    
    public double getHodnota(double x) {
        double v = koef[koef.length - 1];
        for (int i = koef.length-2; i>= 0; i--) {
            v = v * x + koef[i];
        }
    }
    
    public Polynom getDerivovany() {
        
    }
    
    public String toFmtString() {
        
    }
    
    @Override
    public String toString() {
        return "Polynom(" + "koef-" + Arrays.toString(koef) + ")";
    }
    
    public static void main(String[] args) {
        Polynom p = Polynom.getInstance(7);
        System.out.println(p);
        p = Polynom.getInstance(7, 8, 9 ,4.5);
        System.out.println(p);
        p = Polynom.getInstance(new double[](7, 8, 4));
        System.out.println(p);
    }
}
