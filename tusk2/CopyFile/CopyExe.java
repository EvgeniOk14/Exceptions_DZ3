package CopyFile;

import CreateFile.CreateFile;
import ReadFile.ReadTextFormat;

import java.io.File;
import java.io.IOException;

public class CopyExe
{
    public void copyExe(String path) throws IOException
    {
            try {
                File source = new File(path);
                CreateFile createFile = new CreateFile();
                String newFilePath = createFile.creteFile(); // создали новый файл и передали путь к нему
                File dest = new File(newFilePath);

                CopyFile cf = new CopyFile();
                cf.copyFile(source, dest);

                ReadTextFormat readTextFormat = new ReadTextFormat(); // чтение нового созданного файла
                readTextFormat.read(newFilePath);

                System.out.println("Данные из файла путь: " + path + " скопированы новый файл: " + newFilePath);
            }
            catch (Exception e)
            {
                System.out.println("ошибка: " + e.getMessage());
            }
    }
}
