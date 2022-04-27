import Model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {


        Perhitungan s = new Perhitungan(10, 18, 0) ;
        s.PrintJudul();
        int hasilTambah = s.HasilTbh(18, 19);
        System.out.println("Hasil tambah = "+hasilTambah);
        int HasilPerkalian = s.HasilKali(29, 99);
        System.out.println("Hasil Perkalian = "+HasilPerkalian);

        //Tugas / TM
        //Tampilkan hasil perhitungan dengan memanggil method yang ada pada
        //Perhitungan. java. Method yang dibuat, menerima parameter dan mengembalikan nilai (method with return).
        //Dikumpulkan Hari Sabru, 30 April 2022
        //hasil diemail ke aherijanto@mimoapps.xyz berupa github repo masing2 siswa
        //Subject email : TM_NIM_NAMALENGKAP_KELAS
        //e.g : TM_09897977_ARYHERIJANTO_2A
    }
}