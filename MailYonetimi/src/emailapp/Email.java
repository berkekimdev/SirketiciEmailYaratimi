package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int defaultPasswordLength = 10; //final belirtebilirdik fakat sonradan değiştirebilmek daha mantıklı.
    private int mailboxCapacity =500;  //final belirtebilirdik fakat sonradan değiştirebilmek daha mantıklı.
    private String alternateEmail;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) { //Kullanıcıdan isim ve soyisim istenerek oluşturuyoruz.

        this.firstName= firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " + this.firstName + " "+ this.lastName);
        this.department= setDepartment();
        System.out.println("Department " + this.department);

        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."  +companySuffix; //burda mail oluşuyor.

        System.out.println("Your email is: " + email);






    }

    private String setDepartment() {
        System.out.println("DEPARTMANT CODES\n1 for Sales \n2 for Development \n3 for Accounting\n0 for none \nEnter department code: ");//kullanıcıya seçimi sorduk.
        Scanner tara = new Scanner(System.in);
        int depChoice= tara.nextInt();
        if(depChoice==1) {
            return "sales";
        }
        else if(depChoice==2) {
            return "dev";

        }else if(depChoice==3) {
            return "acct";

        }
        else {
            return "";
        }

    }


    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%"; //alfabe ve özel karakterlerden random seçebilmek için bir string ifade oluşturduk.
        char[] tempPassword = new char[length];
        for(int i=0; i<length; i++) {
            int rand = (int) (Math.random()* passwordSet.length()); //Math kütüphanesinin random özelliğini kullanarak string ifademizin maksimum boyutu kadar olacak bir int değer döndürdü.
            tempPassword[i] = passwordSet.charAt(rand); //String ifademizdeki karakterler ile şifremiz oluşturuluyor.
        }
        return new String(tempPassword);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity= capacity;
    } //sonradan kapasite değiştirmek istersek diye set metodu ekliyoruz.(private kullanıp dışarı açabilmemiz için)
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail= alternateEmail;
    }//alternatif mail isterse kullanici bu metod ile oluşturabilir.
    public void changePassword(String password) {
        this.password= password;
    } //şirketin otomatik atadığı şifreyi sonradan değiştirebiliyor.


    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() { // alternatif  maili okumak için oluşturduğumuz metod.
        if (alternateEmail == null) { //alternatif  mail girilmediyse bunun kontrolü.
            return "No alternate email set";
        }else
            return alternateEmail; }
    public String getPassword() { return password;}


    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", defaultPasswordLength=" + defaultPasswordLength +
                ", mailboxCapacity=" + mailboxCapacity +
                ", alternateEmail='" + getAlternateEmail() + '\'' +
                ", companySuffix='" + companySuffix + '\'' +
                '}';
    }
}
