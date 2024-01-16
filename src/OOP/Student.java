package OOP;

public class Student {


    //? class içerisinde değişken tanımlama - değişken field property

    public int id;
    public String isim;
    public String soyisim;

    private String cinsiyet; // dış dünyaya kapalı bu classtan erişilebilir.



   public Student (int id, String isim, String soyisim) {
        //? this şuan içerisinde bulunduğum class
       this.id=id;
       this.isim=isim;
       this.soyisim=soyisim;

   }

}
