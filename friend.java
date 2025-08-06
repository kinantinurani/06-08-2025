//Object Class
public class friend {
   //property class
    String nmLengkap;
    String sekolah;
    char jk;
    int umur;
    

    //constructor
    public friend(String n,
    String s, char j, int u){
        nmLengkap = n;
        sekolah = s;
        jk = j;
        umur =u;
    }
    //getter
    //setter
    //method
    public void cetak() {
      System.out.println(nmLengkap);
      System.out.println(sekolah);
      System.out.println(umur + "tahun");
      System.out.println("jenis kelamin : " + jk);
    }}
   
