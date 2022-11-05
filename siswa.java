
public class siswa {
    public static void main(String[] args) throws Exception {
    }

    int nis;
    String nama;
    String jkl;
    String alamat;

    public siswa() {

    }

    public siswa(int nis, String nama) {
        this.nis = nis;
        this.nama = nama;
    }

    public siswa(int nis, String nama, String jkl, String alamat) {
        this.nis = nis;
        this.nama = nama;
        this.jkl = jkl;
        this.alamat = alamat;
    }

    public void cetak_siswa() {
        System.out.println("Nis = " + nis + "\n" + "Nama = " + nama + "\n" + "jkl = " + jkl + "\n");
    }

}
