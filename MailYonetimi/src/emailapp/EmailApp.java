package emailapp;

public class EmailApp {

    public static void main(String[] args) {

        Email em1 = new Email("Berk", "Ekim"); //Şirkete giren kişiye şirket içinde kullanımı için mail ve şifre yaratıyoruz.
        //Email em2 = new Email("Calisan1", "Calisansoyadi");
//        Email em3 = new Email("Calisan2", "Calisansoyadi");
//        Email em4 = new Email("Calisan3", "Calisansoyadi");
//        Email em5 = new Email("Calisan4", "Calisansoyadi");
//        Email em6 = new Email("Calisan5", "Calisansoyadi");
//        Email em7 = new Email("Calisan6", "Calisansoyadi");
//        Email em8 = new Email("Calisan7", "Calisansoyadi");
//        Email em9 = new Email("Calisan8", "Calisansoyadi");
//        Email em10 = new Email("Calisan9", "Calisansoyadi");


        em1.setAlternateEmail("berkyedek@gmail.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1);


    }


}
