/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Client
 */
public class Guru {
    public String nama;
    public String mapel;
    public int umur;
}
    class Jenis extends Guru{
    public void tampil(){
        System.out.println(" Nama Guru SMK Telkom Malang ");
    }    
}
class Guru1 extends Guru{
    public Guru1(String nama, String mapel, int umur){
    this.nama = nama;
    this.mapel = mapel;
    this.umur = umur;
    }
    public void tampil(){
        System.out.println("\n============================");
        System.out.println("Nama : " +nama);
        System.out.println("Mapel : "+mapel);
        System.out.println("Umur : "+umur);
    }
}
    class Guru2 extends Guru{
    public Guru2(String nama,String mapel, int umur){
        this.nama = nama;
        this.mapel = mapel;
        this.umur = umur;
    }

    public void tampil(){
        System.out.println("\n============================");
        System.out.println("Nama : " +nama);
        System.out.println("Mapel : "+mapel);
        System.out.println("Umur : "+umur);
    }
    }
    class Guru3 extends Guru{
    public Guru3(String nama,String mapel,int umur){
        this.nama = nama;
        this.mapel = mapel;
        this.umur = umur;
    }

    public void tampil(){
        System.out.println("\n============================");
        System.out.println("Nama : " +nama);
        System.out.println("Mapel : "+mapel);
        System.out.println("Umur : "+umur);
    }
}
class TestGuru {
    public static void main(String[] args) {
        Guru gr = new Guru();
        Jenis jn = new Jenis();
        Guru1 Pz = new Guru1("Pak Zakaria", "Produktif", 21);
        Guru2 Bs = new Guru2("Bu Seno", "Inggris", 27);
        Guru3 Pa = new Guru3("Pak Arifin", "Produktif", 26);
        
        jn.tampil();
        Pz.tampil();
        Bs.tampil();
        Pa.tampil();
    }
}

    

    
    

