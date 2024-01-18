package belajarClassObject;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Raja Dewantara";
        mahasiswa.nim = "G.211.24.54";
        mahasiswa.jurusan = "Teknik Informatika";
        mahasiswa.ipk = 4.0;
        mahasiswa.umur = 19;

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.nim);
        System.out.println(mahasiswa.jurusan);
        System.out.println(mahasiswa.ipk);
        System.out.println(mahasiswa.umur);

    }
}
