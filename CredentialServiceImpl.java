import java.util.Random;

public class CredentialServiceImpl implements CredentialService {
    Random random = new Random();
    private final int PASSWORD_LENGTH = 8;
    public String generateAndSetEmailAddress (Employee employee) {
        String emailaddress = employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartment()+".gl.com";
        employee.setEmailAddress(emailaddress);
        return emailaddress;
    }
    public String generateAndSetPassword (Employee employee) {
        String password ="";
        for (int i =0; i<PASSWORD_LENGTH;i++) {
            password =password + ALL_PASSWORD_CHARS.charAt(random.nextInt(ALL_PASSWORD_CHARS.length())); 
        }
        employee.setPassword(password);
        return password;
    }
    public void showCredentials(Employee employee) {
        System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
        System.out.println("Email   ---> " +employee.getEmailAddress());
        System.out.println("Password   ---> " +employee.getPassword());
    }
}
