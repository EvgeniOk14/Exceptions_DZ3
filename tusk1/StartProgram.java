import Exceptions.LengthPasswordException;
import Exceptions.NotDigitException;
import Exceptions.NotUpperCaseException;

public class StartProgram
{
    public void startProgram()
    {
        InfoTablo infoTablo = new InfoTablo();
        infoTablo.infotablo();
//      FileScanner fileScanner = new FileScanner();
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        try
        {
            try
            {
                try
                {
                    passwordVerifier.checkPassLength();
                }
                catch (NotUpperCaseException e)
                {
                    System.out.println("ошибка: " + e.getMessage());;
                }
            }
            catch (NotDigitException e)
            {
                System.out.println("ошибка: " + e.getMessage());;
            }
        }
        catch (LengthPasswordException e)
        {
            System.out.println("Ошибка: " + e.getMessage());;
        }
    }
}
