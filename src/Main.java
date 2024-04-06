
import java.security.SecureRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String password=generatePassword(12);
        System.out.println("generated Password" + password);
    }
    public static String generatePassword(int length){
        StringBuilder password=new StringBuilder();
        SecureRandom random=new SecureRandom();

        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower=upper.toLowerCase();
        String digits="0123456789";
        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        String allCharacters=upper+lower+digits+special;
        for(int i=0;i<length;i++){
            int randomIndex=random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }
        return password.toString();
    }
}