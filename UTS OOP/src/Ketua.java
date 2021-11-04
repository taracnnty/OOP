public class Ketua extends Perangkat {
    
    
    // Ketua(String nama, String noAnggota) {
    //     super(nama, noAnggota);
    //     //TODO Auto-generated constructor stub
    // }

    Ketua(String nama, String noAnggota, String periode) {
        super(nama, noAnggota, periode);
        //TODO Auto-generated constructor stub
    }

    void display(){
        System.out.println("Nama: "+ this.nama + "\nNo anggota: "+ this.noAnggota + "\nPeriode: "+ this.periode);
    }

    void menyetujuiAnggaran(){
        System.out.println(" Menyetujui anggaran ");
    }
    void menyetujuiPekerjaan(){
        System.out.println(" Menyetujui pekerjaan ");
    }
    void menyetujuiJadwal(){
        System.out.println(" Menyetujui jadwal ");
    }
    void menyetujuiKegiatan(){
        System.out.println(" Menyetujui kegiatan ");
    }
}