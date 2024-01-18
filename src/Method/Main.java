package Method;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Ragil","G.211.21.2345");
        mahasiswa.show();
        mahasiswa.setNama("Diki");
        mahasiswa.show();

        System.out.println(mahasiswa.getName());
        System.out.println(mahasiswa.getNim());

        String data = mahasiswa.sayhii("ganteng");
        System.out.println(data);
    }


}
