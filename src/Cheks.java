import java.util.Objects;

public class Cheks {

    public  static boolean CheckMethod(String login, String password, String confirmPassword){
try { CheckLogic(login, password, confirmPassword);

} catch (WrongLoginException | WrongPasswordException e) {
    return false;
}
        return true;
    }
    public static void CheckLogic(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        /*
    int character = 95;
   String symbol = String.valueOf((char) character);
        if (!Objects.equals(login, symbol)) throw new WrongLoginException("ok");

        int character1 = 95;
        String symbol1 = String.valueOf((char) character1);
        if (!Objects.equals(password, symbol1)) throw new WrongPasswordException("ok");

        if ((login.length() > 20))
            throw new WrongLoginException("Много символов или отсутствет -");
        if ((password.length() > 20))
            throw new WrongPasswordException("Много символов или отсутствет -");


        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Ваш пароль не подтвержден, подтвердите пожалуйста");

        if (password != confirmPassword) throw  new WrongPasswordException("не верно");

        for (char letter = 65; letter <= 90; letter++){
            if (!login.equals(String.valueOf(letter)))
                throw new WrongLoginException("не подходит");
        }

        for (char letter = 97; letter <= 122; letter++){
            if (!login.equals(String.valueOf(letter)))
                throw new WrongLoginException("не подходит");
        }

        for (char letter = 48; letter <= 57; letter++){
            if (!login.equals(String.valueOf(letter)))
                throw new WrongLoginException("не подходит");
        }

        for (char letter = 97; letter <= 122; letter++){
            if (!password.equals(String.valueOf(letter)))
                throw new WrongPasswordException("не подходит");
        }

        for (char letter = 48; letter <= 57; letter++){
            if (!password.equals(String.valueOf(letter)))
                throw new WrongPasswordException("не подходит");
        }
        for (char letter = 65; letter <= 90; letter++){
            if (!password.equals(String.valueOf(letter)))
                throw new WrongPasswordException("не подходит");
        }


         */

        if ((login.length() > 20))
            throw new WrongLoginException("Много символов или отсутствет -");
        if ((password.length() > 20))
            throw new WrongPasswordException("Много символов или отсутствет -");


        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Ваш пароль не подтвержден, подтвердите пожалуйста");


        String symbols = "1234567890_qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM.";
        for (int i = 0; i < login.length(); i++) {

            if (!symbols.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Ваш логин не подтвержден, подтвердите пожалуйста");
            }
          }

        for (int j = 0; j < password.length(); j++) {
            if (!symbols.contains(String.valueOf(password.charAt(j)))) {
             throw new WrongPasswordException("Ваш пароль не подтвержден, подтвердите пожалуйста");
        }
        }


    }

}
/*
  for (int i = 0; i < login.length(); i++) {
        char charac = login.charAt(i);
        if (!(charac >= 'A' && charac <= 'Z') && !(charac >= 'a' && charac <= 'z')) {
        throw new WrongLoginException("Ваш логин не подтвержден, подтвердите пожалуйста");
        }
        if (!(charac >= '0' && charac <= '9'));
        }
        for (int j = 0; j < password.length(); j++) {
        char charac1 = login.charAt(j);
        if (!(charac1 >= 'A' && charac1 <= 'Z') && !(charac1 >= 'a' && charac1 <= 'z'))
        //    throw new WrongPasswordException("Ваш пароль не подтвержден, подтвердите пожалуйста");
        if (!(charac1 >= '0' && charac1 <= '9'));
        // throw new WrongPasswordException("Ваш пароль не подтвержден, подтвердите пожалуйста");
        }

 */