package OOP;

public class StudentTest {
    //? bir sınıfın içerisindeki değişkenlere ileşebilmek için o classtan nesne üretmemiz gerekiyor. New kelimesiyle
    public static void main(String[] args) {

        //? Constructor yapıcı metot

        Student student1 = new Student(5, "ebru", "okumus");

     //   student1.id=5;
       // student1.isim="Enes";
       // student1.soyisim="Bayram";


        System.out.println("Öğrencinin bilgileri: ");
        System.out.println("id: "+student1.id);
        System.out.println("isim: "+student1.isim);
        System.out.println("soyisim: "+student1.soyisim);
    }

}
