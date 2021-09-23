 class koki{
    String nama, jeniskelamin, station;
    Integer id, umur;
    void getId(Integer newid){
        id = newid;
    }
    void getNama(String newnama){
        nama = newnama;
    }
    void getJeniskelamin(String newkelamin){
        jeniskelamin = newkelamin;
    }
    void getUmur(Integer newumur){
        umur = newumur;
    }
    void setStation(String newstation){
        station = newstation;
    }
    Integer bacaid(){
        return id;
    }
    String bacanama(){
        return "Nama Koki : " + nama;
    }
    String bacakelamin(){
        return "Jenis Kelamin : " + jeniskelamin;
    }
    Integer bacaumur(){
        return umur;
    }
    String bacastation(){
        return "Station : " + station;
    }
}
class dapurrestoran{
    String namaresto, namachef;
    Integer iddapur;
    void setIdDapur(Integer newdapur){ 
        iddapur = newdapur;
    }
    void setNamaResto(String newresto){
        namaresto = newresto;
    }
    void setNamaChef(String newchef){
        namachef = newchef;
    }
    Integer bacaiddapur(){
        return iddapur;
    } 
    String bacarestoran(){
        return "Nama Restoran : " + namaresto;
    }   
    String bacaheadchef(){
        return "Nama Kepala Koki : " + namachef;
    }
}
public class TugasObject {
    public static void main(String[] args){
        koki koki1 = new koki();
        System.out.println("********** Data Koki **********");
        koki1.getId(16);
        System.out.println("ID Koki : "+koki1.bacaid());
        koki1.getNama("Nada Dewata");
        System.out.println(koki1.bacanama());
        koki1.getJeniskelamin("Pria");
        System.out.println(koki1.bacakelamin());
        koki1.getUmur(20);
        System.out.println("Umur Koki : "+koki1.bacaumur());
        koki1.setStation("Vegetable");
        System.out.println("----------------------------------");
        System.out.println(" ");
        System.out.println("********** Data Restoran **********");
        System.out.println(koki1.bacastation());
        dapurrestoran dapurrestoran1 = new dapurrestoran();
        dapurrestoran1.setIdDapur(3);
        System.out.println("ID Dapur Restoran : "+dapurrestoran1.bacaiddapur());
        dapurrestoran1.setNamaResto("Papuma Resto");
        System.out.println(dapurrestoran1.bacarestoran());
        dapurrestoran1.setNamaChef("Yukihira Souma");
        System.out.println(dapurrestoran1.bacaheadchef());
        System.out.println("-----------------------------------");
    }
}
