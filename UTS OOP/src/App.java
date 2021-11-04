public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota Karishma = new Anggota("Karishma", "15");
        Karishma.display();

        System.out.println("#################################");
        // b. 1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua Sekar = new Ketua("Sekar", "01", "2019/2020");
        Sekar.display();
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia Yudiantara = new KetuaPanitia("taracn", "02", "2020/2021");
        Yudiantara.display();
    }
}