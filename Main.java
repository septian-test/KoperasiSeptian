public class Main {

  
    public static void main(String[] args) {

        Koperasi anggota1 = new Koperasi("PBO-01", "Septian Ramdanu");                       
        Koperasi anggota2 = new Koperasi("PBO-02", "Adi Kusuma Wijaya");  
        Koperasi anggota3 = new Koperasi("PBO_03", "Pratomo Siregar");
        
        Anggota rek1 = new Anggota(anggota1, "Rek-01");
        Anggota rek2 = new Anggota(anggota1, "Rek-02");
        Anggota rek3 = new Anggota(anggota2, "Rek-03"); 
        Anggota rek4 = new Anggota(anggota3, "Rek-04");
        
        Rekening mutasiRek1 = new Rekening();
        Rekening mutasiRek2 = new Rekening();
        Rekening mutasiRek3 = new Rekening();
        Rekening mutasiRek4 = new Rekening();
       
        mutasiRek1.tambahSaldo(rek1, 50000);
        mutasiRek1.tambahSaldo(rek1, 30000);
        mutasiRek1.ambilSaldo(rek1, 90000);
        
        mutasiRek2.tambahSaldo(rek2, 30000);
        mutasiRek3.tambahSaldo(rek3, 70000);
        mutasiRek4.tambahSaldo(rek4, 20000);
                
        mutasiRek1.showSaldo();
        mutasiRek2.showSaldo();
        mutasiRek3.showSaldo();
        mutasiRek4.showSaldo();

    }

}