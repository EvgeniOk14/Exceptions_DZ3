import Exceptions.LengthPasswordException;
import Exceptions.NotDigitException;
import Exceptions.NotUpperCaseException;

public class PasswordVerifier
{

    public void checkPassLength() throws LengthPasswordException, NotDigitException, NotUpperCaseException {

        System.out.println("Введите пароль: ");
        FileScanner sc = new FileScanner();
        String password = sc.fileScanner();
        boolean passLength = false;
        if (password.length() > 8)
        {
            boolean number = false;
            boolean upper = false;
            for (int i = 0; i < password.length(); i++)
            {
                if (Character.isDigit(password.charAt(i)))
                {
                    number = true;
                }

                if (Character.isUpperCase(password.charAt(i)))
                {
                    upper = true;
                }
                if (number && upper)
                {
                    break;
                }

            }


            if (!number)
            {
                throw new NotDigitException("Пароль не содержит ни одного числа! ");
            }
            if (!upper)
            {
                throw new NotUpperCaseException("Пароль не содержит ни одной заглавной буквы! ");
            }
        }
            else
            {
                throw new LengthPasswordException("Длина пароля меньше допустимого! ");
            }
        System.out.println("Поздравляю! Вы ввели верный пароль! ");
    }

}




