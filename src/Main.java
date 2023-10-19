public class Main {
    public static void main(String[] args) {
      IDandPasswords idpasswords = new IDandPasswords();

      LoginPage loginPage = new LoginPage(idpasswords.getLoginInfo());
    }
}