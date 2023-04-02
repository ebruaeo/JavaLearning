package topics;

public class StringWorks {
    public static void main(String[] args) {
        // 1- length()
        String s1 ="Java programming";
        System.out.println("s1'in uzunluğu: " + s1.length()); //değişken ile kullanmak
        System.out.println("esra".length());//string ile kullanmak
        int len = s1.length();

        // 2- charAt(index): Herhangi bir indexteki karakteri verir.
        String s2 = "programming exercises";
        char firstLetter = s2.charAt(0);
        System.out.println(firstLetter);
        System.out.println("esra".charAt(0));

        int lastIndex = s2.length()-1;
        char lastLetter = s2.charAt(lastIndex);
        System.out.println(lastIndex);
        System.out.println(lastLetter);

        // StringIndexOutOfBoundsException
       // System.out.println(s2.charAt(1000));

        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println("  java   ".trim());

        String ömüş="pc müh";
        System.out.println(ömüş.length()-1);


        // 4.4.7 Comparing Strings
        // case-sensitivity: büyük harf ile küçük harfin farklı olması
        //              Örn; "java" ve "Java" aynı değildir. Çünkü J harfi büyüktür.

        // 1- equalsIgnoreCase
        String j1 = "java", j2 = "Java";
        System.out.println("j1.equals(j2): " + j1.equals(j2)); // case-sensitive kontrol
        System.out.println("j1.equalsIgnoreCase(j2): " + j1.equalsIgnoreCase(j2)); // case-insensitive kontrol


        // 2- compareTo: kıyaslama yapıp büyük ya da küçük ya da eşit olduğunu anlamamızı sağlar
        // negatif sayı verirse soldaki sağdakinden küçüktür, sıfır verirse eşit, pozitif verirse büyüktür
        String s3 = "abc", s4 = "ğhı", s5 = "abc";
        System.out.println("abc compareTo ğhı:" + s3.compareTo(s4)); // s3 soldaki, s4 sağdaki
        System.out.println("abc compareTo abc: " + s3.compareTo(s5));
        System.out.println("ğhı compareTo abc: " + s4.compareTo(s3));
        if (s3.compareTo(s4) < 0) {
            System.out.println("abc stringi ğhı stringinden küçüktür");
        }

        // 3- compareToIgnoreCase kıyas yaparken büyük küçük harflere bakmaz (case-insensitive)

        // 4- startsWith: bir stringin başka bir stringle başlayıp başlamadığını kontrol eder. True ya da false döndürür
        // Örn; bir URL'nin https:// ile başlaması gerekir
        String url1 = "https://www.ömüşebruyuseviyo.com";

        if (url1.startsWith("https://")) {
            System.out.println("url1 geçerli bir URL'dir");
        } else {
            System.out.println("url1 geçerli bir URL değildir");
        }

        String url2 = "http://www.ömüşçokparfümsıkmışdayakyiycekmiş.com";
        String prefix = "https://";
        if (url2.startsWith(prefix)) {
            System.out.println("url2 güvenli bir URL'dir");
        } else if (url2.startsWith("http://")) {
            System.out.println("url2 güvenli bir URL değildir");
        } else {
            System.out.println("url2 geçerli bir URL değildir");
        }

        // 5- endsWith: bir stringin başka bir string ile bitip bitmediğini kontrol eder. True ya da false döndürür
        // Örn; .com ile biten url'ler commercial, .org ile biten url'ler ise organizational url olur
        String url3 = "www.google.com";
        String url4 = "www.unicef.org";

        String org = ".org";
        String com = ".com";
        if (url3.endsWith(com)) {
            System.out.println("url3 commercial bir URL'dir");
        }
        if (url4.endsWith(org)) {
            System.out.println("url4 organizational bir URL'dir");
        }

        // 6- contains: bir stringin içinde başka bir string olup olmadığını kontrol eder. True ya da false döndürür

        String text = "However, the == operator checks only whether string1 and string2 refer to the same object";
        if (text.contains("==")) {
            System.out.println("text includes ==");
        }

        // 4.4.8 Obtaining Substrings
        String s6 = "www.google.com";
        System.out.println(s6.substring(4));

        String suffix1 = s6.substring(s6.length()-4); // son 4 harfi almak istediğimiz için 4 çıkarttık
        System.out.println(suffix1);

        System.out.println(s6.substring(4, s6.length()-4)); // 4. indexten başla son 4 harf hariç al


        // 4.4.9 Finding a Character or a Substring in a String
        // 1- indexOf: verilen karakterin/stringin ilk indexini döndürür. Eğer yoksa -1 döndürür
        String s7 = "www.googlele.com";
        System.out.println("first index of g: " + s7.indexOf('g'));
        System.out.println("second index of g: " + s7.indexOf('g', 5)); // 5 1. g'nin index değerinin 1 fazlası

        System.out.println("first index of go: " + s7.indexOf("go"));

        System.out.println("index of xx: " + s7.indexOf("xx"));

        // 2- lastIndexOf: verilen karakterin/stringin son indexini döndürür. Yoksa -1 döndürür
        System.out.println("last index of g: " + s7.lastIndexOf('g'));
        System.out.println("last index of le: " + s7.lastIndexOf("le"));

        // CTRL-F örneği: lorem texti oluştur. içine 2 tane google kelimesi koy. Bu google kelimelerini büyük harfe çevirip
        // texti o şekilde ekrana bastır

        // replace
        String s9 = "I like Java programming";
        s9 = s9.replace('i', 'I');
        System.out.println("s9: " + s9);

        s9 = s9.replaceFirst("a", "A");
        System.out.println("s9: " + s9);

        // karakter silme
        s9 = s9.replaceFirst("a", "");
        System.out.println("s9: " + s9);

    }
}
