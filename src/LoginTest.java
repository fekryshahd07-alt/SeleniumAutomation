public class LoginTest {
    @Test
    public void testValidLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("demouser", "testingisfun99");
        // هنا نضيف الـ Assert للتأكد من نجاح الدخول
    }
public class LoginTest {
    @Test
    public void testValidLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("demouser", "testingisfun99");
        // هنا نضيف الـ Assert للتأكد من نجاح الدخول
    }
}