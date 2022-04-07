package pbo;
import pbo.pljr;

public class pelajar implements pe {
    double k,v,d;
    double hasil;
    
    public pelajar(double konten, double visual, double design) {
        this.k = konten;
        this.v = visual;
        this.d = design;
    }
    
    public double konten() {
        k = k*0.50;
        return k;
    }

  
    public double visual() {
        v = v*0.20;
        return v;
    }


    public double design() {
        d = d*0.30;
        return d;
    }


    
    public double hasil() {
        hasil = konten()+ visual()+ design();
        return hasil;
    }   
    
 
}