import Exceptions.LengthPasswordException;
import Exceptions.NotDigitException;
import Exceptions.NotUpperCaseException;

public class StartProgram
{
    private boolean flag = true;
    public void startProgram()
    {
        InfoTablo infoTablo = new InfoTablo();
        infoTablo.infotablo();
        while (flag)
        {
            System.out.println("Ведите пароль: ");
            FileScanner fs = new FileScanner();
            String password = fs.fileScanner();
            PasswordVerifier passwordVerifier = new PasswordVerifier();
            try
            {
                try
                {
                    try
                    {
                       passwordVerifier.checkPassLength(password);
                        System.out.println("Пароль принят, доступ разрешён! ");
                        flag = false;
                        break;
                    }
                    catch (NotUpperCaseException e)
                    {
                        System.out.println("ошибка: " + e.getMessage());

                    }
                }
                catch (NotDigitException e)
                {
                    System.out.println("ошибка: " + e.getMessage());

                }
            }
            catch (LengthPasswordException e)
            {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
