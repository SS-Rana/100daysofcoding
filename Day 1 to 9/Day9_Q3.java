class LoginDetail {
    String Username;
    int Password;
    String Email;
    LoginDetail() {
        this.Username = "";
        this.Password = 0;
        this.Email = "";
    }
    LoginDetail(LoginDetail detail){
        this.Username = detail.Username;
        this.Password = detail.Password;
        this.Email = detail.Email;
    }
    public void detailDisplay(){
        System.out.println("Username: "+this.Username);
        System.out.println("Password : "+this.Password);
        System.out.println("Email : "+this.Email);

    }

}
public class Day9_Q3 {
    public static void main(String[] args) {
        LoginDetail n1 = new LoginDetail();
        n1.Username = "Sumit";
        n1.Password =123456789;
        n1.Email = "xyz.gmail.com";
        LoginDetail n2 = new LoginDetail(n1);
        n2.detailDisplay();

    }
}
