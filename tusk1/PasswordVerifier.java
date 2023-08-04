import Exceptions.LengthPasswordException;
import Exceptions.NotDigitException;
import Exceptions.NotUpperCaseException;

public class PasswordVerifier
{
    public void checkPassLength(String password) throws LengthPasswordException, NotDigitException, NotUpperCaseException {

        if (password.length() <= 8)
        {
            throw new LengthPasswordException("Длина пароля меньше допустимого! ");
        }
        boolean number = false;
        boolean upper = false;
        for(int i=0; i < password.length(); i++)
        {
                if (Character.isDigit(password.charAt(i)) )
                    {
                        number = true;
                        break;
                    }

                if (Character.isUpperCase(password.charAt(i)))
                    {
                        upper = true;
                        break;
                    }

        }
        if(number)
        {
            throw new NotDigitException("Пароль не содержит ни одного числа! ");
        }
        if(upper)
        {
            throw new NotUpperCaseException("Пароль не содержит ни одной заглавной буквы! ");
        }
        System.out.println("Вы ввели верный пароль! ");
    }
}
