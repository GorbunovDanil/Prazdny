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
       for (int i = 0; i < a.length; i++) {
           p[i] = a[i];
       }
       //a je pole double[]
       //kontrola parametru a
       //zjistit posledni nenulovy prvek
       //vytvorit kopii pole a, respektive jeho casti
       //Arrays.copy();
       //System.arraycopy();
       return new Polynom(p);
    }
    
    public int getStupen() {
        return koef.length -1;
    }
    
    public int getKoef(int index) {
        
    }
    
    public double getHodnota(double x) {
        
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
