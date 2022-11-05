public class nilai extends matapelajaran {
    public static void main(String[] args) throws Exception {
    }

    int nilai_absen;
    int nilai_tugas;
    int nilai_uts;
    int nilai_uas;

    double addnilai() {
        double total_nilai = (nilai_absen + nilai_tugas + nilai_uts + nilai_uas);
        return total_nilai;
    }

    double getRata_Rata() {
        double Rata_Rata = (addnilai()) / 4;
        return Rata_Rata;
    }

    void cetak_nilai() {
        System.out.println("Total nilai= " + addnilai());
        System.out.println("Nilai rata-rata= " + getRata_Rata());
    }

    void cetak_status() {
        if (getRata_Rata() >= nilailulus) {
            System.out.println("Anda lulus dengan nilai= " + getRata_Rata());
        } else {
            System.out.println("nilai anda= " + getRata_Rata() + ",anda dinyatakan belum lulus");
        }
    }
}
