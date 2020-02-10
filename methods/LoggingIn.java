package methods;

public class LoggingIn {
    public static boolean logInMethod(String username, String password){
        String validUserName = "james123";
        String validPassWord = "password";
        if(validUserName.equals(username) && validPassWord.equals(password) ){
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(logInMethod("james123","password"));
    }
}
