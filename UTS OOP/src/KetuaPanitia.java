public class KetuaPanitia extends Panitia {
    
    KetuaPanitia(String nama, String noAnggota, String periode) {
        super(nama, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    void display(){
        System.out.println("nama: "+ this.nama + "\nNo anggota: "+ this.noAnggota + "\nPeriode: "+ this.periode);
    }    
    void menyetujuiAnggaran(){
        System.out.println(" Menyetujui anggaran ");
    }
    void menyetujuiPekerjaan(){
        System.out.println(" Menyetujui anggaran ");
    }
    void menyetujuiJadwal(){
        System.out.println(" Menyetujui anggaran ");
    }
}
