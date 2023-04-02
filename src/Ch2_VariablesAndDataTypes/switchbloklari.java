package Ch2_VariablesAndDataTypes;

public class switchbloklari {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel geçtiniz");
                break;
            case 'C':
                System.out.println("iyi geçtiniz");
                break;
            case 'D':
                System.out.println("geçtiniz");
                break;
            default:
                System.out.println("geçersiz not girdiniz");
        }
    String choice = "xx";
        switch (choice) {
            case "latte" :
                System.out.println("latteniz hazır");
                break;
            case "macchiato":
                System.out.println("macchiatonuz hazır");
                break;
            case "cappuccino":
                System.out.println("cappuccinonuz hazır");
                break;
            default:
                System.out.println("kahveniz hazır.");

        }



    }
}
