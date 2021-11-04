public class Koordinator extends Panitia {
    Koordinator(String noAnggota, String nama, String periode) {
        super(noAnggota, nama, periode);
        //TODO Auto-generated constructor stub
    }
    void membuatLaporan(){
        System.out.println(" Membuat laporan ");
    }
    void menghapusLaporan(){
        System.out.println(" Menghapus laporan ");
    }
    void membuatPekerjaan(){
        System.out.println(" Membuat pekerjaan ");
    }
    void menghapusPekerjaan(){
        System.out.println(" Menghapus pekerjaan ");
    }
    void membuatJadwal(){
        System.out.println(" Membuat jadwal ");
    }
    void menghapusJadwal(){
        System.out.println(" Menghapus jadwal ");
    }
}
