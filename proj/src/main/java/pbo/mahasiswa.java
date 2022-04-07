package pbo;

public class mahasiswa implements maha {
    double j,r,p;
    double hasil;
    
    public mahasiswa(double jurnal, double relevansi, double problem) {
        this.j = jurnal ;
        this.r = relevansi;
        this.p = problem;
    }
    
    public double jurnal() {
        j = j*0.60;
        return j;
    }

  
    public double relevansi() {
        r = r*0.25;
        return r;
    }


    public double problem() {
        p = p*0.15;
        return p;
    }


    
    public double hasil() {
        hasil = konten()+ visual()+ design();
        return hasil;
    }   
    
 
}