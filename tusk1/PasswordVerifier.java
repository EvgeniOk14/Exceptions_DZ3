import Exceptions.LengthPasswordException;
import Exceptions.NotDigitException;
import Exceptions.NotUpperCaseException;

public class PasswordVerifier
{
    public void checkPassLength(String password) throws LengthPasswordException, NotDigitException, NotUpperCaseException {
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
                    throw new NotDigitException("Пароль не содержит ни одного числа!\n ");
                }
            if (!upper)
                {
                    throw new NotUpperCaseException("Пароль не содержит ни одной заглавной буквы!\n ");
                }
        }
            else
                {
                    throw new LengthPasswordException("Длина пароля меньше допустимого!\n ");
                }
        System.out.println("Поздравляю! Вы ввели верный пароль! ");
    }

}




