public class AkunBank {
    int saldo;
    public AkunBank (int saldo){
        this.saldo=saldo;
         }
    
        public void cekSaldo(){
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println ("Saldo saat ini : Rp. "+ saldo);
        System.out.println();
    }
    
        public void simpanUang (int simpanUang){
        this.saldo = 600000;
        System.out.println ("Simpan uang : Rp. " + simpanUang);
        System.out.println ("Saldo saat ini : Rp. " + saldo);
        System.out.println();
    }
        
        public void ambilUang (int ambilUang){
        this.saldo = 450000;
        System.out.println ("Ambil uang : Rp. " + ambilUang);
        System.out.println ("Saldo saat ini : Rp. " + saldo);
        System.out.println();
    }
}
