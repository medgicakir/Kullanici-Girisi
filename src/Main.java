import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adı giriniz:");
        username=inp.nextLine();

        System.out.println("Şifre giriniz:");
        password=inp.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız.");
        }
        else{
            System.out.println("Hatalı giriş yaptınız.Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            System.out.println("Seçiminiz:");
            int secim= inp.nextInt();

            if(secim==1){
                Scanner input=new Scanner(System.in);
                System.out.print("Yeni şifreyi giriniz:");
                String newpassword=input.nextLine();

                if(newpassword.equals("java123") && newpassword.equals("password")){
                    System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz:");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }

        }

    }
}