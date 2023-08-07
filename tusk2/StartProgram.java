import CopyFile.CopyExe;
import CreateFile.CreateFile;
import GetPathToFile.GetPathToFile;
import ReadFile.ReadTextFormat;
import WriteFile.WriteFile;

import java.io.IOException;

public class StartProgram
{
    public void startProgram()
    {
        GetPathToFile getPathToFile = new GetPathToFile();   // создание экземпляра для получение обсалютного пути к файлу
        String absolutePath = getPathToFile.getPathToFile(); // получили обсалютный путь к файлу

        CopyExe copyExe = new CopyExe();                     // копирование файла
        try {
            copyExe.copyExe(absolutePath);
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        CreateFile createFile = new CreateFile();        // создаём новый файл
        try {
            String newFileName  =  createFile.creteFile();
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        ReadTextFormat readTextFormat = new ReadTextFormat(); // читаем файл в текстовом формате
        try {
            readTextFormat.read(absolutePath);
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
        WriteFile writeFile = new WriteFile();                // записываем данные в файл
        try {
            writeFile.writeFile("D:/geek brains/Exceptions/DZ3/tusk2/example.txt");
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

    }
}

