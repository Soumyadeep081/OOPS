package L2;

public class AdminUser extends User {

    public AdminUser(String username, String email) {
        super(username, email);
    }

    public void manageProducts() {
        System.out.println("Admin is managing products");
    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser("Soumyadeep081", "soumyadeep323@gmail.com");
        au.login();
        au.showDashboard();
    }

    @Override
    public void showDashboard() {
        super.showDashboard();
        System.out.println("Admin user personalised dashboard");

    }
}