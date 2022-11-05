import java.util.Scanner;

public class classMainAPP {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        siswa siswa = new siswa(12312, "Heri Wijayanto");
        siswa.cetak_siswa();
        System.out.println("=======input data matapelajaran=======");
        nilai nilai = new nilai();
        System.out.print("kode matapelajaran= ");
        nilai.kdmt = obj.nextLine();
        System.out.print("nama pelajar= ");
        nilai.nmmt = obj.nextLine();
        System.out.println("=======Data Matapelajaran=======");
        nilai.cetakmt();
        System.out.println("=======Data Nilai======");
        System.out.print("Nilai Absen= ");
        nilai.nilai_absen = obj.nextInt();
        System.out.print("Nilai Tugas= ");
        nilai.nilai_tugas = obj.nextInt();
        System.out.print("Nilai UTS= ");
        nilai.nilai_uts = obj.nextInt();
        System.out.print("Nilai UAS= ");
        nilai.nilai_uas = obj.nextInt();
        nilai.addnilai();
        System.out.println("=======Status Nilai=======");
        nilai.getRata_Rata();
        nilai.cetak_nilai();
        System.out.println("==============");
        nilai.cetak_status();

    }
}
