package ArrayListExercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RegisteringSystemArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> registeredStudents = new ArrayList<>(Arrays.asList("omerokumus", "eminokumus", "pisipisi"));
        ArrayList<String> studentPassword = new ArrayList<>(Arrays.asList("12345", "qwaszx", "meow"));

        ArrayList<String> computerEngineeringLessons = new ArrayList<>(Arrays.asList("Mat-1", "Mat-2", "Fizik-1", "Fizik-2", "Digital Design", "Computer Programming-1", "Computer Programming-2", "Data Structures", "Algorithm Analysis"));
        ArrayList<String> ceAlınanDersler = new ArrayList<>(Arrays.asList("Mat-1", "Digital Design", "Computer Programming-1"));
        ArrayList<String> ceTaslakDersler = new ArrayList<>(Arrays.asList("Mat-2", "Fizik-1", " Data Structures"));

        ArrayList<String> mechanicEngineeringLessons = new ArrayList<>(Arrays.asList("Mat-1", "Mat-2", "Fizik-1", "Fizik-2", "Diferansiyel Denklemler", "Statik-1", "Statik-2", "Dinamik-1", "Dinamik-2", "Termodinamik", "İçten Yanmalı Motorlar"));
        ArrayList<String> meAlınanDersler = new ArrayList<>(Arrays.asList("Mat-1", "Fizik-1", "Diferansiyel Denklemler"));
        ArrayList<String> meTaslakDersler = new ArrayList<>(Arrays.asList("Mat-2", "Fizik-2", "Statik-1", "Dinamik-1"));


        ArrayList<String> literatureLessons = new ArrayList<>(Arrays.asList("Dilbilime Giriş", "İngiliz Kültürü", " Çeviri Uygulamaları", "Eski ve Ortaçağ İngiliz Edebiyatı", "16. ve 17. Yüzyıl İngiliz Edebiyatı", "18. yy İngiliz Romanı", "Kısa Öykü"));
        ArrayList<String> liAlınanDersler = new ArrayList<>(Arrays.asList("Dilbilime Giriş", "İngiliz Kültürü"));
        ArrayList<String> liTaslakDersler = new ArrayList<>(Arrays.asList("Çeviri Uygulamaları", "Eski ve Ortaçağ İngiliz Edebiyatı"));

        System.out.println("Kullanıcı adınız: ");
        String userName = scanner.nextLine();
        System.out.println("Şifreniz: ");
        String password = scanner.nextLine();

        if (registeredStudents.contains(userName)) {
            if (studentPassword.get(registeredStudents.indexOf(userName)).equals(password)) {
                System.out.println("Giriş Başarılı");
                ArrayList<String> seçenekler = new ArrayList<>(Arrays.asList("ders ekleme", "ders çıkarma", "programı sonlandır"));
                System.out.println(seçenekler);
                String neYapmakIstiyor = scanner.nextLine();

                if (neYapmakIstiyor.equals(seçenekler.get(0))) {
                    if (userName.equals(registeredStudents.get(0))) {
                        ArrayList<String> ceAlınabilecekDersler = (ArrayList<String>) computerEngineeringLessons.clone();
                        ceAlınabilecekDersler.removeAll(ceAlınanDersler);

                        System.out.println("Alabileceğiniz dersler: " + ceAlınabilecekDersler);
                        System.out.println("Birden fazla ders seçilirse seçilen dersler virgül ile ayrılmak zorundadır.");
                        String dersSecimi = scanner.nextLine();
                        String[] parts = dersSecimi.split(",");
                        ArrayList<String> secilenDersListesi = new ArrayList<>(Arrays.asList(parts));

                        boolean isSuccessful = true;
                        if (dersSecimi.contains("Mat-2") && !ceAlınanDersler.contains("Mat-1")) {
                            System.out.println("Mat-1'i tamamlamadığınız için Mat-2'yi alamazsınız.");
                            ceAlınabilecekDersler.remove("Mat-2");
                            System.out.println("Program sonlandırılıyor...");
                            isSuccessful = false;
                        }
                        if (dersSecimi.contains("Fizik-2") && !ceAlınanDersler.contains("Fizik-1")) {
                            System.out.println("Fizik-1'i tamamlamadığınız için Fizik-2'yi alamazsınız.");
                            ceAlınabilecekDersler.remove("Fizik-2");
                            System.out.println("Program sonlandırılıyor...");
                            isSuccessful = false;

                        }
                        if (dersSecimi.contains("Computer Programming-2") && !ceAlınanDersler.contains("Computer Programming-1")) {
                            System.out.println("Computer Programming-1'i tamamlamadığınız için Computer Programming-2'yi alamazsınız.");
                            ceAlınabilecekDersler.remove("Computer Programming-2");
                            System.out.println("Program sonlandırılıyor...");
                            isSuccessful = false;

                        }
                        if (secilenDersListesi.size() > 4 || secilenDersListesi.size() < 2) {
                            System.out.println("En fazla 4, en az 2 ders seçebilirsiniz.");
                            System.out.println("Program sonlandırılıyor...");
                            isSuccessful = false;

                        }
                        if (isSuccessful) {
                            System.out.println("Ders seçimi başarılı. Seçtiğiniz dersler: " + secilenDersListesi);
                            System.out.println("Program sonlandırılıyor...");
                        }

                    } else if (userName.equals(registeredStudents.get(1))) {
                        ArrayList<String> meAlınabilecekDersler = (ArrayList<String>) mechanicEngineeringLessons.clone();
                        meAlınabilecekDersler.removeAll(meAlınanDersler);

                        System.out.println("Alabileceğiniz dersler: " + meAlınabilecekDersler);
                        System.out.println("Birden fazla ders seçilirse seçilen dersler virgül ile ayrılmak zorundadır.");
                        String dersSecimi = scanner.nextLine();
                        String[] parts = dersSecimi.split(",");
                        ArrayList<String> secilenDersListesi = new ArrayList<>(Arrays.asList(parts));
                        boolean isSuccessful = true;
                        if (dersSecimi.contains("Dinamik-2") && !meAlınanDersler.contains("Dinamik-1")) {
                            System.out.println("Dinamik-1'i tamamlamadığınız için Dinamik-2'yi alamazsınız.");
                            meAlınabilecekDersler.remove("Dinamik-2");
                            System.out.println("Program sonlandırılıyor...");
                            isSuccessful = false;
                        }
                        if (dersSecimi.contains("Statik-2") && !meAlınanDersler.contains("Statik-1")) {
                            System.out.println("Statik-1'i tamamlamadığınız için Statik-2'yi alamazsınız.");
                            meAlınabilecekDersler.remove("Statik-2");
                            System.out.println("Program sonlandırılıyor.");
                            isSuccessful = false;

                        }
                        if (dersSecimi.contains("Mat-2") && !meAlınanDersler.contains("Mat-1")) {
                            System.out.println("Mat-1'i tamamlamadığınız için Mat-2'yi alamazsınız.");
                            meAlınabilecekDersler.remove("Mat-2");
                            System.out.println("Program sonlandırılıyor...");
                            isSuccessful = false;

                        }
                        if (dersSecimi.contains("Fizik-2") && !meAlınanDersler.contains("Fizik-1")) {
                            System.out.println("Fizik-1'i tamamlamadığınız için Fizik-2'yi alamazsınız.");
                            meAlınabilecekDersler.remove("Fizik-2");
                            System.out.println("Program sonlandırılıyor...");
                            isSuccessful = false;

                        } else {
                            System.out.println("Ders seçimi başarılı. Seçtiğiniz dersler: " + secilenDersListesi);
                            System.out.println("Program sonlandırılıyor...");
                        }
                    } else if (userName.equals(registeredStudents.get(2))) {
                        ArrayList<String> liAlınabilecekDersler = (ArrayList<String>) literatureLessons.clone();
                        liAlınabilecekDersler.removeAll(liAlınanDersler);
                        System.out.println("Alabileceğiniz dersler: " + liAlınabilecekDersler);
                        System.out.println("Birden fazla ders seçilirse seçilen dersler virgül ile ayrılmak zorundadır.");
                        String dersSecimi = scanner.nextLine();
                        String[] parts = dersSecimi.split(",");
                        ArrayList<String> secilenDersListesi = new ArrayList<>(Arrays.asList(parts));

                        if (secilenDersListesi.size() <= 4 && secilenDersListesi.size() >= 2) {
                            System.out.println("Ders seçimi başarılı. Seçtiğiniz dersler: " + secilenDersListesi);
                            System.out.println("Program sonlandırılıyor...");
                        }
                    }
                } else if (neYapmakIstiyor.equals(seçenekler.get(1))) {
                    if (userName.equals(registeredStudents.get(0))) {
                        System.out.println("Çıkartabileceğiniz dersler: " + ceTaslakDersler);
                        System.out.println("Birden fazla ders çıkartılırsa, dersler virgül ile ayrılmak zorundadır.");
                        String cıkarılacakdersler = scanner.nextLine();
                        String[] parts = cıkarılacakdersler.split(",");
                        ArrayList<String> cıkarılacakDersListesi = new ArrayList<>(Arrays.asList(parts));
                        int kalanDersSayısı = ceTaslakDersler.size() - cıkarılacakDersListesi.size();
                        if (kalanDersSayısı < 2) {
                            System.out.println("En az 2 ders almak zorundasınız. Bu sebeple en fazla " + (ceTaslakDersler.size() - 2) + " ders çıkartabilirsiniz.");
                            System.out.println("Program sonlandırılıyor...");
                        } else {
                            ceTaslakDersler.removeAll(cıkarılacakDersListesi);
                            System.out.println("Ders çıkartma işlemi başarılı. Kalan dersler: " + ceTaslakDersler);
                        }

                    } else if (userName.equals(registeredStudents.get(1))) {
                        System.out.println("Çıkartabileceğiniz dersler: " + meTaslakDersler);
                        System.out.println("Birden fazla ders çıkartılırsa, dersler virgül ile ayrılmak zorundadır.");
                        String cıkarılacakDersler = scanner.nextLine();
                        String[] parts = cıkarılacakDersler.split(",");
                        ArrayList<String> cıkarılacakDersListesi = new ArrayList<>(Arrays.asList(parts));
                        int kalanDersSayısı = meTaslakDersler.size() - cıkarılacakDersListesi.size();
                        if (kalanDersSayısı < 2) {
                            System.out.println("En az 2 ders almak zorundasınız. Bu sebeple en fazla " + (meTaslakDersler.size() - 2) + " ders çıkartabilirsiniz.");
                            System.out.println("Program sonlandırılıyor...");
                        } else {
                            meTaslakDersler.removeAll(cıkarılacakDersListesi);
                            System.out.println("Ders çıkartma işlemi başarılı. Kalan dersler: " + meTaslakDersler);
                        }
                    } else if (userName.equals(registeredStudents.get(2))) {
                        System.out.println("Çıkartabileceğiniz dersler: " + liTaslakDersler);
                        System.out.println("Birden fazla ders çıkartılırsa, dersler virgül ile ayrılmak zorundadır.");
                        String cıkarılacakDersler = scanner.nextLine();
                        String[] parts = cıkarılacakDersler.split(",");
                        ArrayList<String> cıkarılacakDersListesi = new ArrayList<>(Arrays.asList(parts));
                        int kalanDersSayısı = liTaslakDersler.size() - cıkarılacakDersListesi.size();
                        if (kalanDersSayısı < 2) {
                            System.out.println("En az 2 ders almak zorundasınız. Bu sebeple en fazla " + (liTaslakDersler.size() - 2) + " ders çıkartabilirsiniz.");
                            System.out.println("Program sonlandırılıyor...");
                        } else {
                            liTaslakDersler.removeAll(cıkarılacakDersListesi);
                            System.out.println("Ders çıkartma işlemi başarılı. Kalan dersler: " + liTaslakDersler);
                        }
                    }

                } else {
                    System.out.println("Program sonlandırılıyor...");
                }
            } else {
                System.out.println("Program sonlandırılıyor...");
            }

        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
        }
    }
}

//
//                if (neYapmakIstiyor.equals(seçenekler.get(0)) && userName.equals(registeredStudents.get(0))) {
//                    ArrayList<String> ceAlınabilecekDersler = (ArrayList<String>) computerEngineeringLessons.clone();
//                    ceAlınabilecekDersler.removeAll(ceAlınanDersler);
//
//                    System.out.println("Alabileceğiniz dersler: " + ceAlınabilecekDersler);
//                    System.out.println("Birden fazla ders seçilirse seçilen dersler virgül ile ayrılmak zorundadır.");
//                    String dersSecimi = scanner.nextLine();
//                    String[] parts = dersSecimi.split(",");
//                    ArrayList<String> secilenDersListesi = new ArrayList<>(Arrays.asList(parts));
//
//                    boolean isSuccessful = true;
//                    if (dersSecimi.contains("Mat-2") && !ceAlınanDersler.contains("Mat-1")) {
//                        System.out.println("Mat-1'i tamamlamadığınız için Mat-2'yi alamazsınız.");
//                        ceAlınabilecekDersler.remove("Mat-2");
//                        System.out.println("Program sonlandırılıyor...");
//                        isSuccessful = false;
//                    }
//                    if (dersSecimi.contains("Fizik-2") && !ceAlınanDersler.contains("Fizik-1")) {
//                        System.out.println("Fizik-1'i tamamlamadığınız için Fizik-2'yi alamazsınız.");
//                        ceAlınabilecekDersler.remove("Fizik-2");
//                        System.out.println("Program sonlandırılıyor...");
//                        isSuccessful = false;
//
//                    }
//                    if (dersSecimi.contains("Computer Programming-2") && !ceAlınanDersler.contains("Computer Programming-1")) {
//                        System.out.println("Computer Programming-1'i tamamlamadığınız için Computer Programming-2'yi alamazsınız.");
//                        ceAlınabilecekDersler.remove("Computer Programming-2");
//                        System.out.println("Program sonlandırılıyor...");
//                        isSuccessful = false;
//
//                    }
//                    if (secilenDersListesi.size() > 4 || secilenDersListesi.size() < 2) {
//                        System.out.println("En fazla 4, en az 2 ders seçebilirsiniz.");
//                        System.out.println("Program sonlandırılıyor...");
//                        isSuccessful = false;
//
//                    }
//                    if (isSuccessful) {
//                        System.out.println("Ders seçimi başarılı. Seçtiğiniz dersler: " + secilenDersListesi);
//                        System.out.println("Program sonlandırılıyor...");
//                    }
//
//
//                }
//                else if (neYapmakIstiyor.equals(seçenekler.get(1)) && userName.equals(registeredStudents.get(0))) {
//                    System.out.println("Çıkartabileceğiniz dersler: " + ceTaslakDersler);
//                    System.out.println("Birden fazla ders çıkartılırsa, dersler virgül ile ayrılmak zorundadır.");
//                    String cıkarılacakdersler = scanner.nextLine();
//                    String[] parts = cıkarılacakdersler.split(",");
//                    ArrayList<String> cıkarılacakDersListesi = new ArrayList<>(Arrays.asList(parts));
//                    int kalanDersSayısı = ceTaslakDersler.size() - cıkarılacakDersListesi.size();
//                    if (kalanDersSayısı < 2) {
//                        System.out.println("En az 2 ders almak zorundasınız. Bu sebeple en fazla " + (ceTaslakDersler.size() - 2) + " ders çıkartabilirsiniz.");
//                        System.out.println("Program sonlandırılıyor...");
//                    } else {
//                        ceTaslakDersler.removeAll(cıkarılacakDersListesi);
//                        System.out.println("Ders çıkartma işlemi başarılı. Kalan dersler: " + ceTaslakDersler);
//                    }


//                }
//                else if (neYapmakIstiyor.equals(seçenekler.get(2)) && userName.equals(registeredStudents.get(0))) {
//                    System.out.println("Program sonlandırılıyor...");
//                } else if (neYapmakIstiyor.equals(seçenekler.get(0)) && userName.equals(registeredStudents.get(1))) {
//                    System.out.println("Alabileceğiniz dersler: " + meAlınabilecekDersler);
//                    System.out.println("Birden fazla ders seçilirse seçilen dersler virgül ile ayrılmak zorundadır.");
//                    String dersSecimi = scanner.nextLine();
//                    String[] parts = dersSecimi.split(",");
//                    ArrayList<String> secilenDersListesi = new ArrayList<>(Arrays.asList(parts));
//
//                    if (dersSecimi.contains("Dinamik-2") && !meAlınanDersler.contains("Dinamik-1")) {
//                        System.out.println("Dinamik-1'i tamamlamadığınız için Dinamik-2'yi alamazsınız.");
//                        meAlınabilecekDersler.remove("Dinamik-2");
//                        System.out.println("Program sonlandırılıyor...");
//                    }
//                    if (dersSecimi.contains("Statik-2") && !meAlınanDersler.contains("Statik-1")) {
//                        System.out.println("Statik-1'i tamamlamadığınız için Statik-2'yi alamazsınız.");
//                        meAlınabilecekDersler.remove("Statik-2");
//                        System.out.println("Program sonlandırılıyor.");
//                    }
//                    if (dersSecimi.contains("Mat-2") && !meAlınanDersler.contains("Mat-1")) {
//                        System.out.println("Mat-1'i tamamlamadığınız için Mat-2'yi alamazsınız.");
//                        meAlınabilecekDersler.remove("Mat-2");
//                        System.out.println("Program sonlandırılıyor...");
//                    }
//                    if (dersSecimi.contains("Fizik-2") && !meAlınanDersler.contains("Fizik-1")) {
//                        System.out.println("Fizik-1'i tamamlamadığınız için Fizik-2'yi alamazsınız.");
//                        meAlınabilecekDersler.remove("Fizik-2");
//                        System.out.println("Program sonlandırılıyor...");
//                    }


//                } else if (neYapmakIstiyor.equals(seçenekler.get(1)) && userName.equals(registeredStudents.get(1))) {
//                    System.out.println("Çıkartabileceğiniz dersler: " + meTaslakDersler);
//                    System.out.println("Birden fazla ders çıkartılırsa, dersler virgül ile ayrılmak zorundadır.");
//                    String cıkarılacakdersler = scanner.nextLine();
//                    String[] parts = cıkarılacakdersler.split(",");
//                    ArrayList<String> cıkarılacakDersListesi = new ArrayList<>(Arrays.asList(parts));
//                    if (cıkarılacakDersListesi.size() > (meTaslakDersler.size() - 2)) {
//                        System.out.println("En az 2 ders almak zorundasınız. Bu sebeple en fazla " + (meTaslakDersler.size() - 2) + " ders çıkartabilirsiniz.");
//                        System.out.println("Program sonlandırılıyor...");
//                    }
