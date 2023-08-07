package GetPathToFile;

import java.io.File;

public class GetPathToFile
{
    public String getPathToFile()
    {
        try
        {
            String PathProject = System.getProperty("user.dir");
            String pathFile = PathProject.concat("/probaExceptions.txt");
            File file = new File(pathFile);
            String absolutePath = file.getAbsolutePath();
            System.out.println(absolutePath);
            return absolutePath;
        }
        catch (Exception e)
        {
            System.out.println("ошибка: " + e.getMessage());
        }
        return null;
    }
}
